package Day09.homework04;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.printDog();
        System.out.println("==========");
        Dog d2 = new Dog();
        d2.printDog1("haha", 18,28.5);
        System.out.println("==========");
        Dog d3 = new Dog();
        d3.printDog3("xixi", 19, 25.5, "母的", "藏獒");
        d3 = null;
        d3.printDog();

    }
}
