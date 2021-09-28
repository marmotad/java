package day10.homework06;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 20:03
 * 编写出版社类：
 * 	属性：出版社编号，出版社名称，出版社地址
 * 	定义：无参构造方法、有参构造方法
 * 	方法：显示出版社的信息
 * 编写图书类：
 * 	属性：编号，名称，单价，数量, 作者,出版社
 * 	定义方法：显示图书的信息（编号，名称，单价，数量, 作者,出版社名称，出版社地址)
 * 测试类：
 * 	创建图书对象通过调用带参构造方法完成对属性赋值，并调用显示信息方法
 * 	创建图书对象调用无参构造方法，并调用显示信息方法
 */
public class Test {
    public static void main(String[] args) {
           Book book = new Book("5fdsfd", "day", 20.5, 20, new publishingHouse("52412xs", "西西", "china"));
        System.out.println(book);
        Book book1 = new Book();
        System.out.println(book1.toString());

    }
}
