package swjd.MyJava;

public class Test003 {
    public static void main(String[] args) {
        Integer a = 127, b = 127;
        System.out.println(a == b);//1 false
        Integer c = 100, d = 100;
        System.out.println(c == d);//2 true
    }
}
