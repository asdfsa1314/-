package GUI.Computer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MathLow {
    public static void main(String[] args) {
    //启动我的low计算机
        new Computer();
    }
}

//这是计算机类,用于构造基本的计算机模块,
class Computer extends Frame{
    public Computer(){
        //创建一个框架
        Frame frame = new Frame();

        //创建三个输入框对象
        TextField textField1 = new TextField();

        TextField textField2 = new TextField();

        TextField textField3 = new TextField();


        //创建一个标签类,用于表示标签"+"
        Label label = new Label("+");

        //创建一个按钮类,用于得出结果
        Button button = new Button("=");
        //把监听事件添加在按钮里面,cool
        button.addActionListener(new MyActive(textField1, textField2, textField3));

        //设置流式布局,主要作用就是用来添加剩余的东西的,记住依次添加
        frame.setLayout(new FlowLayout());

        frame.add(textField1);
        frame.add(label);
        frame.add(textField2);
        frame.add(button);
        frame.add(textField3);
        frame.setLayout(new GridLayout(0,5));

        frame.pack();

        //设置窗口可见
        frame.setVisible(true);
        //整一个颜色咋样?
//        frame.setBackground(Color.ORANGE);
//        //整一个大小
        frame.setBounds(0,0,250,250);
        Colser(frame);
    }

    public static void Colser(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }


}


//这是监听器类,用于对计算机类的监听,在后台进行运算赋值
class MyActive implements ActionListener{

    //想一想,是不是需要在文本框里面做点文章?说做就做啊老铁
    private TextField num1, num2, num3;

    public MyActive(){}

    public MyActive(TextField a, TextField b, TextField c){
        num1 = a;
        num2 = b;
        num3 = c;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //这是干啥,把每个文本框的输入换成数字然后拿出来
        int a = Integer.parseInt(num1.getText());
        int b = Integer.parseInt(num2.getText());

        //这就是计算数字的多少,并且返回在第三个文本框
        num3.setText(""+(a + b));

        //清空前面两个的值
        num1.setText("");
        num2.setText("");
    }
}
