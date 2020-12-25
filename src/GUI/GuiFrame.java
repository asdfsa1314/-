package GUI;

import java.awt.*;

public class GuiFrame {
    public static void main(String[] args) {
//        MyFrame myFrame1 = new MyFrame(200,200,200,200,Color.BLUE);
//        MyFrame myFrame2 = new MyFrame(400,400,200,200,Color.black);
//        MyFrame myFrame3 = new MyFrame(600,600,200,200,Color.magenta);

        Frame fuck = new Frame("第一个框架");
//        设置可见性
        fuck.setVisible(true);
//        设置背景颜色
        fuck.setBackground(Color.white);
//        设置长宽高
        fuck.setSize(1000, 1000);
//        弹出的默认位置
        fuck.setLocation(200, 200);
//        大小是否固定
        fuck.setResizable(false);

//        创建一个画笔对象
//        Panel p =new Panel();
//        流动布局,不玩HTML的都不懂,设置一个null保证没有流动布局
//        p.setLocation(null);


    }
}

class MyFrame extends Frame{
    public MyFrame(){ }
    public MyFrame(int x, int y, int w, int h, Color color){
        setBounds(x, y, w, h);
        setBackground(color);
        setVisible(true);

        setBackground(color);
    }
}