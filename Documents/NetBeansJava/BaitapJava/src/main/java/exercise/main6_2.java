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
public class main6_2 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);

        String input = "16-12-2000";
        Date ngay = df.parse(input); // chuyển string thành giờ
        System.out.print("Ngày giờ hiện tại: " + ngay + "\n");
        exercise6_2 tam = new exercise6_2("Huế", "ĐHPX", "Trần Nhật Thịnh", "Nam", "12 VTS", ngay, 21);
        switch(tam.getThanhpho()) {
            case "Huế":
              tam.setThanhpho("Huế"); break;
            case "Hà Nội":
              tam.setThanhpho("Hà Nội"); break;
            default:
              tam.setThanhpho("Đà Nẵng"); break;
              
        }
        System.out.println("tam");
    }
}
