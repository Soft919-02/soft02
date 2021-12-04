package dao;

import entity.Experiment;
import entity.Teacher;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class experimentDao {
    public static Experiment[] search(Experiment e,Boolean isShared){
        boolean c = false;
        int num_experiment = 0;
        Experiment[] experiments = null;
        String sql = "SELECT * FROM spmdb.experiment WHERE";
        if(e.getEid()!=0){
            sql += " eid="+e.getEid();
            c = true;
        }
        if(e.getTid()!=0){
            if(c){
                sql += " AND";
            }
            sql += " tid="+e.getTid();
            c = true;
        }
        if(e.getRid()!=0){
            if(c){
                sql += " AND";
            }
            sql += " rid="+e.getRid();
            c = true;
        }
        if(e.getName()!=null){
            if(c){
                sql += " AND";
            }
            sql += " name="+e.getName();
            c = true;
        }
        if(e.getSubject()!=null){
            if(c){
                sql += " AND";
            }
            sql += " subject="+e.getSubject();
            c = true;
        }
        if(e.getTime()!=null){
            if(c){
                sql += " AND";
            }
            sql += " time="+e.getTime();
            c = true;
        }
        if(e.getStudyTime()!=0){
            if(c){
                sql += " AND";
            }
            sql += " studyTime="+e.getStudyTime();
            c = true;
        }
        if(isShared!=null){
            if(c){
                sql += " AND";
            }
            sql += " isShared="+isShared;
            c = true;
        }
        if(e.getPhone()!=null){
            if(c){
                sql += " AND";
            }
            sql += " phone="+e.getPhone();
        }
        sql+= ";";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            ResultSet resultSet = pstmd.executeQuery();
            while (resultSet.next()){
                num_experiment++;
            }
            resultSet.beforeFirst();
            if(num_experiment==0){
                return null;
            }
            experiments = new Experiment[num_experiment];
            for (int i=0;i<num_experiment;i++){
                resultSet.next();
                experiments[i] = new Experiment(resultSet.getInt("eid"),resultSet.getInt("tid"),
                        resultSet.getInt("rid"), resultSet.getString("name"),
                        resultSet.getString("subject"), resultSet.getString("time"),
                        resultSet.getInt("studyTime"), resultSet.getNString("seat"),
                        resultSet.getBoolean("isShared"), resultSet.getString("phone") );
            }
            return experiments;
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }//boolean有初始值，故单独输入
    public static Experiment[] search(Experiment e){
        Boolean isShared = null;
        return search(e, isShared);
    }

    public static int add(Experiment e){
        int id = 0;
        String sql1 = "INSERT INTO spmdb.experiment (tid, rid, name, subject, time, studyTime, seat, isShared, phone)" +
                " VALUES (?,?,?,?,?,?,?,?,?);";
        try {
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);

            pstmd.setInt(1, e.getTid());
            pstmd.setInt(2, e.getRid());
            pstmd.setString(3, e.getName());
            pstmd.setString(4, e.getSubject());
            pstmd.setString(5, e.getTime());
            pstmd.setInt(6, e.getStudyTime());
            pstmd.setString(7, e.getSeat());
            pstmd.setBoolean(8, e.isShared());
            pstmd.setString(9, e.getPhone());

            pstmd.executeUpdate();
            ResultSet resultSet = pstmd.getGeneratedKeys();
            if (resultSet.next()) {
                id = resultSet.getInt(1);
            }
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return id;
    }

    public static boolean update(Experiment e){
        String sql = "UPDATE spmdb.experiment SET tid=?,rid=?, name=?, subject=?, time=?, studyTime=?, " +
                "seat=?, isShared=?, phone=?  WHERE eid = ?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setInt(1, e.getTid());
            pstmd.setInt(2, e.getRid());
            pstmd.setString(3, e.getName());
            pstmd.setString(4, e.getSubject());
            pstmd.setString(5, e.getTime());
            pstmd.setInt(6, e.getStudyTime());
            pstmd.setString(7, e.getSeat());
            pstmd.setBoolean(8, e.isShared());
            pstmd.setString(9, e.getPhone());
            pstmd.setInt(10,e.getEid());

            return pstmd.execute();

        } catch (Exception exception){
            exception.printStackTrace();
        }
        return false;
    }

    public static boolean delete(int eid){
        String sql = "delete from spmdb.experiment WHERE eid = ?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setInt(1, eid);

            return pstmd.execute();

        } catch (Exception exception){
            exception.printStackTrace();
        }
        return false;
    }
    public static boolean delete(Experiment e){
        return delete(e.getEid());
    }
}
