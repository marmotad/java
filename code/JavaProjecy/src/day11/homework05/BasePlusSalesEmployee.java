package day11.homework05;

import day11.demo02.Dog;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 20:42
 */
public class BasePlusSalesEmployee extends SalesEmployee {
    double basicSalary = 1000;

    public BasePlusSalesEmployee(String name, int sales, double commission, int currentMonth, int birthdayMonth) {
        super(name, sales, commission, currentMonth, birthdayMonth);
        salary = sales * commission + basicSalary;
        if (currentMonth == birthdayMonth) {
            //判断员工是否在当月过生日，如果是，在基础工资中+100
            this.salary = salary + 100;
        } else {
            this.salary = salary;
        }
    }
}
