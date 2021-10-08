package day11.homework04;

import java.nio.channels.Pipe;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:38
 */
public class OpeningCeremony {
    String name;
    int age;
    char gender;

    public OpeningCeremony(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void selfIntroduction() {
        System.out.println("姓名" + name);
        System.out.println("年龄" + age);
        System.out.println("性别" + gender);
    }

}
