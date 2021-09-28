package Day09.demo02;

/**
 * @author Coder
 * 创建测试类
 */
public class Test {
    public static void main(String[] args) {
        Student ls = new Student();
        //创建一个student类的对象
        System.out.println(ls.name);
        //输出student对象的值
        System.out.println(ls.age);
        System.out.println(ls.gender);
        System.out.println(ls.height);
        System.out.println(ls.weight);
        ls.name = "李四";
        //对student中的对象赋值
        ls.age = 19;
        ls.gender = "女";
        ls.height = 1.99;
        ls.weight = 88.88;
        System.out.println("name:" + ls.name);
        //输出student对象的值
        System.out.println("age:" + ls.age);
        System.out.println("gender:" + ls.gender);
        System.out.println("height:" + ls.height);
        System.out.println("weight:" + ls.weight);
        System.out.println(ls.study());
    }
}
