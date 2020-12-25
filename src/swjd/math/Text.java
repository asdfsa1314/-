package swjd.math;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {

        int[][] arr1 = new int[10][5];
        String[] arr = {"语文","数学","英语","化学","生物"};
        int sum = 0;
        Scanner s = new Scanner(System.in);

        for (int j =0; j < arr1.length; j++) {
            for (int i = 0; i < arr1[j].length; i++) {
                System.out.println("请输入" + arr[i] + "成绩:");
                try {
                    arr1[j][i] = s.nextInt();
                    int temp = arr1[j][i];
                } catch (InputMismatchException a) {
                    System.out.println("输入错误,学生登记不算数");
                    break;
                }
            }
            System.out.println("同学"+j+"号装载完毕");
        }

        for (int i = 0; i < arr1.length; i++){

        }
    }
}
