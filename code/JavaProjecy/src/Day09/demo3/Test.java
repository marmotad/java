package Day09.demo3;

public class Test {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.printComputer();
        Computer c2 = new Computer();
        c2.price = 200.00;
        c2.caller = "red";
        c2.size = 5;
        c2.brand = "ASUS";
        c2.printComputer();
    }
}
