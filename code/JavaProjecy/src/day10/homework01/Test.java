package day10.homework01;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 18:41
 */
public class Test {
    public static void main(String[] args) {
        Book book1 = new Book();
        System.out.println(book1.toString());
        Book book2 = new Book("book2", "李四");
        System.out.println(book2.toString());
        Book book3 = new Book("2c5d", "book3", 20.2);
        System.out.println(book3.toString());
        Book book4 = new Book("22e4f", "book4", 20.1, "张三");
        System.out.println(book4.toString());
    }
}
