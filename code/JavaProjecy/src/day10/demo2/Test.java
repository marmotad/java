package day10.demo2;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 14:59
 */
public class Test {
    public static void main(String[] args) {
        Statudent stu = new Statudent();
        System.out.println(stu.toString());
        Statudent stu2 = new Statudent("a", 18, "男", new Class("1", "002", "china"));
        System.out.println(stu2.toString());
    }
}
