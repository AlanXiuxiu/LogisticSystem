//package test;
//
//import java.sql.*;
//
///**
// * Created by 向光性 on 2017/7/10.
// */
//public class JDBCTest {
//    public static void main(String[] args) {
////      1.注册驱动
//        Connection conn = null;
//        Statement statement = null;
//        ResultSet res = null;
//        try {
//            Driver driver = new com.mysql.jdbc.Driver();
//            DriverManager.registerDriver(driver);
//            String url = "jdbc:mysql://localhost:3306/mydb?characterEncoding=utf8&useSSL=false";
//            String user = "root";
//            String password = "1108";
//            conn = DriverManager.getConnection(url, user, password);
//            statement = conn.createStatement();
//
//            String sql = "select * from reposity";
//
//            res = statement.executeQuery(sql);
//
//            while (res.next()) {
//                String name = res.getString("name");
//                System.out.println(name);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            if (res != null) {
//                try {
//                    res.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//    }
//}