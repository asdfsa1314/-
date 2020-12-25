package swjd.MyJava;

public class Test001 {
    public static void main(String[] args) {
        long a = System.currentTimeMillis();
        PrintA(10000000);
        long b = System.currentTimeMillis();


        long c = System.currentTimeMillis();
        PrintB(10000000);
        long v = System.currentTimeMillis();
        System.out.println("递归程序执行花了"+(b - a)+"ms");
        System.out.println("FOR循环程序执行花了"+(v - c)+"ms");
    }

    //写一个递归方法，传入数字，从小到大输出
    public static void PrintA(int N){
        if (N > 0){
            PrintA(N - 1);
            System.out.println(N);
        }
    }

    public static void PrintB(int N){
        for (int i = 0; i < N; i++){
            System.out.println(i);
        }
    }
}


