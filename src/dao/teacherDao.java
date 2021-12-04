package dao;

import java.sql.*;

import entity.Experiment;
import entity.Teacher;

public class teacherDao {
    public static Teacher login(String account, String password){
        Teacher teacher = null;
        String sql = "SELECT * FROM spmdb.teacher WHERE account=? AND password=?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setString(1,account);
            pstmd.setString(2,password);

            ResultSet resultSet = pstmd.executeQuery();
            if (resultSet.next()) {
                teacher = new Teacher(resultSet.getInt("tid"),
                        resultSet.getString("account"),resultSet.getString("password"));
            }
            return teacher;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static Experiment[] getExperiments(int tid){
        int num_experiment = 0;
        Experiment[] experiments = null;
        Experiment e = null;
        String sql = "SELECT * FROM spmdb.teacher natural join spmdb.experiment WHERE tid=?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pstmd.setInt(1,tid);

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
                e = new Experiment(resultSet.getInt("eid"),resultSet.getInt("tid"),
                        resultSet.getInt("rid"), resultSet.getString("name"),
                        resultSet.getString("subject"), resultSet.getString("time"),
                        resultSet.getInt("studyTime"),  resultSet.getNString("seat"),
                        resultSet.getBoolean("isShared"), resultSet.getString("phone") );
                experiments[i] = e;
            }
            return experiments;
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    public static boolean update(Teacher t){
        String sql = "UPDATE spmdb.teacher SET account=?,password=? WHERE tid = ?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setString(1,t.getAccount());
            pstmd.setString(2,t.getPassword());
            pstmd.setInt(3, t.getTid());

            return pstmd.execute();

        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static int add(Teacher t){
        int id = 0;
        String sql1 = "INSERT INTO spmdb.teacher (account, password) VALUES (?,?);";
        try {
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql1,Statement.RETURN_GENERATED_KEYS);

            pstmd.setString(1, t.getAccount());
            pstmd.setString(2, t.getPassword());

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

}
