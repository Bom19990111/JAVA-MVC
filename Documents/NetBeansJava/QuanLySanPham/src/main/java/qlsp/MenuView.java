/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsp;

import java.util.Scanner;

/**
 *
 * @author Nhat Thinh
 */
public class MenuView {
    public MenuView() {
    }

    public int hien_thi_menu() {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("1. Nhap du lieu san pham");
        System.out.println("2. Tim kiem san pham theo ten");
        System.out.println("3. xoa san pham theo ten");
        System.out.println("4. xem danh sach san pham");
        System.out.println("5. Thoat chung trinh");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Nhap so ban muon chon");
        Scanner sc = new Scanner(System.in);
        int kq = Integer.parseInt(sc.nextLine());
        return kq;
    }
}
