package swjd.MyJava;

public class Test008 {
    public static void main(String[] args) {
        String s1=new String("hello");
        String s2=new String("I love Java");
        A a=new A(s1,s2);
        System.out.println(s1+s2);
        System.out.println(a.toString());
    }
}
class A{
    String s1;
    String s2;
    A(String str1,String str2){
        s1=str1;
        s2=str2;
        str1="No pain";
        str2="no gain";
        System.out.println(s1+s2);
    }

    public String toString() {
        return s1+s2;
    }
}

