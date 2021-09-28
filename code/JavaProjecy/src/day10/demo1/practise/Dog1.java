package day10.demo1.practise;

import java.util.zip.DeflaterOutputStream;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 10:26
 */
public class Dog1 {
    String name;
    int age;
    String gender;
    double weight;
    String variety;

    public void pritnDog() {
        System.out.println(         "Dog1{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", gender='" + this.gender + '\'' +
                ", weight=" + this.weight +
                ", variety='" + this.variety + '\'' +
                '}');
    }
    public Dog1() {
    }

    public Dog1(String name) {
        this.name = name;
    }

    public Dog1(String name, double weight, String variety) {
        this.name = name;
        this.weight = weight;
        this.variety = variety;
    }

    public Dog1(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Dog1(String name, int age, String gender, double weight, String variety) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.variety = variety;
    }

}
