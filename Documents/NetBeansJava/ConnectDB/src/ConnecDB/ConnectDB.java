/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnecDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nhat Thinh
 */
public class ConnectDB {

    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306/wordpress";
        var user = "root";
        var password = "";
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Kết nối thành công");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
