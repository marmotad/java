package day11.homework03;

import javax.security.auth.Subject;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:34
 */
public class Car extends Vehicle{
    String model;

    public Car(String numberPlate, String carBrand, int time, double dailyRent, String model) {
        super(numberPlate, carBrand, time, dailyRent);
        this.model = model;
    }

    public Car(String numberPlate, String carBrand, int time, double dailyRent) {
        super(numberPlate, carBrand, time, dailyRent);
    }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", numberPlate='" + numberPlate + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", rent=" + rent +
                ", time=" + time +
                ", dailyRent=" + dailyRent +
                '}';
    }
}
