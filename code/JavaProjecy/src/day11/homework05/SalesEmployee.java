package day11.homework05;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 20:29
 */
public class SalesEmployee extends Employee{
    int sales;
    //销售量
    double commission;
    //提成率

    public SalesEmployee(String name, int sales, double commission, int currentMonth, int birthdayMonth) {
        super(name, currentMonth, birthdayMonth);
        this.sales = sales;
        this.commission = commission;
        salary = sales * commission;
        if (currentMonth == birthdayMonth) {
            //判断员工是否在当月过生日，如果是，在基础工资中+100
            this.salary = salary + 100;
        } else {
            this.salary = salary;
        }
    }
}
