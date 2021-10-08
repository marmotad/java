package day11.homework04;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:50
 */
public class Teacher extends OpeningCeremony {
    double salary;

    public Teacher(String name, int age, char gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("姓名" + name);
    }

    public void teachingMethod() {
        System.out.println(name + "老师的教学方法");
    }
}
