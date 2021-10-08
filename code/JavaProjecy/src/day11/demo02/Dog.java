package day11.demo02;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 14:58
 */
public class Dog extends Animal {
    String variety;

    @Override
    public void print() {
        System.out.println("Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", variety='" + variety + '\'' +
                '}');
    }
}
