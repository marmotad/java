package day11.homework03;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:30
 */
public class Vehicle {
    String numberPlate;
    //车牌号
    String carBrand;
    //品牌
    double rent;
    //租金
    int time;
    //租用的时间
    double dailyRent;
    //日租金


    public Vehicle(String numberPlate, String carBrand, int time, double dailyRent) {
        this.numberPlate = numberPlate;
        this.carBrand = carBrand;
        this.time = time;
        this.dailyRent = dailyRent;
        rent = dailyRent * time;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "numberPlate='" + numberPlate + '\'' +
                ", carBrand='" + carBrand + '\'' +
                ", rent=" + rent +
                ", time=" + time +
                ", dailyRent=" + dailyRent +
                '}';
    }
}
