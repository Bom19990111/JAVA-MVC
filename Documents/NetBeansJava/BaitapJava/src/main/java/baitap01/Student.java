/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap01;

/**
 *
 * @author Nhat Thinh
 */
public class Student {


    private String fullname, phone;
    private float age;

    public Student() {
    }

    public Student(String fullname, String phone, float age) {
        this.fullname = fullname;
        this.phone = phone;
        this.age = age;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public float getAge() {
        return age;
    }

    public void setAge(float age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Họ tên sinh viên: " + "fullname=" + fullname + "\n Số điện thoại: " + phone + "\n Tuổi: " + age;
    }
    
    
    

}
