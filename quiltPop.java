import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class quiltPop extends JFrame implements ActionListener {
    private JFrame quiltPopUp;
    private JButton exit;
    private String item;
    public quiltPop(String item_) {
        item = item_;
        quiltPopUp = new JFrame();//initializes JFrame
        quiltPopUp.setBackground(Color.black);
        quiltPopUp.setTitle("Menu");
        quiltPopUp.setSize(1440, 810);
        quiltPopUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        quiltPopUp.setResizable(false);
        quiltPopUp.setLayout(null);//guis go exactly where I put them
        quiltPopUp.setContentPane(new JLabel(new ImageIcon(fileReturn(item))));

        Icon done = new ImageIcon("doneButton.png");
        exit = new JButton(done);
        exit.setBounds(566, 650,308, 76);
        exit.addActionListener(this);
        exit.setFocusable(false);
        exit.setOpaque(false);
        exit.setContentAreaFilled(false);
        exit.setBorderPainted(false);
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                quiltPopUp.dispose();
                new southSudan();
            }
        });
        quiltPopUp.add(exit);
        quiltPopUp.setVisible(true);
    }
    public String fileReturn(String items){
        return switch (items) {
            case "quilt" -> "quiltPop.png";
            case "wedding" -> "weddingPop.png";
            case "relig" -> "religionPop.png";
            case "chore" -> "chorePop.png";
            default -> "No";
        };
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
