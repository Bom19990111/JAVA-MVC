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
public class exercise9_2 implements ex9_1 {

    private double a, b, c, x1, x2;
    private String resuilt;

    public exercise9_2() {
    }

    public exercise9_2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    

    @Override
    public void giaiphuongtrinh() {
        if (a == 0) {
            exercise9 ptb1 = new exercise9(b, c);
            ptb1.giaiphuongtrinh();
            resuilt = ptb1.getResuilt();
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                resuilt = "Phương trình vô nghiệm";
            } else {
                if (delta == 0) {
                    x1 = -b / (2 * a);
                    resuilt = "Phương trình có 1 nghiệm: " + x1;
                } else {
                    x1 = (-b + Math.sqrt(delta)) / (2 * a);
                    x2 = (-b - Math.sqrt(delta)) / (2 * a);
                    resuilt = "Phương trình có 2 nghiệm pb là: " + x1 + " và " + x2;
                }
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
