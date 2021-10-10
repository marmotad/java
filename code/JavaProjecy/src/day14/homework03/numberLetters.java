package day14.homework03;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/9 19:28
 * 2 随机生成100个小写字母保存到字符数组中,统计 小写字母 a 出现的次数 int xx = (int)( Math.random() * 26 ) ; // 返回一个[0,26 )范围内的随机整数 char cc = (char) ( ‘a’ + xx ) ;
 */
public class numberLetters {
    public static <charr> void main(String[] args) {
        char[] letters = new char[100];
        //定义一个数组
        for (int i = 0; i < letters.length; i++) {
           letters[i] = (char) ((int)(Math.random() * 26) + 'a');
           //用a-z间的随机字母对数组中元素赋值
        }
        int numberOfa = 0;
        //定义一个变量存储a的数量
        for (char l: letters
             ) {
            if (l == 'a') {
                //变量数组，如果数组中当前元素l是a，则a的数量+1
                numberOfa ++;
            }
        }
        System.out.println(numberOfa);
    }
}
