package swjd.algorithm;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {-1,-100,13, 15, 11, 14};
        int[] arr2 = new int[7];
        Arrays.sort(arr);
        arr2 =Arrays.copyOf(arr, 7);
        arr2[arr2.length-1] = 70;
        Arrays.sort(arr2);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

    }
}
