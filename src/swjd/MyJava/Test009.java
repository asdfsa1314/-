package swjd.MyJava;


public class Test009{
	String str=new String("good");
	char[]ch={'a','b','c'};


	public static void main(String args[]){
	Test009 ex=new Test009();
	ex.change("extr",ex.ch);
	System.out.print(ex.str+" and ");
	System.out.print(ex.ch);


}

	public static void change(String str,char ch[]){
	str = "hehe";
	ch[0]='g';
}

}

