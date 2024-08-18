import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MainMenu extends JFrame implements ActionListener{//extends JFrame so that guis r usable, actionlistener is used for JButtons
    private JFrame menu;//the background
    private JButton southSudan;//when student clicks South Sudan button bring them to South Sudan
    private JButton cambodia;
    private JButton haiti;
    private JButton mali;
    private JLabel trophy;
    public static boolean southSudanComplete = false;//if completed will make true, displaying trophy instead of clicking in
    public static boolean cambodiaCopmlete = false;
    public static boolean haitiComplete = false;
    public static boolean maliComplete = false;
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
            setTrophy(700, 375);
        }
        Icon southIcon = new ImageIcon("southSudanButton.png");
        southSudan = new JButton(southIcon);
        southSudan.setOpaque(false);
        southSudan.setContentAreaFilled(false);
        southSudan.setBorderPainted(false);
        southSudan.setBounds(700, 325, 120, 120);
        southSudan.addActionListener(this);
        southSudan.setFocusable(false);
        southSudan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();//deletes this frame opens a new one
                new southSudan();
            }
        });
        menu.add(southSudan);

        if(cambodiaCopmlete){
            setTrophy(1052, 335);
        }
        Icon camIcon = new ImageIcon("cambodiaButton.png");
        cambodia = new JButton(camIcon);
        cambodia.setOpaque(false);
        cambodia.setContentAreaFilled(false);
        cambodia.setBorderPainted(false);
        cambodia.setBounds(1082, 332, 40, 40);
        cambodia.addActionListener(this);
        cambodia.setFocusable(false);
        cambodia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();//deletes this frame opens a new one
                new cambodia();
            }
        });
        menu.add(cambodia);

        if(maliComplete){//if they've passed the quizz a trophy will appear
            setTrophy(288, 350);
        }
        Icon haitIcon = new ImageIcon("haitiButton.png");
        haiti = new JButton(haitIcon);
        haiti.setOpaque(false);
        haiti.setContentAreaFilled(false);
        haiti.setBorderPainted(false);
        haiti.setBounds(288, 319, 19, 19);
        haiti.addActionListener(this);
        haiti.setFocusable(false);
        haiti.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();//deletes this frame opens a new one
                //new southSudan();
            }
        });
        menu.add(haiti);

        if(maliComplete){//if they've passed the quizz a trophy will appear
            setTrophy(550, 300);
        }
        Icon malIcon = new ImageIcon("maliButton.png");
        mali = new JButton(malIcon);
        mali.setOpaque(false);
        mali.setContentAreaFilled(false);
        mali.setBorderPainted(false);
        mali.setBounds(550, 250, 120, 120);
        mali.addActionListener(this);
        mali.setFocusable(false);
        mali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.dispose();//deletes this frame opens a new one
                //new southSudan();
            }
        });
        menu.add(mali);


        menu.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public void setTrophy(int xValue, int yValue){//places a badge instead of the button to go into the country
        trophy = new JLabel((new ImageIcon("trophy.png")));
        trophy.setBounds(xValue, yValue, 120, 120);
        trophy.setVisible(true);
        menu.add(trophy);
    }
}
