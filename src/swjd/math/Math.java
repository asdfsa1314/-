package swjd.math;

import java.util.Arrays;

public class Math {
    public static void main(String[] args) {
        int[][] arr = {{13,45,24}, {56, 89, 53},  {13, 57}};
        int[] flag = new int[arr.length];
        int[][] arr2 = arr;
        for (int j =0; j < arr.length; j++) {
            for (int i = 0; i < arr[j].length; i++) {
                Arrays.sort(arr[j]);
                flag[j] = arr[j][arr[j].length - 1];
            }
        }
        Arrays.sort(flag);


        int arr2x = 0,arr2y = 0;
        boolean flag2 = false;
        for (int j = 0; j < arr2.length; j++){
            for (int i =0; i < arr2[j].length; i++){
                if (flag[flag.length-1] == arr2[j][i]){
                    arr2x = j;
                    arr2y = i;
                    flag2 = true;
                    break;
                }
            }

            if (flag2){break;}
        }



        System.out.println("此二维数组中最大的数为:"+flag[flag.length-1]);
        System.out.println("此二维数组最大的数字的位置为["+arr2x+" ,"+arr2y+"]");
    }
}
