package swjd.algorithm;

public class XuanZesourt {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        int[] arr= {12, 34, 87, 45, 63, 72};
        long a1 = System.currentTimeMillis();
        sourA(arr);
        long a2 = System.currentTimeMillis();

        for (int i : arr){
            System.out.println(i);
        }

        System.out.println("冒泡排序所用的时间"+(a2 - a1)+"ms");
    }

    //导入数组，从0到b-1的区间里排序
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

    public static void sourB(int[] arr1){
     for (int i = 0; i < arr1.length; i++) {
         int min = i;
         //如果有比最小值还小的数字，把两者下标交换
            for (int j = i; j < arr1.length - 1; j++){
                if (arr1[min] > arr1[j]){
                    min = j;
                }
            }
         //如果min与i不相等，就把min与i交换。这时候的min就是内循环里面的j
            if (min!=i){
                int tmp = arr1[i];
                arr1[i] = arr1[min];
                arr1[min] = tmp;
            }
        }
    }
}
