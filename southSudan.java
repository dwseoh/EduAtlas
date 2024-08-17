import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class southSudan extends JFrame implements ActionListener {
    private JFrame southSudan;
    private JButton traditionalBridalAttire;
    private JButton choreTools;
    private JButton religion;
    private JButton oldBedding;
    private JButton quizz;
    private boolean traditional = false;//track if they've opened the object
    private boolean chore = false;//after all 4 are opened option to move on appears
    private boolean old = false;
    private boolean relig = false;
    public southSudan(){
        new Thread(() -> {//constantly checking if they can move on to quizz
            while(!(traditional && chore && old && relig)) {
                System.out.println("working");//for some reason it only works when there is a print statement
            }
            southSudan.add(quizz);
            southSudan.repaint();
        }).start();

        southSudan = new JFrame();//initializes JFrame
        southSudan.setBackground(Color.black);
        southSudan.setTitle("Menu");
        southSudan.setSize(580, 425);
        southSudan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        southSudan.setResizable(false);
        southSudan.setLayout(null);//guis go exactly where I put them
        southSudan.setContentPane(new JLabel(new ImageIcon("southSudan.jpg")));

        traditionalBridalAttire = new JButton();
        traditionalBridalAttire.setBounds(121,290, 110, 25);
        traditionalBridalAttire.addActionListener(this);
        traditionalBridalAttire.setFocusable(false);
        traditionalBridalAttire.setPreferredSize(new Dimension(110, 25));
        traditionalBridalAttire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traditional = true;
            }
        });

        choreTools = new JButton();
        choreTools.setBounds(421,290, 110, 25);
        choreTools.addActionListener(this);
        choreTools.setFocusable(false);
        choreTools.setPreferredSize(new Dimension(410, 25));
        choreTools.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chore = true;
            }
        });

        religion = new JButton();
        religion.setBounds(121,190, 110, 25);
        religion.addActionListener(this);
        religion.setFocusable(false);
        religion.setPreferredSize(new Dimension(410, 25));
        religion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                relig = true;
            }
        });

        oldBedding = new JButton();
        oldBedding.setBounds(421,190, 110, 25);
        oldBedding.addActionListener(this);
        oldBedding.setFocusable(false);
        oldBedding.setPreferredSize(new Dimension(410, 25));
        oldBedding.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                old = true;
            }
        });

        quizz = new JButton("Quizz");
        quizz.setBounds(300, 290, 110, 25);
        quizz.addActionListener(this);
        quizz.setFocusable(false);
        quizz.setPreferredSize(new Dimension(110, 25));
        quizz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                southSudan.dispose();//move on to quizz
            }
        });


        southSudan.add(traditionalBridalAttire);
        southSudan.add(religion);
        southSudan.add(choreTools);
        southSudan.add(oldBedding);
        southSudan.setVisible(true);
        async();
    }
    public void async(){

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
