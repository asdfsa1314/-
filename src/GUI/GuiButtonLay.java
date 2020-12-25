package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiButtonLay {
    public static void main(String[] args) {
        Frame frame = new Frame();

        Button button1 = new Button("center");
        Button button2 = new Button("west");
        Button button3 = new Button("east");
        Button button4 = new Button("south");
        Button button5 = new Button("north");

        Panel panel1 = new Panel();
        panel1.setVisible(true);
        panel1.setBounds(200,200,100,100);

        Panel panel2 = new Panel();
        panel2.setVisible(true);
        panel2.setBounds(200,200,100,100);


        //按钮也能实现流式布局BorderLayout里面的枚举
//        //比如
        panel1.add(button1, BorderLayout.CENTER);
        panel1.add(button2, BorderLayout.WEST);
        frame.add(button3, BorderLayout.EAST);
        frame.add(button4, BorderLayout.SOUTH);
        frame.add(button5, BorderLayout.NORTH);

        frame.setVisible(true);
        frame.setBounds(200,200,400,400);
        frame.setBackground(new Color(131,14,55));

        //固定布局的实现
        panel1.setLayout(new GridLayout(4, 4));

        frame.pack();
        frame.add(panel1);



        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

        "fuck".concat("f");

    }
}
