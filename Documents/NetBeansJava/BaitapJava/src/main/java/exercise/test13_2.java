/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Arrays;

/**
 *
 * @author Nhat Thinh
 */
public class test13_2 {

    public static void main(String[] args) {
        exercise13_2[] tam = new exercise13_2[]{
            new exercise13_2("Dầu gió", 20),
            new exercise13_2("Sữa tắm", 25),
            new exercise13_2("Dầu gội", 35),
            new exercise13_2("Body", 15)
        };
        System.out.println("Mảng ban đầu là");
        System.out.println(Arrays.toString(tam));
        exercise13_2 rp;
        for (int i = 0; i < tam.length - 1; i++) 
            for (int j = 1 + 1; j < tam.length; j++) 
                if (tam[i].getSoluong() > tam[j].getSoluong()) {
                    rp = tam[i];
                    tam[i]=tam[j];
                    tam[j]=rp;
                }
        Arrays.sort(tam, new productbyprice());
            System.out.println("Mảng sắp xếp theo số lượng");
             System.out.println(Arrays.toString(tam));




}
}
