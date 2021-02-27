/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Nhat Thinh
 */
public class exercise5 {

    public static void main(String[] args) throws ParseException {
        // CHUYỂN DATE THÀNH STRING

        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss", Locale.ENGLISH);
        
        Date date = new Date();
        String output = df.format(date); // chuyển giờ thành string
        System.out.print("Ngày giờ hiện tại: " + output +"\n");
        
        //CHUYỂN CHUỖI THÀNH DATE
         String input = "16-12-2000 00:00:00";
         Date ngay = df.parse(input); // chuyển string thành giờ
         System.out.print(ngay);
        
    }
}
