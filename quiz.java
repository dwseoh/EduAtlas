import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quiz extends JFrame implements ActionListener {
    private String country;
    private JFrame quiz;
    private JButton back;
    private JButton toMap;
    private JButton a;
    private JButton b;
    private JButton c;
    private JButton d;
    private int questionNum = 0;
    private int correctAnswerCount = 0;

    public quiz(String country_){
        country = country_;
        quiz = new JFrame();
        quiz.setBackground(Color.black);
        quiz.setTitle("quiz");
        quiz.setSize(363,560);
        quiz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quiz.setResizable(false);
        quiz.setLayout(null);
        quiz.setVisible(true);

        back = new JButton("back");//return to map and restudy
        back.setBounds(10,450,110,25);
        back.addActionListener(this);
        back.setFocusable(false);
        back.setPreferredSize((new Dimension(130, 25)));
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quiz.dispose();
                switch (country) {
                    case "southSudan" -> new southSudan();
                    case "cambodia" -> new cambodia();
                }
            }
        });
        quiz.add(back);

        toMap = new JButton("return to map");//allows them to return to map without badge
        toMap.setBounds(203,450,130,25);
        toMap.addActionListener(this);
        toMap.setFocusable(false);
        toMap.setPreferredSize((new Dimension(130, 25)));
        toMap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quiz.dispose();
                new MainMenu();
            }
        });
        quiz.add(toMap);


        switch (country) {
            case "southSudan" -> southSudanQuiz();
            case "cambodia" -> cambodiaQuiz();
        }
    }
    public void southSudanQuiz(){//need code only make true if they pass quiz
        MainMenu.southSudanComplete = true;
        //new MainMenu();
    }
    public void cambodiaQuiz(){
        MainMenu.cambodiaCopmlete = true;
        //new MainMenu();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
//    private String fileReturnSudan(int questionNum){
//        switch(questionNum){
//            case 0:
//                //file one
//                break;
//            case 1:
//                //file 2
//                break;
//            case 2:
//                //file 3
//                break;
//            case 3:
//                //file 4
//                break;
//            case 4:
//                //file 5
//                break;
//            default:
//                return "error";
//        }
//    }
}
