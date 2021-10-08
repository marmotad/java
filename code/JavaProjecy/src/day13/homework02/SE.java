package day13.homework02;

/**
 * @author ：code
 * @description：TODO
 * @date ： 2021/10/8 20:40
 */
public class SE implements Business, WriteCode{
    @Override
    public void business() {
        System.out.println("会讲业务");
    }

    @Override
    public void writeCode() {
        System.out.println("会写代码");
    }
}
