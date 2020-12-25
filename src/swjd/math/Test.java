package swjd.math;

import java.util.Scanner;

public class Test {

        public static void main(String[] args) {
            System.out.println("输出行数：");
            Scanner scan = new Scanner(System.in);
            int n = scan.nextInt();

            int arr[][] = getTri(n);
            printTri(arr);

        }


        public static int[][] getTri(int n) {
            int[][] arr = new int[n][n];

            for (int i = 0; i < n; i++) {
                arr[i][0] = arr[i][i] = 1;
            }
            for (int i = 2; i < arr.length; i++) {
                for (int j = 1; j < i; j++) {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
            return arr;
        }

        public static void printTri(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                //输出杨辉三角数字前的空格
                for(int j = 0;j<arr.length-1-i;j++) {
                    System.out.print("   ");
                }
                for(int j = 0;j<=i;j++) {
                    //打印空格填补空位
                    System.out.print("   ");
                    System.out.printf("%-3d",arr[i][j]);
                }
                System.out.println();
            }
        }


}
