package Day09.homework02;

public class Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.printCar();
        Car c2 = new Car();
        System.out.println("===============");
        c2.price = 19.8;
        c2.brand = "五征";
        c2.colour = "blue";
        c2.numberPlate = "1008";
        c2.printCar();
    }
}
