package dao;

import java.sql.*;

import db.createdb;

public class Init {
    private static final String URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USER_NAME = "root";
    private static final String PASSWORD = "vz512.GYK";

    public static Connection init() throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");//新老版本不一致
        return DriverManager.getConnection(URL, USER_NAME, PASSWORD);
    }

    public static void create(){
        try {
            for (int i=0; i<createdb.length();i++){
                String sql = createdb.str(i);
                Connection connection = init();
                PreparedStatement pstmd = connection.prepareStatement(sql);
                pstmd.execute();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
