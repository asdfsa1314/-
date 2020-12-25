package swjd.MyJava;

public class Test012 {
    public static void main(String[] args){
        int[] arr = {13,34,21,14,56};
        int sum;
        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    sum = arr[j];
                    arr[j] = arr[i];
                    arr[i] = sum;
                }
            }
        }
        for(int c =0;c<arr.length;c++){
            System.out.println(arr[c]);
        }
    }
}
