package day10.demo1.practise;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 10:32
 */
public class Test {
    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        d1.pritnDog();
        Dog1 d2 = new Dog1("one");
        d2.pritnDog();
        Dog1 d3 = new Dog1("two",8,"two");
        d3.pritnDog();
        Dog1 d4 = new Dog1("three", 20.5, "three");
        d4.pritnDog();
        Dog1 d5 = new Dog1("four", 9, "four", 10.9, "four");
        d5.pritnDog();
    }
}
