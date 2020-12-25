package swjd.algorithm;

public class BaoLiu {
    public static void main(String[] args) {
        int[] arr = {1, 33,  13, 334, 13, 14};

        BL(arr);
        for (int i : arr){
            System.out.println(i);
        }
    }

    public static void BL(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length - 1; j++){
                if (arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }
    }
}
