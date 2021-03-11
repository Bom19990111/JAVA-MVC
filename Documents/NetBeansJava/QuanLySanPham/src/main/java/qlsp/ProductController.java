/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsp;

import java.util.ArrayList;
import java.util.function.UnaryOperator;

/**
 *
 * @author Nhat Thinh
 */
public class ProductController {

    private ArrayList<Product> product;
    private ProductView productview;

    public ProductController() {
        this.product = new ArrayList<>();
    }

    public ProductController(ArrayList<Product> product) {
        this.product = product;
    }

    public ProductController(ProductView productview) {
        this.productview = productview;
    }

    public void nhapsanpham() {
        Product product = this.productview.themsanpham();
        product.addproduct();
    }
    
    public void nhapnhieusanpham() {
        this.product = this.productview.nhapnhieusanpham();
        for (Product sv : product) {
            sv.addproduct();
        }
    }

    public void hien_thi_danh_sach_san_pham() {
        this.product = new Product().listproduct();
        this.productview.hien_thi_danh_sach_san_pham(this.product);
    }
    
    
    private ArrayList<Product> tim_sp_theo_ten(ArrayList<Product> product, String productname) {
        ArrayList<Product> result = new ArrayList<>(); 

        for (Product sp : product) {
            if (sp.getTensanpham().contains(productname)) {
                result.add(sp);
            }

        }
        return result;
    }

    public void tim_kiem_sp_theo_ten() {
        String productname = this.productview.nhap_tensp_can_tim();
        ArrayList<Product> kq = tim_sp_theo_ten(product,productname);
        this.productview.ket_qua_tim_kiem(kq);
    }
    
    
    
    private ArrayList<Product> xoasanpham(ArrayList<Product> product, String productname) {
        ArrayList<Product> result = new ArrayList<>(); 

        for (Product sp : product) {
            if (sp.getTensanpham().contains(productname)) {
                result.remove(sp);
            }

        }
        return result;
    }

    public void xoasanphamtheoten() {
        String productname = this.productview.nhap_tensp_can_xoa();
        ArrayList<Product> kq = xoasanpham(product,productname);
        this.productview.ket_qua_xoa(product, productname);
    }
    
//    private ArrayList<Product> suasanpham(ArrayList<Product> product, String productname) {
//        ArrayList<Product> result = new ArrayList<>(); 
//
//        for (Product sp : product) {
//            if (sp.getTensanpham().contains(productname)) {
//                result.replaceAll((UnaryOperator<Product>) sp);
//            }
//
//        }
//        return result;
//    }
//
//    public void suasanpham() {
//        String productname = this.productview.nhap_san_pham_can_sua();
//        ArrayList<Product> kq = suasanpham(product,productname);
//        this.productview.ket_qua_sua(product, productname);
//    }
}
