package day10.homework01;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 18:31
 * 编写图书类：
 * 属性：编号，名称，价格、作者
 * 定义方法：显示图书的信息。
 * 测试类：
 * 1）创建图书对象同时执行无参构造方法，调用方法显示信息
 * 2）创建图书对象同时执行带2个参数构造方法完成对名称和作者赋值，调用方法显示信息
 * 3）创建图书对象同时执行带3个参数构造方法完成对编号、名称、价格赋值，调用方法显示信息
 * 4）创建图书对象同时执行带4个参数构造方法完成对所有属性赋值，调用方法显示信息
 */
public class Book {
    String id;
    String name;
    double price;
    String author;

    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public Book() {
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    public Book(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Book(String id, String name, double price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }
}
