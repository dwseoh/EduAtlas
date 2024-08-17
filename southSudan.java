import javax.swing.*;
import java.awt.*;

public class southSudan extends JFrame {
    private JFrame southSudan;
    public southSudan(){
        southSudan = new JFrame();//initializes JFrame
        southSudan.setBackground(Color.black);
        southSudan.setTitle("Menu");
        southSudan.setSize(580, 425);
        southSudan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        southSudan.setResizable(false);
        southSudan.setLayout(null);//guis go exactly where I put them
        southSudan.setContentPane(new JLabel(new ImageIcon("southSudan.jpg")));
        southSudan.setVisible(true);
    }
}
