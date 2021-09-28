package day10.homework03;


/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 19:06
 * 编写学生类
 *   属性：姓名、年龄、性别
 *   使用封装完成，要求：年龄在1---150岁为合法，否则年龄为18岁
 *                       性别只能是男或女，否则性别为女
 *   测试类：通过set方法对属性赋值，通过get方法完成对属性值的输出
 */
public class Statudent {
    private String name;
    private char gender;
    private double age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        if (gender == '男' || gender == '女') {
            this.gender = gender;
        } else {
            this.gender = '女';
        }
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        if (age <= 1 || age >= 150) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }
}
