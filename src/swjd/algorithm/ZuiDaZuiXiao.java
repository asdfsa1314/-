package swjd.algorithm;


public class ZuiDaZuiXiao {
    public static void main(String[] args) {
        int[] arr = {-10, 2, 3, 246, -100, 0, 5};

        sourA(arr);
        System.out.println("最小值:" + arr[0]);
        System.out.println("最大值:" + arr[arr.length - 1]);
        int flag = 0;
        for (int i : arr){
            flag = flag + i;
        }
        System.out.println("平均值" + (flag / arr.length));
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
}
