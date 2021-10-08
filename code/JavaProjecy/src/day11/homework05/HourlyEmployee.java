package day11.homework05;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 19:09
 */
public class HourlyEmployee extends Employee{
    double hourSysalary = 10;
    //时薪
    double workhours;
    //工做的小时数
        public HourlyEmployee(String name, double workHours, int currentMonth, int birthdayMonth) {
        //时薪的构造方法
        super(name, currentMonth, birthdayMonth);
        if (workHours <= 160 ) {
            salary = workHours * hourSysalary;
            System.out.println(salary);
        } else if (workHours >= 160) {
            salary = hourSysalary * 160 + (workHours - 160) * 1.5 * hourSysalary;
        }
        if (currentMonth == birthdayMonth) {
            //判断员工是否在当月过生日，如果是，在基础工资中+100
            super.salary = this.salary + 100;
        }
    }

}
