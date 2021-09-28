package Day09.homework01;

public class Test {
    public static void main(String[] args) {
        Class c1 = new Class();
        c1.printClass();
        System.out.println("================");
        Class c2 = new Class();
        c2.name = "一班";
        c2.serialNumber = 01;
        c2.address = "china";
        c2.printClass();
    }
}
