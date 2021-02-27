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
public class exercise6_3 extends exercise6 implements exercise8{
    private int luong;
    private String congty;

    public exercise6_3() {
    }

    public exercise6_3(int luong, String congty, String hoten, String gioitinh, String diachi, Date ngaysinh, int tuoi) {
        super(hoten, gioitinh, diachi, ngaysinh, tuoi);
        this.luong = luong;
        this.congty = congty;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }

    @Override
    public double calcX(double income) {
        return (0.04*income);
    }
    
}
