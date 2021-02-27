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
public class dequy {

    public dequy() {
    }

    public int calcfibo(int n) {
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return (calcfibo(n - 1) + calcfibo(n - 2));
    }
}
