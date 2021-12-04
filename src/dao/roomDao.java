package dao;

import entity.Room;

import java.sql.*;

public class roomDao {
    public static int add(Room r){
        int id = 0;
        String sql1 = "INSERT INTO spmdb.room (name, type, seat) VALUES (?,?,?);";
        try {
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);

            pstmd.setString(1, r.getName());
            pstmd.setString(2, r.getType());
            pstmd.setString(3, r.getSeat());

            pstmd.executeUpdate();
            ResultSet resultSet = pstmd.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getInt(1);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return id;
    }

    public static boolean update(Room r){
        String sql = "UPDATE spmdb.room SET name=?,type=?,seat=? WHERE rid = ?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setString(1, r.getName());
            pstmd.setString(2, r.getType());
            pstmd.setString(3, r.getSeat());
            pstmd.setInt(4, r.getRid());

            return pstmd.execute();

        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean delete(int rid){
        String sql1 = "delete from spmdb.room WHERE rid = ?;";
        String sql2 = "delete from spmdb.experiment WHERE rid = ?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql1);
            pstmd.setInt(1, rid);

            if(!pstmd.execute()){
                return false;
            }
            pstmd.close();

            pstmd = connection.prepareStatement(sql2);
            pstmd.setInt(1, rid);
            return pstmd.execute();

        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static Room[] search(Room r){
        boolean c = false;
        int num_room = 0;
        Room[] rooms = null;
        String sql = "SELECT * FROM spmdb.room WHERE";
        if(r.getRid()!=0){
            sql += " rid="+r.getRid();
            c = true;
        }
        if(r.getName()!=null){
            if(c){
                sql += " AND";
            }
            sql += " name="+r.getName();
            c = true;
        }
        if(r.getType()!=null){
            if(c){
                sql += " AND";
            }
            sql += " type="+r.getType();
            c = true;
        }
        if(r.getSeat()!=null){
            if(c){
                sql += " AND";
            }
            sql += " seat="+r.getSeat();
        }
        sql+= ";";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            ResultSet resultSet = pstmd.executeQuery();
            while (resultSet.next()){
                num_room++;
            }
            if(num_room==0){
                return null;
            }
            resultSet.beforeFirst();
            rooms = new Room[num_room];
            for (int i=0;i<num_room;i++){
                resultSet.next();
                rooms[i] = new Room(resultSet.getInt("rid"),resultSet.getString("name"),
                        resultSet.getString("type"),resultSet.getString("seat"));
            }
            return rooms;
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }
}
