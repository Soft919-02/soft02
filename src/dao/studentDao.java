package dao;

import entity.Experiment;
import entity.Student;
import entity.StudentExperiment;

import java.sql.*;
import java.util.Arrays;

public class studentDao {

    public static Student login(String account, String password){
        Student student = null;
        String sql = "SELECT * FROM spmdb.student WHERE account=? AND password=?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setString(1,account);
            pstmd.setString(2,password);

            ResultSet resultSet = pstmd.executeQuery();
            if (resultSet.next()) {
                student = new Student(resultSet.getInt("sid"),resultSet.getString("account")
                        ,resultSet.getString("password"),resultSet.getString("clas"));
            }
            return student;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static StudentExperiment[] getExperiments(int sid){
        int num_experiment = 0;
        StudentExperiment[] experiments = null;
        Experiment e = null;
        String sql = "SELECT * FROM spmdb.student_has_experiment,spmdb.experiment" +
                " WHERE student_sid=? AND experiment_eid=eid;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql,ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            pstmd.setInt(1,sid);

            ResultSet resultSet = pstmd.executeQuery();
            while (resultSet.next()){
                num_experiment++;
            }
            resultSet.beforeFirst();
            if(num_experiment==0){
                return null;
            }
            experiments = new StudentExperiment[num_experiment];
            for (int i=0;i<num_experiment;i++){
                resultSet.next();
                e = new Experiment(resultSet.getInt("eid"),resultSet.getInt("tid"),
                        resultSet.getInt("rid"), resultSet.getString("name"),
                        resultSet.getString("subject"), resultSet.getString("time"),
                        resultSet.getInt("studyTime"), resultSet.getNString("seat"),
                        resultSet.getBoolean("isShared"), resultSet.getString("phone"));
                experiments[i] = new StudentExperiment(resultSet.getInt("seat"), e);
            }
            return experiments;
        } catch (Exception exception){
            exception.printStackTrace();
        }
        return null;
    }

    public static boolean update(Student s){
        String sql = "UPDATE spmdb.student SET account=?,password=?,clas=? WHERE sid = ?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setString(1,s.getAccount());
            pstmd.setString(2,s.getPassword());
            pstmd.setString(3,s.getClas());
            pstmd.setInt(4, s.getSid());

            return pstmd.execute();

        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static int add(Student s){
        int id = 0;
        String sql = "INSERT INTO spmdb.student (account, password, clas) VALUES (?,?,?);";
        try {
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);

            pstmd.setString(1, s.getAccount());
            pstmd.setString(2,s.getPassword());
            pstmd.setString(3,s.getClas());

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

    public static boolean addExperiments(int sid, int eid){
        String sql = "INSERT INTO spmdb.student_has_experiment (student_sid, experiment_eid, seat) VALUES (?,?,?);";
        try {
            int s = -1;
            Experiment e = new Experiment(eid,0,0,null,null,null,0,null,false,null);
            Experiment[] experiments = experimentDao.search(e);
            e=experiments[0];
            char[] seat = e.getSeat().toCharArray();
            for (int i=0;i< seat.length;i++){
                if(seat[i]=='1'){
                    seat[i]='2';
                    s=i;
                }
            }

            if(s==-1){
                return false;
            }
            e.setSeat(Arrays.toString(seat));
            experimentDao.update(e);

            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);

            pstmd.setInt(1, sid);
            pstmd.setInt(2, eid);
            pstmd.setInt(3, s);

            return pstmd.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

}
