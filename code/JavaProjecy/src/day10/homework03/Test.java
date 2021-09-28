package day10.homework03;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 19:14
 */
public class Test {
    public static void main(String[] args) {
        Statudent statudent = new Statudent();
        statudent.setAge(19);
        statudent.setGender('男');
        statudent.setName("李莉");
        System.out.println("年龄：" + statudent.getAge() + "性别：" + statudent.getGender() + "姓名：" + statudent.getName());
    }
}
