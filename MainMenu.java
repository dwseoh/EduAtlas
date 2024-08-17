import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MainMenu extends JFrame implements ActionListener{//extends JFrame so that guis r usable, actionlistener is used for JButtons
    private JFrame menu;//the background
    private JButton southSudan;//when student clicks South Sudan button bring them to South Sudan
    private JButton cambodia;
    private JLabel trophy;
    public static boolean southSudanComplete = false;//if completed will make true, displaying trophy instead of clicking in
    public static boolean cambodiaCopmlete = false;
    public MainMenu(){
        menu = new JFrame();//initializes JFrame
        menu.setBackground(Color.black);
        menu.setTitle("Menu");
        menu.setSize(1440, 810);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setResizable(false);
        menu.setLayout(null);//guis go exactly where I put them
        menu.setContentPane(new JLabel(new ImageIcon("worldmap.jpg")));

        if(southSudanComplete){//if they've passed the quizz a trophy will appear
            setTrophy(700, 530);
        }
        southSudan = new JButton("South Sudan");
        southSudan.setBounds(700, 500, 110, 25);
        southSudan.addActionListener(this);
        southSudan.setFocusable(false);
        southSudan.setPreferredSize(new Dimension(110, 25));
        southSudan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();//deletes this frame opens a new one
                new southSudan();
            }
        });
        menu.add(southSudan);

        if(cambodiaCopmlete){
            setTrophy(1000, 480);
        }
        cambodia = new JButton("Cambodia");
        cambodia.setBounds(1000, 450, 110, 25);
        cambodia.addActionListener(this);
        cambodia.setFocusable(false);
        cambodia.setPreferredSize(new Dimension(110, 25));
        cambodia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();//deletes this frame opens a new one
                new cambodia();
            }
        });
        menu.add(cambodia);

        menu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void setTrophy(int xValue, int yValue){//places a badge instead of the button to go into the country
        trophy = new JLabel((new ImageIcon("trophy.png")));
        trophy.setBounds(xValue, yValue, 50, 50);
        trophy.setVisible(true);
        menu.add(trophy);
    }
}
