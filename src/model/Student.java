package model;

public class Student {
    public String name;
    public int age;
    public String sex;
    public String stu_num;
    public Student(){
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getStu_num() {
        return stu_num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setStu_num(String stu_num) {
        this.stu_num = stu_num;
    }
}
