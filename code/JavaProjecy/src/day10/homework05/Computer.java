package day10.homework05;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 19:39
 * 编写电脑类，属性：品牌、颜色、价格、尺寸
 *   使用封装完成，要求：价格在0以上
 *   编写测试类，通过set方法完成对属性赋值，调用get方法输出属性的值
 */
public class Computer {
    private  String brand;
    private String colour;
    private double price;
    private double size;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            this.price = 100;
        }
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size > 100) {
            this.size = size;
        } else {
            this.size = 10;
        }
    }
}
