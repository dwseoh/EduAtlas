import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

public class MainMenu extends JFrame implements ActionListener{
    private JFrame menu;
    private JButton southSudan;
    public MainMenu(){
        menu = new JFrame();//initializes JFrame
        menu.setBackground(Color.black);
        menu.setTitle("Menu");
        menu.setSize(580, 345);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
        menu.setLayout(null);//guis go exactly where I put them
        menu.setContentPane(new JLabel(new ImageIcon("worldmap.jpg")));


        southSudan = new JButton("South Sudan");
        southSudan.setBounds(300,200,110,25);
        southSudan.addActionListener(this);
        southSudan.setFocusable(false);
        southSudan.setPreferredSize(new Dimension(110, 25));
        southSudan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Check");
            }
        });
        menu.add(southSudan);
        menu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
