package Day09.homework03;

/**
 * @author Coder
 * 编写图书类：
 * 属性：编号，名称，价格、作者
 * 定义方法：显示图书的信息。
 * 测试类：
 * 1）创建图书对象，调用方法显示信息
 * 2）创建图书对象，完成对所有属性赋值，调用方法显示信息
 */
public class Book {
    int serialNumber;
    String name;
    double price;
    String author;
    public void printBook() {
        System.out.println("serialNumber:"+ serialNumber);
        System.out.println("name:" + name);
        System.out.println("author:" + author);
        System.out.println("price" + price);
    }
}
