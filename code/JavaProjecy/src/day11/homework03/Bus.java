package day11.homework03;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:37
 */
public class Bus extends Vehicle{
    int numberOfSeats;

    public Bus(String numberPlate, String carBrand, int time, double dailyRent, int numberOfSeats) {
        super(numberPlate, carBrand, time, dailyRent);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "numberOfSeats=" + numberOfSeats +
                ", numberPlate='" + numberPlate + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", rent=" + rent +
                ", time=" + time +
                ", dailyRent=" + dailyRent +
                '}';
    }
}
