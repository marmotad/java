package day14.task;

import java.security.PublicKey;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/10 15:51
 */
public abstract class Birad {
    public abstract void fly();
}
class red extends Birad {
    @Override
    public void fly() {
        System.out.println("红色可以飞");
    }
}

class blue extends Birad {
    @Override
    public void fly() {
        System.out.println("蓝色可以裂变");
    }
}
