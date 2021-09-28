package day10.homework05;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 19:45
 */
public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setColour("red");
        computer.setBrand("ASUS");
        computer.setSize(15.6);
        computer.setPrice(3599.9);
        System.out.println("品牌：" + computer.getBrand());
        System.out.println("价格：" + computer.getPrice());
        System.out.println("大小：" + computer.getSize());
        System.out.println("颜色：" + computer.getColour());
    }
}
