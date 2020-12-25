package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class GuiButtonTest1 {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setVisible(true);
        frame.setResizable(true);
        frame.setBounds(200,200,500,500);
        frame.setLayout(new BorderLayout());

        //布置靠左,并且添加两个按钮
        Panel panel1 = new Panel();
        panel1.setBounds(0,0,100 , 500);
        //行就是rows,列就是cols
        panel1.setLayout(new GridLayout(2, 0));
        panel1.add(new Button("fuck"));
        panel1.add(new Button("bich"));
        panel1.setVisible(true);
        frame.add(panel1, BorderLayout.WEST);

        //布置靠右,并且添加两个按钮
        Panel panel2 = new Panel();
        panel2.setBounds(0,0,100 , 500);
        panel2.setLayout(new GridLayout(2, 0));
        panel1.add(new Button("fuck"));
        panel1.add(new Button("bich"));
        panel1.setVisible(true);
        frame.add(panel2, BorderLayout.EAST);


        //创建窗口对象
        Panel panel3 = new Panel();

        Panel panel4 = new Panel();







        //实现关闭功能
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
