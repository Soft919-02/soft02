package dao;

import entity.Administer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class administerDao {
    public static Administer login(String account, String password){
        Administer administer = null;
        String sql = "SELECT * FROM spmdb.administer WHERE account=? AND password=?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setString(1,account);
            pstmd.setString(2,password);

            ResultSet resultSet = pstmd.executeQuery();
            if (resultSet.next()) {
                administer = new Administer(resultSet.getString("account"),resultSet.getString("password"));
            }
            return administer;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static boolean update(Administer a){
        String sql = "UPDATE spmdb.teacher SET password=? WHERE account=?;";
        try{
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql);
            pstmd.setString(1,a.getPassword());
            pstmd.setString(2,a.getAccount());

            return pstmd.execute();

        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }

    public static boolean add(Administer t){
        String sql1 = "INSERT INTO spmdb.teacher (account, password) VALUES (?,?);";
        try {
            Connection connection = Init.init();
            PreparedStatement pstmd = connection.prepareStatement(sql1, Statement.RETURN_GENERATED_KEYS);

            pstmd.setString(1, t.getAccount());
            pstmd.setString(2, t.getPassword());

            return pstmd.execute();
        } catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
