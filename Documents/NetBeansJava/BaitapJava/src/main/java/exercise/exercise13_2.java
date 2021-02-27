/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author Nhat Thinh
 */
public class exercise13_2 {
    private String tensp;
    private int soluong;

    public exercise13_2() {
    }

    public exercise13_2(String tensp, int soluong) {
        this.tensp = tensp;
        this.soluong = soluong;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "exercise13_2{" + "tensp=" + tensp + ", soluong=" + soluong + '}';
    }
    
    
    
}
