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
    private JButton quiz;
    private JButton toMap;
    public static boolean traditional = false;//track if they've opened the object
    public static boolean chore = false;//after all 4 are opened option to move on appears
    public static boolean old = false;
    public static boolean relig = false;
    public southSudan(){


        southSudan = new JFrame();//initializes JFrame
        southSudan.setBackground(Color.black);
        southSudan.setTitle("Menu");
        southSudan.setSize(1440, 810);
        southSudan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        southSudan.setResizable(false);
        southSudan.setLayout(null);//guis go exactly where I put them
        southSudan.setContentPane(new JLabel(new ImageIcon("southSudan.png")));

        Icon bridalIcon = new ImageIcon("weddingDress.png");
        traditionalBridalAttire = new JButton(bridalIcon);
        traditionalBridalAttire.setOpaque(false);
        traditionalBridalAttire.setContentAreaFilled(false);
        traditionalBridalAttire.setBorderPainted(false);
        traditionalBridalAttire.setBounds(717,200, 450, 253);
        traditionalBridalAttire.addActionListener(this);
        traditionalBridalAttire.setFocusable(false);
        if(traditional){//check to see if it was clicked before, if it was its green same for all
            Icon weddingDressD = new ImageIcon("weddingDressDone.png");//green outline
            traditionalBridalAttire.setIcon(weddingDressD);//change the outline
            southSudan.repaint();
        }
        traditionalBridalAttire.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                traditional = true;
                Icon weddingDressD = new ImageIcon("weddingDressDone.png");
                traditionalBridalAttire.setIcon(weddingDressD);
                southSudan.dispose();
                new quiltPop("wedding");
            }
        });

        Icon choreIcon = new ImageIcon("choreTools.png");
        choreTools = new JButton(choreIcon);
        choreTools.setOpaque(false);
        choreTools.setContentAreaFilled(false);
        choreTools.setBorderPainted(false);
        choreTools.setBounds(850,600, 300, 169);
        choreTools.addActionListener(this);
        choreTools.setFocusable(false);
        if(chore){//check if it was clicked
            Icon choreToolD = new ImageIcon("choreToolsDone.png");
            choreTools.setIcon(choreToolD);
            southSudan.repaint();
        }
        choreTools.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                chore = true;
                Icon choreToolD = new ImageIcon("choreToolsDone.png");
                choreTools.setIcon(choreToolD);
                southSudan.dispose();
                new quiltPop("chore");
            }
        });

        Icon religionIcon = new ImageIcon("religion.png");

        religion = new JButton(religionIcon);
        religion.setOpaque(false);
        religion.setContentAreaFilled(false);
        religion.setBorderPainted(false);
        religion.setBounds(175,110, 450, 253);
        religion.addActionListener(this);
        religion.setFocusable(false);
        if(relig){//check if it was clicked
            Icon religD = new ImageIcon("religionDone.png");
            religion.setIcon(religD);
            southSudan.repaint();
        }
        religion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                relig = true;
                Icon religD = new ImageIcon("religionDone.png");
                religion.setIcon(religD);
                southSudan.dispose();
                new quiltPop("relig");
            }
        });

        Icon bedIcon = new ImageIcon("quilt.png");
        oldBedding = new JButton(bedIcon);
        oldBedding.setOpaque(false);
        oldBedding.setContentAreaFilled(false);
        oldBedding.setBorderPainted(false);
        oldBedding.setBounds(185,423, 500, 282);
        oldBedding.addActionListener(this);
        oldBedding.setFocusable(false);
        if(old){//check if it was clicked
            Icon quilD = new ImageIcon("quiltDone.png");
            oldBedding.setIcon(quilD);
            southSudan.repaint();


        }
        oldBedding.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                old = true;
                Icon quilD = new ImageIcon("quiltDone.png");
                oldBedding.setIcon(quilD);
                southSudan.dispose();
                new quiltPop("quilt");
            }
        });

        Icon set = new ImageIcon("continueQuiz.png");
        quiz = new JButton(set);
        quiz.setOpaque(false);
        quiz.setContentAreaFilled(false);
        quiz.setBorderPainted(false);
        quiz.setBounds(990, 700, 581, 77);
        quiz.addActionListener(this);
        quiz.setFocusable(false);
        quiz.setVisible(true);
        quiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                southSudan.dispose();//move on to quizz
                new quiz("southSudan");
            }
        });

        Icon returner = new ImageIcon("return.png");
        toMap = new JButton(returner);//allows them to return to map without badge
        toMap.setBounds(5,715,300,44);
        toMap.addActionListener(this);
        toMap.setFocusable(false);
        toMap.setOpaque(false);
        toMap.setContentAreaFilled(false);
        toMap.setBorderPainted(false);
        toMap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                southSudan.dispose();
                new MainMenu();
            }
        });
        southSudan.add(toMap);


        southSudan.add(traditionalBridalAttire);
        southSudan.add(religion);
        southSudan.add(choreTools);
        southSudan.add(oldBedding);
        southSudan.setVisible(true);

        new Thread(() -> {//constantly checking if they can move on to quiz
            if(!MainMenu.southSudanComplete) {
                while (!(traditional && chore && old && relig)) {
                    System.out.println("working");//for some reason it only works when there is a print statement
                }
            }
            southSudan.add(quiz);
            southSudan.repaint();
        }).start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
