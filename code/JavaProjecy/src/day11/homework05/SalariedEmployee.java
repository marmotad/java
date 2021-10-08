package day11.homework05;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 19:06
 */
public class SalariedEmployee extends Employee{
    public SalariedEmployee(String name, int salary, int currentMonth, int birthdayMonth) {
        //固定工资的构造方法，用于计算固定工资
        super(name, currentMonth ,birthdayMonth);
        if (currentMonth == birthdayMonth) {
            //判断员工是否在当月过生日，如果是，在基础工资中+100
            this.salary = salary + 100;
        } else {
            this.salary = salary;
        }
    }
 }
