package day10.demo2;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/9/27 14:54
 */
public class Class {
    String classId;
    String className;
    String classAddr;

    public Class() {
    }

    public Class(String classId, String className, String classAddr) {
        this.classId = classId;
        this.className = className;
        this.classAddr = classAddr;
    }

    @Override
    public String toString() {
        return "Class{" +
                "classId='" + classId + '\'' +
                ", className='" + className + '\'' +
                ", classAddr='" + classAddr + '\'' +
                '}';
    }
}
