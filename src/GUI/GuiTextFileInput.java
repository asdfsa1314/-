package GUI;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.concurrent.Callable;

public class GuiTextFileInput {
    public static void main(String[] args) {
        Frame frame = new Frame();

        //创建了自定义事件
        MyAction1 action1 = new MyAction1();

        //创建了一个文本输入结构
        TextField input = new TextField();

        //输入框事件监听,添加一个自定义事件
        input.addActionListener(action1);

        //设置输入框的替换编码,可以用于加密
        input.setEchoChar('*');

        //把输入框组件添加在框架里面去
        frame.add(input);

        //让他使用pack自定义布局
        frame.pack();

        //设置框架大小坐标
        frame.setBounds(0,0,500,500);

        //设置框架的可见性
        frame.setVisible(true);

        //添加关闭事件,能让系统退出
        Closer(frame);
    }

    public static void Closer(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

}

class MyAction1 implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {

        //e.getSource()这个方法获取资源,什么意思?其实获取的是Object对象,是需要通过强制类型转换来得到的.

        TextField wenben = (TextField) e.getSource() ;
        System.out.println(wenben.getText());

        //这里的作用就是用于按回车后,会产生一个fuck字符串
        wenben.setText("fuck");
    }
}