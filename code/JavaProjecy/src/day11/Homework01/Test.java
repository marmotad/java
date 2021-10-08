package day11.Homework01;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:09
 */
public class Test {
    public static void main(String[] args) {
        Book book = new Book();
        book.setBookId("45aa").setBookName("哈哈").setBookNum(15).setBookPrice(25.6);
        System.out.println("Id:" + book.getBookId());
        System.out.println("名称：" + book.bookName);
        System.out.println("数量：" + book.getBookNum());
        System.out.println("价格：" + book.getBookPrice());
    }
}
