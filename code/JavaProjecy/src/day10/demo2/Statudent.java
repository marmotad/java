package day10.demo2;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 14:55
 */
public class Statudent {
    String stuName;
    int stuAge;
    String stuGender;
    Class stuClass;

    public Statudent() {
        stuClass = new Class();
    }

    public Statudent(String stuName, int stuAge, String stuGender, Class stuClass) {
        this.stuName = stuName;
        this.stuAge = stuAge;
        this.stuGender = stuGender;
        this.stuClass = stuClass;
    }

    @Override
    public String toString() {
        return "Statudent{" +
                "stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuGender='" + stuGender + '\'' +
                ", stuClass=" + stuClass +
                '}' ;
    }
}
