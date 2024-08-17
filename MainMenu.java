import java.awt.*;
import javax.swing.*;

public class MainMenu extends JFrame{
    private JFrame menu;
    public MainMenu(){
        menu = new JFrame();//initializes JFrame
        menu.setBackground(Color.black);
        menu.setTitle("Menu");
        menu.setSize(580, 345);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
        menu.setLayout(null);//guis go exactly where I put them
        menu.setContentPane(new JLabel(new ImageIcon("worldmap.jpg")));
        menu.setVisible(true);
    }
}
