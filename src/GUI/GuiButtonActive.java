package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GuiButtonActive {
    public static void main(String[] args) {
        Frame frame = new Frame();
        frame.setBounds(0,0,200,200);
        frame.setVisible(true);

        Button button1 = new Button("fuck");
        button1.addActionListener(new buttonAOTU());
        button1.setBounds(0,0,100,100);

        Panel panel1 = new Panel();
        panel1.setBounds(0,0,100,100);
        panel1.setVisible(true);
        panel1.setBackground(Color.blue);

        frame.add(panel1, BorderLayout.SOUTH);
        frame.add(button1, BorderLayout.NORTH);
        frame.setLayout(new GridLayout(0,2));
        frame.pack();

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

class buttonAOTU implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
}

