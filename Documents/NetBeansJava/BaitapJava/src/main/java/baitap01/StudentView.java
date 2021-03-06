/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Nhat Thinh
 */
public class StudentView {

    public StudentView() {
    }

    public void hien_thi_mot_sinh_vien(Student x) {
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("++++ " + x.toString() + " ++++");
        System.out.println("++++++++++++++++++++++++++++++++++");
    }

    public Student them_du_lieu_sinh_vien() {
        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Fullname: ");
        Scanner sc = new Scanner(System.in);
        String fullname = sc.nextLine();
        System.out.println("Age: ");
        float age = Float.parseFloat(sc.nextLine());
        System.out.println("Phone: ");
        String phone = sc.nextLine();
        Student sv = new Student(fullname, phone, age);
        return sv;
    }

    public ArrayList<Student> nhap_du_lieu_nhieu_sinh_vien() {
        ArrayList<Student> result = new ArrayList<>();
        boolean flag = true;
        while (flag) {
            System.out.println("Ban co muon nhap du lieu khong? (y/n)");
            Scanner sc = new Scanner(System.in);
            String answer = sc.nextLine();
            if ("n".equals(answer) || "N".equals(answer)) {
                flag = false;
            } else {
                Student sv = them_du_lieu_sinh_vien();
                result.add(sv);
            }
        }
        return result;
    }

    public void hien_thi_danh_sach_sinh_vien(ArrayList<Student> students) {

        System.out.println("++++++++++++++++++++++++++++++++++");
        for (Student sv : students) {
            System.out.println("++++ " + sv.toString() + " ++++");
        }
        System.out.println("++++++++++++++++++++++++++++++++++");
    }

    public String nhap_sdt_can_tim() {
        System.out.println("+++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien thoai can tim kiem: ");
        String sdt = sc.nextLine();
        System.out.println("+++++++++++++++++++++++");
        return sdt;
    }

    //view in ket qua tim kiem
    public void ket_qua_tim_kiem_sdt(ArrayList<Student> students) {
        System.out.println("+++++++++++++++++++++++");
        if (students.isEmpty()) {
            System.out.println("Khong tim thay");
        } else {
            for (Student sv : students) {
                System.out.println(sv.toString());
            }
        }
        System.out.println("+++++++++++++++++++++++");
    }

    public int hien_thi_menu() {
        System.out.println("+++++++++++++++++++++++");
        System.out.println("1. Nhap du lieu");
        System.out.println("2. Tim kiem theo sdt ");
        System.out.println("3. Tim kiem theo ten ");
        System.out.println("4. Thoat chuong trinh");
        System.out.println("+++++++++++++++++++++++");
        System.out.println("Ban chon chuc nang nao?");
        Scanner sc = new Scanner(System.in);
        int kq = Integer.parseInt(sc.nextLine());
        return kq;
    }

    public String nhap_sv_can_tim() {
        System.out.println("+++++++++++++++++++++++");
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien can tim: ");
        String delete = sc.nextLine();
        System.out.println("+++++++++++++++++++++++");
        return delete;
    }

    public void ket_qua_tim_sv(ArrayList<Student> students) {
        System.out.println("+++++++++++++++++++++++");
        if (students.isEmpty()) {
            System.out.println("Hay nhap ten sinh vien can tim kiem");
        } else {
            for (Student sv : students) {
                System.out.println(sv.toString());
            }
        }
        System.out.println("+++++++++++++++++++++++");
    }

}
