/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nhat Thinh
 */
public class ConnectDB {

    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/qlsp",
                    "root", "trannhatthinh20")) {
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery("select * from sanpham");
                while (rs.next()) {
                    System.out.println(rs.getInt("id_sanpham") + "  " + rs.getString("tensanpham") + "  " + rs.getString("masanpham")
                            + "  " + rs.getString("loaisanpham") + "  " + rs.getInt("soluong") + "  " + rs.getString("tinhtrang"));
                }
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


}
