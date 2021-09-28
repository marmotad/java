package Day09.homework01;

/**
 * @author Coder
1.
班级类：
属性：编号，名称，地址
定义方法：显示班级的信息。
测试类：
1）创建班级对象，调用方法显示班级的信息
2）创建班级对象，完成对所有属性赋值，调用方法显示班级的信息
 */
public class Class {
    int serialNumber;
    String name;
    String address;

    public void printClass() {
        System.out.println("serial number:" + serialNumber);
        System.out.println("name:" + name);
        System.out.println("address:" + address);
    }
}
