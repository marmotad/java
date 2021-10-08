package day11.demo02;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 14:57
 */
public class Cat extends Animal {
    String gender;

    @Override
    public void print() {
        System.out.println("Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", gender='" + gender + '\'' +
                '}');
    }
}
