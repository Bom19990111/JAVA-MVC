/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

/**
 *
 * @author Nhat Thinh
 */
public class main {

    public static void main(String[] args) {
        kich_ban_1();
        kich_ban_2();
        kich_ban_3();
    }

    public static void kich_ban_1() {
        StudentController sv = new StudentController(new StudentView());
        sv.nhap_du_lieu_sinh_vien();
        sv.hien_thi_sinh_vien();
    }

    public static void kich_ban_2() {
        StudentController sv = new StudentController(new StudentView());
        sv.nhap_danh_sach_sinh_vien();
        sv.hien_thi_danh_sach_sinh_vien();
    }

    public static void kich_ban_3() {
        StudentController sv = new StudentController(new StudentView());
        sv.timkiemsdt();

    }
}
