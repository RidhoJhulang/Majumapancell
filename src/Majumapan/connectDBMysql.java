/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Majumapan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aqsha
 */
public class connectDBMysql {

    private static Connection mysqlconnect;

    public static Connection connectDB() {
        if (mysqlconnect == null) {
            try {
                String DB = "jdbc:mysql://localhost:3306/majumapancell";
                String user = "root";
                String pass = "";
                mysqlconnect = DriverManager.getConnection(DB, user, pass);
                System.out.println("Success connect to database");
            } catch (SQLException e) {
                System.out.println("Error connect to database: " + e.getMessage());
            }
        }
        return mysqlconnect;
    }

    public static void main(String[] args) {
        connectDB();
        new Home().setVisible(true);
    }
}

