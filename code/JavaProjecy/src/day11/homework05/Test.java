package day11.homework05;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 19:31
 */
public class Test  {
    public static void main(String[] args) {
        SalariedEmployee sal = new SalariedEmployee("老张",5500, 1, 1);
        System.out.println(sal.toString());
        HourlyEmployee hourlyEmployee = new HourlyEmployee("老李", 200, 1, 1);
        System.out.println(hourlyEmployee.toString());
        SalesEmployee salesEmployee = new SalesEmployee("老刘", 100, 10,1, 1 );
        System.out.println(salesEmployee.toString());
        BasePlusSalesEmployee basePlusSalesEmployee = new BasePlusSalesEmployee("老赵",10, 100, 11, 1);
        System.out.println(basePlusSalesEmployee.toString());
    }
}