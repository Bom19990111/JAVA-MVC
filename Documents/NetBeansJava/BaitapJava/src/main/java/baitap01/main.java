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
    }

    public static void kich_ban_1() {
        StudentController sv = new StudentController(new StudentView());
        sv.nhap_du_lieu_sinh_vien();
        sv.hien_thi_sinh_vien();
    }

    public static void kich_ban_2() {
        StudentController sv = new StudentController(new StudentView());
        sv.lua_chon_menu();
        sv.nhap_danh_sach_sinh_vien();
        sv.hien_thi_danh_sach_sinh_vien();
        sv.tim_kiem_sv_theo_sdt();
        sv.tim_sv_theo_ten();
    }

}
