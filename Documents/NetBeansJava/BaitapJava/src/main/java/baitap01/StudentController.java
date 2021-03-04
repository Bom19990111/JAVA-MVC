/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

import java.util.ArrayList;

/**
 *
 * @author Nhat Thinh
 */
public class StudentController {

    private Student student;
    private ArrayList<Student> students;
    private StudentView view;

    public StudentController() {
        this.students = new ArrayList<>();
    }

    public StudentController(StudentView view) {
        this.view = view;
    }

    public StudentController(Student student) {
        this.student = student;
    }

    public StudentController(ArrayList<Student> students) {
        this.students = students;
    }

    public void nhap_du_lieu_sinh_vien() {
        this.student = this.view.them_du_lieu_sinh_vien();
    }

    public void hien_thi_sinh_vien() {
        this.view.hien_thi_mot_sinh_vien(this.student);
    }

    public void nhap_danh_sach_sinh_vien() {
        this.students = this.view.nhap_du_lieu_nhieu_sinh_vien();
    }

//    
    public void hien_thi_danh_sach_sinh_vien() {
        this.view.hien_thi_danh_sach_sinh_vien(this.students);
    }

    public void timkiemsdt() {
        this.view.tim_sv_theo_sdt(this.students);
    }
}
