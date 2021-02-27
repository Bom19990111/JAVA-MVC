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
public class main6 {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH);
        String input = "16-12-2000";
        Date ngay = df.parse(input); // chuyển string thành giờ
        exercise6 gf = new exercise6("Tran Nhat Thinh", "Nam", "12 Tran Phu", ngay, 14);
        System.out.println("Họ tên: "+ gf.getHoten() + "\n" + 
                "Giới tính: "+ gf.getGioitinh()+ "\n" +
                "Địa chỉ: "+ gf.getDiachi()+ "\n" +
                "Ngày sinh: "+ df.format(gf.getNgaysinh())+ "\n" +
                "Tuổi: " + gf.getTuoi());
        
         exercise6_2 hf = new exercise6_2();
         hf.setHoten("Lê Văn Minh");
         hf.setGioitinh("Nam");
         hf.setDiachi("62 Võ Thị Sáu");
         hf.setNgaysinh(df.parse("12-02-1999"));
         hf.setTuoi(23);
         
         System.out.println("Họ tên: "+ hf.getHoten() + "\n" + 
                "Giới tính: "+ hf.getGioitinh()+ "\n" +
                "Địa chỉ: "+ hf.getDiachi()+ "\n" +
                "Ngày sinh: "+ df.format(gf.getNgaysinh())+ "\n" +
                "Tuổi: " + hf.getTuoi());
         System.out.println(hf.calcX(2000));
    }
}
