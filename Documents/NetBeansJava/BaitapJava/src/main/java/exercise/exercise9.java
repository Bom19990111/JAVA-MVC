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
public class exercise9 implements ex9_1 {

    private double a, b, x;
    private String resuilt;

    public exercise9() {
    }

    public exercise9(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public String getResuilt() {
        return resuilt;
    }

    public void setResuilt(String resuilt) {
        this.resuilt = resuilt;
    }

    @Override
    public void giaiphuongtrinh() {
        if (a != 0) {
            x = -b / a;
            resuilt = "Phương trình bậc nhất có nghiệm là: " + x;
        } else {
            if (b != 0) {
                resuilt = "Phương trình vô nghiệm";
            } else {
                resuilt = "Phương trình vô số nghiệm";
            }

        }
    }

    @Override
    public String toString() {
        if (resuilt == null || resuilt.isEmpty()) {
            giaiphuongtrinh();
        }
        return resuilt;
    }

}
