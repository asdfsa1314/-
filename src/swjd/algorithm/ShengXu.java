package swjd.algorithm;

public class ShengXu {
    public static void main(String[] args) {
     int[] arr = {12, 34, 87, 45, 63, 72};
     sourA(arr);
     int[] arr2 = new int[7];
        for (int i = 0 ; i < arr.length; i++){
             arr2[i] = arr[i];
        }
        arr2[6] = 70;
        sourA(arr2);
        for (int j : arr2){
            System.out.println(j);
        }

    }

    public static void sourA(int[] a){
        int flag;
        for(int i = 0; i < a.length; i++){
            //使无序部分与最末尾进行比较。
            for (int j = i; j < a.length; j++){
                if (a[i]>a[j]){
                    flag = a[j];
                    a[j] = a[i];
                    a[i] = flag;
                }
            }
        }
    }

    public static void sourB(int[] b){

    }
}
