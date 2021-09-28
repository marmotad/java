package day10.homework02;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 18:51
 * 编写电脑类：
 * 属性：品牌、价格、颜色、尺寸
 * 方法：显示电脑的信息
 * 测试类：
 * 1）创建电脑对象同时执行无参构造方法 ，调用方法显示信息
 * 2）创建电脑对象同时执行带2个参数构造方法完成对属性赋值，调用方法显示信息
 * 3）创建电脑对象同时执行带4个参数构造方法完成对所有属性赋值，调用方法显示信息
 */
public class Computer {
    String brand;
    double price;
    String colour;
    double size;

    public Computer() {
    }

    public Computer(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public Computer(String brand, double price, String colour, double size) {
        this.brand = brand;
        this.price = price;
        this.colour = colour;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
