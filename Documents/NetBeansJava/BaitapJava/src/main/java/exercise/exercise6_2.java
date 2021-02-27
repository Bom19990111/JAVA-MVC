/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Date;

/**
 *
 * @author Nhat Thinh
 */
public class exercise6_2 extends exercise6 implements exercise8{
    private String thanhpho, truonghoc;

    public exercise6_2() {
    }

    public exercise6_2(String thanhpho, String truonghoc, String hoten, String gioitinh, String diachi, Date ngaysinh, int tuoi) {
        super(hoten, gioitinh, diachi, ngaysinh, tuoi);
        this.thanhpho = thanhpho;
        this.truonghoc = truonghoc;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getTruonghoc() {
        return truonghoc;
    }

    public void setTruonghoc(String truonghoc) {
        this.truonghoc = truonghoc;
    }

    @Override
    public double calcX(double income) {
        double tax;
        tax = 0.01*income;
        return tax;
    }

   
    
    
    
    
}
