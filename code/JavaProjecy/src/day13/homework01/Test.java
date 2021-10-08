package day13.homework01;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/10/8 20:31
 */
public abstract class Test implements Pet {
    public static void main(String[] args) {
        new Pet() {
            @Override
            public void eat() {
                System.out.println("正在吃");
            }
        }.eat();
    }
}
