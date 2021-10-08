package day11.homework04;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/28 18:54
 */
public class Test {
    public static void main(String[] args) {
        Student stu = new Student("小明",15 , '男', "269ac");
        stu.selfIntroduction();
        stu.studyMethod();
        System.out.println("=================");
        Teacher teacher = new Teacher("老李", 66, '女', 8000.09);
        teacher.selfIntroduction();
        teacher.teachingMethod();
    }
}
