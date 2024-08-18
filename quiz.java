import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quiz extends JFrame implements ActionListener {
    private String country;
    private JFrame quiz;
    private JLabel quizLabel;
    private JButton back;
    private JButton toMap;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private JButton answer;
    private JButton done;
    private JLabel badge;
    private JLabel score;
    private int questionNum = 0;
    public static int correctAnswerCount = 0;


    public quiz(String country_){
        country = country_;
        quiz = new JFrame();
        quiz.setBackground(Color.white);
        quiz.setForeground(Color.white);
        quiz.setTitle("quiz");
        quiz.setSize(1440,810);
        quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quiz.setResizable(false);
        quiz.setLayout(null);
        //quiz.setContentPane(new JLabel(new ImageIcon("question1.png")));

        //Icon test = new ImageIcon("question1.png");

        answer = new JButton();
        answer.setOpaque(false);
        answer.setContentAreaFilled(false);
        answer.setBorderPainted(false);
        answer.setBounds(170, 350, 805, 76);
        answer.addActionListener(this);
        answer.setFocusable(false);
        answer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                southSudanQuiz();

            }
        });
        quiz.add(answer);

        a = new JButton();
        a.setOpaque(false);
        a.setContentAreaFilled(false);
        a.setBorderPainted(false);
        a.setBounds(170, 350, 805, 76);
        a.addActionListener(this);
        a.setFocusable(false);
        a.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((questionNum == 1) || (questionNum == 5)){
                    correctAnswerCount++;
                }
                answer.setVisible(true);

            }
        });
        quiz.add(a);

        b = new JButton();
        b.setOpaque(false);
        b.setContentAreaFilled(false);
        b.setBorderPainted(false);
        b.setBounds(170, 440, 805, 76);
        b.addActionListener(this);
        b.setFocusable(false);
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                answer.setVisible(true);

            }
        });
        quiz.add(b);

        c = new JButton();
        c.setOpaque(false);
        c.setContentAreaFilled(false);
        c.setBorderPainted(false);
        c.setBounds(170, 530, 805, 76);
        c.addActionListener(this);
        c.setFocusable(false);
        c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if((questionNum == 3) || (questionNum == 4)){
                    correctAnswerCount++;
                }
                answer.setVisible(true);

            }
        });
        quiz.add(c);

        d = new JButton();
        d.setOpaque(false);
        d.setContentAreaFilled(false);
        d.setBorderPainted(false);
        d.setBounds(170, 620, 805, 76);
        d.addActionListener(this);
        d.setFocusable(false);
        d.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(questionNum==2){
                    correctAnswerCount++;
                }
                answer.setVisible(true);

            }
        });
        quiz.add(d);

        Icon fini = new ImageIcon("doneButton.png");
        done = new JButton(fini);
        done.setOpaque(false);
        done.setContentAreaFilled(false);
        done.setBorderPainted(false);
        done.setBounds(937, 110, 308, 76);
        done.addActionListener(this);
        done.setFocusable(false);
        done.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(correctAnswerCount == 5){
                    MainMenu.southSudanComplete = true;
                }
                quiz.dispose();
                new MainMenu();

            }
        });
        done.setVisible(true);
        quiz.add(done);

        score = new JLabel(new ImageIcon(scoreReturn(correctAnswerCount)));
        score.setBounds(400, 320, 35, 62);
        score.setVisible(false);
        quiz.add(score);

        badge = new JLabel(new ImageIcon("badge.png"));
        badge.setForeground(Color.blue);
        badge.setBounds(45,150, 1440, 810);
        badge.setVisible(false);
        quiz.add(badge);

        quizLabel = new JLabel();
        quizLabel.setForeground(Color.blue);
        quizLabel.setBounds(0,0, 1440, 810);
        quizLabel.setVisible(true);
        quiz.add(quizLabel);
