import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class cambodia extends JFrame implements ActionListener{
    private JFrame cambodia;
    private JButton brick;
    private JButton banana;
    private JButton pesticide;
    private JButton fishing;
    private JButton quiz;
    private boolean pesticide_ = false;//track if they've opened the object
    private boolean brick_ = false;//after all 4 are opened option to move on appears
    private boolean banana_ = false;
    private boolean fishing_ = false;
    public cambodia(){
        new Thread(() -> {//constantly checking if they can move on to quiz
            while(!(pesticide_ && brick_ && banana_ && fishing_)) {
                System.out.println("working");//for some reason it only works when there is a print statement
            }
            cambodia.add(quiz);
            cambodia.repaint();
        }).start();

        cambodia = new JFrame();//initializes JFrame
        cambodia.setBackground(Color.black);
        cambodia.setTitle("Menu");
        cambodia.setSize(580, 479);
        cambodia.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cambodia.setResizable(false);
        cambodia.setLayout(null);//guis go exactly where I put them
        cambodia.setContentPane(new JLabel(new ImageIcon("cambodia.jpg")));

        brick = new JButton();
        brick.setBounds(121,290, 110, 25);
        brick.addActionListener(this);
        brick.setFocusable(false);
        brick.setPreferredSize(new Dimension(110, 25));
        brick.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                brick_ = true;
            }
        });

        banana = new JButton();
        banana.setBounds(421,290, 110, 25);
        banana.addActionListener(this);
        banana.setFocusable(false);
        banana.setPreferredSize(new Dimension(410, 25));
        banana.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                banana_ = true;
            }
        });

        pesticide = new JButton();
        pesticide.setBounds(121,190, 110, 25);
        pesticide.addActionListener(this);
        pesticide.setFocusable(false);
        pesticide.setPreferredSize(new Dimension(410, 25));
        pesticide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pesticide_ = true;
            }
        });

        fishing = new JButton();
        fishing.setBounds(421,190, 110, 25);
        fishing.addActionListener(this);
        fishing.setFocusable(false);
        fishing.setPreferredSize(new Dimension(410, 25));
        fishing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fishing_ = true;
            }
        });

        quiz = new JButton("Quiz");
        quiz.setBounds(300, 290, 110, 25);
        quiz.addActionListener(this);
        quiz.setFocusable(false);
        quiz.setPreferredSize(new Dimension(110, 25));
        quiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                cambodia.dispose();//move on to quizz
                new quiz("cambodia");
            }
        });

        cambodia.add(banana);
        cambodia.add(brick);
        cambodia.add(pesticide);
        cambodia.add(fishing);
        cambodia.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
