package day11.homework05;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 19:03
 */
public class Employee {
    String name;
    double salary;
    //薪水
    int currentMonth;
    //当前月份
    int birthdayMonth;
    //生日月份

    public Employee(String name, int currentMonth, int birthdayMonth) {
        this.name = name;
        this.currentMonth = currentMonth;
        this.birthdayMonth = birthdayMonth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", currentMonth=" + currentMonth +
                '}';
    }
}
