package day11.homework04;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:43
 */
public class Student extends OpeningCeremony {
    String stuId;

    public Student(String name, int age, char gender, String stuId) {
        super(name, age, gender);
        this.stuId = stuId;
    }

    @Override
    public void selfIntroduction() {
        super.selfIntroduction();
        System.out.println("学号" + stuId);
    }

    public void studyMethod() {
        System.out.println(name + "的学习方法");
    }

}
