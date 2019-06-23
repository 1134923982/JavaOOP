package test;

import model.Student;

public class StudentTest {
    public static void main(String args[]){
        Student s=new Student();
        s.setName("Jayden");
        s.setAge(20);
        s.setSex("男");
        s.setStu_num("0011552");
        System.out.println("名字："+s.getName()+",年龄:"+s.getAge()+",性别："+s.getSex()+",学号："+s.getStu_num());
    }
}
