package swjd.MyJava;

public class Test004 {
    public static void main(String[] args) {
        long test = 012;
        System.out.println();

    }
}
class Father{
    String name = "hehe";
    public Father(){
        System.out.println("heheh");
    }
}

class Son extends Father{
    public void fuck(){
        //子类能调用父类的全局变量
        System.out.println(name);
        new Father();
    }

    /**
     *public Father(){}
     * 父类构造函数不能被子类构造函数给继承
     */

}