//        back = new JButton("back");//return to map and restudy
//        back.setBounds(10,450,110,25);
//        back.addActionListener(this);
//        back.setFocusable(false);
//        back.setPreferredSize((new Dimension(130, 25)));
//        back.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                quiz.dispose();
//                switch (country) {
//                    case "southSudan" -> new southSudan();
//                    case "cambodia" -> new cambodia();
//                }
//            }
//        });
//        quiz.add(back);
//
//        toMap = new JButton("return to map");//allows them to return to map without badge
//        toMap.setBounds(203,450,130,25);
//        toMap.addActionListener(this);
//        toMap.setFocusable(false);
//        toMap.setPreferredSize((new Dimension(130, 25)));
//        toMap.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                quiz.dispose();
//                new MainMenu();
//            }
//        });
//        quiz.add(toMap);
        quiz.setVisible(true);
        switch (country) {
            case "southSudan" -> southSudanQuiz();
            case "cambodia" -> cambodiaQuiz();
        }
    }
    public void southSudanQuiz(){//need code only make true if they pass quiz
        System.out.println("test");
        quizLabel.setIcon(new ImageIcon(fileReturnSudan(questionNum)));
        quiz.repaint();
    }
    public void cambodiaQuiz(){
        MainMenu.cambodiaCopmlete = true;
        //new MainMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
    private String fileReturnSudan(int questionNum_){
        answer.setVisible(false);
        switch (questionNum_) {
            case 0 -> {
                Icon qa = new ImageIcon("q1a.png");
                a.setIcon(qa);
                Icon qb = new ImageIcon("q1b.png");
                b.setIcon(qb);
                Icon qc = new ImageIcon("q1c.png");
                c.setIcon(qc);
                Icon qd = new ImageIcon("q1d.png");
                d.setIcon(qd);
                Icon answe = new ImageIcon("answerA.png");
                answer.setIcon(answe);
                questionNum++;
                answer.setBounds(170, 350, 805, 76);
                return "question1.png";
            }
            case 1 -> {
                Icon qa = new ImageIcon("q2a.png");
                a.setIcon(qa);
                Icon qb = new ImageIcon("q2b.png");
                b.setIcon(qb);
                Icon qc = new ImageIcon("q2c.png");
                c.setIcon(qc);
                Icon qd = new ImageIcon("q2d.png");
                d.setIcon(qd);
                Icon answe = new ImageIcon("answerD.png");
                answer.setIcon(answe);
                questionNum++;
                answer.setBounds(170, 620, 805, 76);
                return "question2.png";
            }
            //file 2
            case 2 -> {
                Icon qa = new ImageIcon("q3a.png");
                a.setIcon(qa);
                Icon qb = new ImageIcon("q3b.png");
                b.setIcon(qb);
                Icon qc = new ImageIcon("q3c.png");
                c.setIcon(qc);
                Icon qd = new ImageIcon("q3d.png");
                d.setIcon(qd);
                Icon answe = new ImageIcon("answerC.png");
                answer.setIcon(answe);
                questionNum++;
                answer.setBounds(170, 530, 805, 76);
                return "question3.png";
            }
            //file 3
            case 3 -> {
                Icon qa = new ImageIcon("q4a.png");
                a.setIcon(qa);
                Icon qb = new ImageIcon("q4b.png");
                b.setIcon(qb);
                Icon qc = new ImageIcon("q4c.png");
                c.setIcon(qc);
                Icon qd = new ImageIcon("q4d.png");
                d.setIcon(qd);
                Icon answe = new ImageIcon("answerC.png");
                answer.setIcon(answe);
                questionNum++;
                answer.setBounds(170, 530, 805, 76);
                return "question4.png";
            }
            //file 4
            case 4 -> {
                Icon qa = new ImageIcon("q5a.png");
                a.setIcon(qa);
                Icon qb = new ImageIcon("q5b.png");
                b.setIcon(qb);
                Icon qc = new ImageIcon("q5c.png");
                c.setIcon(qc);
                Icon qd = new ImageIcon("q5d.png");
                d.setIcon(qd);
                Icon answe = new ImageIcon("answerA.png");
                answer.setIcon(answe);
                questionNum++;
                answer.setBounds(170, 350, 805, 76);
                return "question5.png";
            }
            case 5 ->{
                a.setVisible(false);
                b.setVisible(false);
                c.setVisible(false);
                d.setVisible(false);
                System.out.println(correctAnswerCount);
                badge.setVisible(true);
                score.setIcon(new ImageIcon(scoreReturn(correctAnswerCount)));
                score.setVisible(true);

                return "question6.png";
            }
            //file 5
            default -> {
                return "error";
            }
        }
    }
    public String scoreReturn(int i){
        System.out.println(i);
        return switch (i) {
            case 0 -> "0.png";
            case 1 -> "1.png";
            case 2 -> "2.png";
            case 3 -> "3.png";
            case 4 -> "4.png";
            case 5 -> "5.png";
            default -> "f";
        };
    }
}
