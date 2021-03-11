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
public class MenuController {

    private ProductController sp_contrl;
    private MenuView mnview;

    public MenuController() {
    }

    public MenuController(ProductController sp_contrl) {
        this.sp_contrl = sp_contrl;
    }

    public MenuController(ProductController sp_contrl, MenuView mnview) {
        this.sp_contrl = sp_contrl;
        this.mnview = mnview;
    }

    public void lua_chon_menu() {
        boolean flag = true;
        while (flag) {
            int kq = mnview.hien_thi_menu();
            switch (kq) {
                case 1:
                    sp_contrl.nhapnhieusanpham();
                    break;
                case 2:
                    sp_contrl.tim_kiem_sp_theo_ten();
                    break;
                case 3:
                    sp_contrl.xoasanphamtheoten();
                    break;
                case 4:
                    sp_contrl.hien_thi_danh_sach_san_pham();
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }

    }
}
