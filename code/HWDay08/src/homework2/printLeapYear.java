package homework2;

import homework1.HW02;

public class printLeapYear {
    public static void main(String[] args) {
        for (int i = 2000; i <= 2021; i ++) {
            if (HW02.determineLeapYear(i)) {
                System.out.println(i);
            }
        }
    }
}
