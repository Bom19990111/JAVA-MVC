/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nhat Thinh
 */
public class Product {

    private int id_sanpham;
    private String tensanpham;
    private String masanpham;
    private String loaisanpham;
    private int soluong;
    private String tinhtrang;

    public Product() {
    }

    public Product(String tensanpham, String masanpham, String loaisanpham, int soluong, String tinhtrang) {
        this.tensanpham = tensanpham;
        this.masanpham = masanpham;
        this.loaisanpham = loaisanpham;
        this.soluong = soluong;
        this.tinhtrang = tinhtrang;
    }

    public Product(int id_sanpham, String tensanpham, String masanpham, String loaisanpham, int soluong, String tinhtrang) {
        this.id_sanpham = id_sanpham;
        this.tensanpham = tensanpham;
        this.masanpham = masanpham;
        this.loaisanpham = loaisanpham;
        this.soluong = soluong;
        this.tinhtrang = tinhtrang;
    }

    public int getId_sanpham() {
        return id_sanpham;
    }

    public void setId_sanpham(int id_sanpham) {
        this.id_sanpham = id_sanpham;
    }

    public String getTensanpham() {
        return tensanpham;
    }

    public void setTensanpham(String tensanpham) {
        this.tensanpham = tensanpham;
    }

    public String getMasanpham() {
        return masanpham;
    }

    public void setMasanpham(String masanpham) {
        this.masanpham = masanpham;
    }

    public String getLoaisanpham() {
        return loaisanpham;
    }

    public void setLoaisanpham(String loaisanpham) {
        this.loaisanpham = loaisanpham;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

//    ================================KET NOI DB=================================
    public Connection connectcsdl() {
        Connection connect = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/qlsp",
                    "root", "trannhatthinh20");
            return connect;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connect;
    }

//    --------------------------THEM SAN PHAM----------------------------
    public void addproduct() {
        try {
            Connection connect = connectcsdl();
            String query = " insert into sanpham (tensanpham, masanpham, loaisanpham, soluong, tinhtrang) values (?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, this.tensanpham);
            preparedStmt.setString(2, this.masanpham);
            preparedStmt.setString(3, this.loaisanpham);
            preparedStmt.setInt(4, this.soluong);
            preparedStmt.setString(5, this.tinhtrang);

            preparedStmt.execute();

            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //    --------------------------XOA SAN PHAM----------------------------
    public void deleteproduct() {
        try {
            Connection connect = connectcsdl();
            String query = "delete from sanpham where id_sanpham= ?";

            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setInt(1, this.id_sanpham);

            preparedStmt.execute();

            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //    --------------------------SUA SAN PHAM----------------------------
    public void updateproduct() {
        try {
            Connection connect = connectcsdl();
            String query = "update student set tensanpham = ?, masanpham = ?, soluong = ?, loaisanpham = ?, tinhtrang =? ";

            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, this.tensanpham);
            preparedStmt.setString(2, this.masanpham);
            preparedStmt.setString(3, this.loaisanpham);
            preparedStmt.setInt(4, this.soluong);
            preparedStmt.setString(5, this.tinhtrang);

            preparedStmt.execute();

            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //---------------------------TIM KIEM SAN PHAM THEO TEN----------------------------
    public void findproduct() {
        try {
            Connection connect = connectcsdl();
            String query = "select * from sanpham where tensanpham like ?";

            PreparedStatement preparedStmt = connect.prepareStatement(query);
            preparedStmt.setString(1, "%" +tensanpham + "%");

            preparedStmt.execute();

            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //---------------------------DANH SACH SAN PHAM----------------------------
    public ArrayList<Product> listproduct() {
        ArrayList<Product> result = new ArrayList<>();
        try {
            Connection connect = connectcsdl();
            Statement stmt = connect.createStatement();
            ResultSet listproduct = stmt.executeQuery("select * from sanpham");
            while (listproduct.next()) {
                Product sp = new Product(
                        listproduct.getString("tensanpham"),
                        listproduct.getString("masanpham"),
                        listproduct.getString("loaisanpham"),
                        listproduct.getInt("soluong"),
                        listproduct.getString("tinhtrang")
                );
                result.add(sp);
            }
            connect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

//    -------------------------------------------------------------------------
    @Override
    public String toString() {
        return "Product{" + "id_sanpham=" + id_sanpham + ", tensanpham=" + tensanpham + ", masanpham=" + masanpham + ", loaisanpham=" + loaisanpham + ", soluong=" + soluong + ", tinhtrang=" + tinhtrang + '}';
    }

}
