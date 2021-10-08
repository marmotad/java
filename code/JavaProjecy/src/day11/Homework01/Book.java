package day11.Homework01;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:06
 */
public class Book {
    String bookId;
    String bookName;
    double bookPrice;
    int bookNum;

    public String getBookId() {
        return bookId;
    }

    public Book setBookId(String bookId) {
        this.bookId = bookId;
        return this;
    }

    public String getBookName() {
        return bookName;
    }

    public Book setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public Book setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
        return this;
    }

    public int getBookNum() {
        return bookNum;
    }

    public Book setBookNum(int bookNum) {
        this.bookNum = bookNum;
        return this;
    }
}
