package day13.demo04;

import java.util.Objects;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/10/8 14:53
 */
public class Car {
    String id;
    String brand;
    String colour;
    double price;

    public Car() {
    }

    public Car(String id, String brand, String colour, double price) {
        this.id = id;
        this.brand = brand;
        this.colour = colour;
        this.price = price;
    }

    @Override
    public String toString() {
        return "car{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, colour, price);
    }
}
