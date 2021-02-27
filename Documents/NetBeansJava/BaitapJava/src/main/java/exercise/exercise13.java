/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nhat Thinh
 */
public class exercise13 {

    public static void main(String[] args) {
        Scanner tam = new Scanner(System.in);
        System.out.println("Hãy nhập số lượng phần tử: ");
        String input = tam.nextLine();
        int n = Integer.parseInt(input);
        int[] c = new int[n];
//        for (int i=0; i<n ; i++){
//            System.out.println("["+i+"] = ");
//            input = tam.nextLine();
//            c[i] = Integer.parseInt(input);
//        }
//         System.out.println("Giá trị vừa nhập là:");
////         System.out.println(Arrays.toString(c));
//        for (int i=0; i<c.length ; i++){
//            System.out.println(c[i]+" ");
        Random rd = new Random();
        for (int i = 0; i < n; i++) {
            c[i] = rd.nextInt(10);
        }
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        
        // TÌM KIẾM MẢNG
        System.out.println("Nhập giá trị tìm kiếm");
        input = tam.nextLine();
        int x = Integer.parseInt(input);
        
        Arrays.sort(c);
        System.out.println("Mảng sau khi sắp xếp là: ");
        
        int index = Arrays.binarySearch(c, x);
        if (index < 0 ){
            System.out.println("Không tìm thấy");
        } else {
            System.out.println("Tìm thấy ở vị trí thứ: "+index);
        }
        
//        boolean flag = false;
//        for (int i = 0; i < c.length; i++) {
//            if(c[i] == x){
//                 System.out.println("Nhập giá trị tìm kiếm nằm ở vị trí: "+i);
//                 flag = true; break;
//            }
//        }
//        if(!flag) {
//             System.out.println("Không có trong mảng");
//        }
        
    }
}
