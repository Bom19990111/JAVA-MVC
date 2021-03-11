/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsp;

/**
 *
 * @author Nhat Thinh
 */
public class RunProduct {
    public static void main(String[] args) {
        truonghop2();
    }
    
    public static void truonghop1() {
        ProductController sc = new ProductController(new ProductView());
        sc.nhapsanpham();
        sc.hien_thi_danh_sach_san_pham();
        sc.tim_kiem_sp_theo_ten();
        sc.xoasanphamtheoten();

    }

    public static void truonghop2() {
        MenuController menu = new MenuController(new ProductController(new ProductView()),
                new MenuView());
        menu.lua_chon_menu();
    }
    
    
}
