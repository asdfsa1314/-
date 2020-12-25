package GUI;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiPanel {
    public static void main(String[] args) {
        Panel panel1 = new Panel();
        Frame frame = new Frame();
        frame.setLayout(null);

        frame.setBounds(50,50,500,500);
        frame.setBackground(new Color(118, 11, 226));
        frame.setVisible(true);
        frame.setResizable(true);


        panel1.setBounds(250,250,200,200);
        panel1.setBackground(new Color(223, 141, 18));
        panel1.setVisible(true);


        //由于面板添加到了窗口里面,所以面板的x y坐标只是一种相对坐标而已(针对与frame的相对坐标)
        frame.add(panel1);

        frame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }

}
