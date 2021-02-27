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
public class mainfibo {
    public static void main(String[] args) {
        dequy fb = new dequy ();
        System.out.println("Số fibo ở vị trí 10 là: "+fb.calcfibo(10));
        for(int i=1; i<=10; i++){
            System.out.println(fb.calcfibo(i) );
        }
    
    }
}
