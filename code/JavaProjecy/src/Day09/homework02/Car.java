package Day09.homework02;

/**
 * @author Coder
 * 车类：
 * 属性：车牌号、品牌、价格、颜色
 * 方法：显示车的信息
 * 测试类：
 * 1）创建车对象，调用方法显示车的信息
 * 2）创建车对象，完成对所有属性赋值，调用方法显示车的信息
 */
public class Car {
    String numberPlate;
    String brand;
    double price;
    String colour;
    public void printCar() {
        System.out.println("numberPlate:"+ numberPlate);
        System.out.println("brand:" + brand);
        System.out.println("colour:"+ colour);
        System.out.println("price:" + price);
    }
}
