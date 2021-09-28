package Day09.homework04;

/**
 * @author Coder
 * 4.
 * 编写狗类：
 * 属性：昵称、年龄、性别、体重、品种
 * 方法：显示狗的信息
 * 测试类：
 * 1）创建狗对象同时执行无参构造方法 ，调用方法显示信息
 * 2）创建狗对象同时执行带3个参数构造方法完成对属性赋值，调用方法显示信息
 * 3）创建狗对象同时执行带5个参数构造方法完成对所有属性赋值，调用方法显示信息
 */
public class Dog {
    String name;
    int age;
    String gender;
    double weight;
    String variety;
    public void printDog() {
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("gender:" + gender);
        System.out.println("weight:" + weight);
        System.out.println("Variety:" + variety);
    }
    public void printDog1(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        System.out.println("name:" + this.name);
        System.out.println("age:" + this.age);
        System.out.println("weight:" + this.weight);
    }

    public void printDog3(String name, int age, double weight, String gender, String variety) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.variety = variety;
        this.gender = gender;
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("gender:" + gender);
        System.out.println("weight:" + weight);
        System.out.println("Variety:" + variety);

    }
}
