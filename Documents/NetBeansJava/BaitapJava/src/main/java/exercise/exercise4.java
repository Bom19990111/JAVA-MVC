/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import static java.lang.Math.pow;

/**
 *
 * @author Nhat Thinh
 */
public class exercise4 {
    private int r, x, y;

    public exercise4() {
    }

    public exercise4(int r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public exercise4(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    

    public double calC() {
    double resuil = 2*Math.PI* this.r;
    return resuil;
}
    
    public double calS() {
    double resuil = Math.PI*pow(this.r,2);
    return resuil;
}

    @Override
    public String toString() {
        String output = "Chu vi hình tròn là: " +calC()+"\n"+
                "Diện tích hình tròn là: "+calS();
       return output;
    }
    
}
