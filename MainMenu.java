import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MainMenu extends JFrame implements ActionListener{//extends JFrame so that guis r usable, actionlistener is used for JButtons
    private JFrame menu;//the background
    private JButton southSudan;//when student clicks South Sudan button bring them to South Sudan
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
                menu.dispose();//deletes this frame opens a new one
                new southSudan();
            }
        });
        menu.add(southSudan);
        menu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
