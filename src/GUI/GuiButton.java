package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiButton {
    public static void main(String[] args) {
//        创建按钮布局
        Button button1 = new Button("fuck");
        Button button2 = new Button("you");
        Button button3 = new Button("bich");

        button1.setBackground(new Color(73,32,53));

        //创建框架布局
        Frame frame = new Frame();
        //设置流式布局
        frame.setLayout(new FlowLayout(FlowLayout.TRAILING));
        //设置框架的基本素养,背景 大小 是否可见
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setBackground(new Color(131,1,1));
        frame.setBounds(20, 40, 300,300);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });


        //把按钮加上去,为什么能加上去呢?只是应为Button是继承了Component
        frame.add(button1);


    }
}
