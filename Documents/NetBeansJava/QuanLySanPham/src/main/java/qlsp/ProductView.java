/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nhat Thinh
 */
public class ProductView {

    public ProductView() {
    }

//    ********************************************************************
    public Product themsanpham() {
        System.out.println("================================");
        System.out.println("Tên sản phẩm: ");
        Scanner sc = new Scanner(System.in);
        String productname = sc.nextLine();
        System.out.println("Mã sản phẩm: ");
        String productcode = sc.nextLine();
        System.out.println("Loại sản phẩm: ");
        String producttype = sc.nextLine();
        System.out.println("Số lượng: ");
        int productamount = Integer.parseInt(sc.nextLine());
        System.out.println("Tình trạng: ");
        String productstatus = sc.nextLine();
        Product sp = new Product(productname, productcode, producttype, productamount, productstatus);
        System.out.println("-----------------------------------");
        return sp;
    }

    public void hienthisanpham(Product x) {
        System.out.println("==================================");
        System.out.println(x.toString());
        System.out.println("==================================");
    }

    //    ********************************************************************
    public ArrayList<Product> nhapnhieusanpham() {
        ArrayList<Product> result = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Ban co muon nhap du lieu khong? (y/n)");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ("n".equals(answer) || "N".equals(answer)) {
                flag = false;
            } else {
                Product sp = themsanpham();
                result.add(sp);
            }
        }
        return result;
    }

    public void hien_thi_danh_sach_san_pham(ArrayList<Product> product) {

        System.out.println("-------------------------------");
        for (Product sp : product) {
            System.out.println(sp.toString());
        }
        System.out.println("==============================");
    }

    //    ********************************************************************
    public String nhap_tensp_can_tim() {
        System.out.println("------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham can tim kiem: ");
        String productname = sc.nextLine();
        System.out.println("+++++++++++++++++++++++");
        return productname;
    }

    public void ket_qua_tim_kiem(ArrayList<Product> product) {
        System.out.println("+++++++++++++++++++++++");
        if (product.isEmpty()) {
            System.out.println("Khong tim thay san pham");
        } else {
            for (Product sp : product) {
                System.out.println(sp.toString());
            }
        }
        System.out.println("*********************");
    }

    public String nhap_tensp_can_xoa() {
        System.out.println("------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham muon xoa: ");
        String productname = sc.nextLine();
        System.out.println("+++++++++++++++++++++++");
        return productname;
    }

    public ArrayList<Product> ket_qua_xoa(ArrayList<Product> product, String productname) {
        ArrayList<Product> resuilt = new ArrayList<>();
        System.out.println("+++++++++++++++++++++++");
        if (product.isEmpty()) {
            System.out.println("Khong tim thay san pham");
        } else {
            boolean flag = true;
            while (flag) {
                System.out.println("Ban co muon xoa san pham nay khong? (yes/no)");
                Scanner sc = new Scanner(System.in);
                String answer = sc.nextLine();
                if ("no".equals(answer) || "NO".equals(answer)) {
                    flag = false;
                } else {
                    for (Product sp : product) {
                        if (sp.getTensanpham().contains(productname)) {
                            resuilt.remove(sp);
                        }
                    }
                    System.out.println("san pham da duoc xoa");
                }
            }
        }
        return resuilt;
    }

//    public String nhap_san_pham_can_sua() {
//        System.out.println("------------------------");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap ten san pham ban muon sua: ");
//        String productname = sc.nextLine();
//        System.out.println("+++++++++++++++++++++++");
//        return productname;
//    }
//
//    public void ket_qua_sua(ArrayList<Product> product, String productname) {
//        ArrayList<Product> resuilt = new ArrayList<>();
//        System.out.println("+++++++++++++++++++++++");
//        if (product.isEmpty()) {
//            System.out.println("Khong tim thay san pham ban can sua");
//        } else {
//            for (Product sp : product) {
//                if (sp.getTensanpham().contains(productname)) {
//                    System.out.println(sp.toString());
//                }
//            }
//        }
//    }
}
