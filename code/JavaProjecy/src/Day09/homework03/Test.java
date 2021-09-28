package Day09.homework03;

public class Test {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.printBook();
        System.out.println("========");
        Book b2 = new Book();
        b2.price = 24.5;
        b2.name = "哈哈";
        b2.serialNumber = 12345;
        b2.author = "ls";
        b2.printBook();
    }
}
