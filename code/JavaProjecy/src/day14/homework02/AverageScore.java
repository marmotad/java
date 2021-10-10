package day14.homework02;

import java.util.Scanner;

/**
 * @author ：范杨
 * @description：TODO
 * @date ： 2021/10/9 18:44
 * 1 从键盘上输入10个同学的成绩保存到数组中, 计算所有同学的平均成绩, 统计成绩高于平均分学生的人数,
 */
public class AverageScore {
    public static void main(String[] args) {
        double[] score = new double[10];
        //定义sun变量，用于存储分数的和
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < score.length ; i++) {
            System.out.print("请输入第" + (i+1) + "个学生的分数：");
            score[i] = scanner.nextInt();
        }
        for (double v : score) {
            sum = v + sum;
        }
        //存储平均成绩
        double average = sum / score.length;
        System.out.println(average);
        //存储高于平均分的学生数
        int aboveAverage = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] >= average) {
                aboveAverage ++;
            }
        }
        System.out.println(aboveAverage);
    }
}
