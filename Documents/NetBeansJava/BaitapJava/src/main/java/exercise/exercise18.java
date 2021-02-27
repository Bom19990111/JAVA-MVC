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
public class exercise18 {
    public static void main(String[] args) {
        String content = "hi, xin chào các idol nhá!";
        System.out.println(content);
        // Tìm vị trí của 1 ký tự
        System.out.println("Vị trí của ký tự a trong chuỗi: "+content.indexOf("a"));
        System.out.println("Vị trí của 'chào' trong chuỗi: "+content.indexOf("chào"));
        // Cắt chuỗi vị trí
        String temp = content.substring(5,10);
        System.out.println(temp);
        // Phân tách chuỗi
        String [] resuit = content. split("hi");
        for (int i =0; i< resuit.length; i++){
            System.out.println(resuit[i] );
        }
        // Thay thế
        temp = content.replace("hi", "hello");
        System.out.println(temp);
        // IN hoa, IN thường
         temp = content.toLowerCase();
         System.out.println(temp);
         temp = content.toUpperCase();
         System.out.println(temp);
         // Nối chuỗi
         temp = content.concat(" Goodjob!");
          System.out.println(temp);
    }
}
