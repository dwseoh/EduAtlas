import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Front extends JFrame implements ActionListener {
    private JFrame cover;
    private JButton start;
    public Front(){
        cover = new JFrame();
        cover.setSize(1440, 810);
        cover.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cover.setResizable(false);
        cover.setLayout(null);
        cover.setContentPane(new JLabel(new ImageIcon("Assets/front.png")));

        Icon starter = new ImageIcon("Assets/start.png");
        start = new JButton(starter);
        start.setBounds(1000, 550,300, 300);
        start.addActionListener(this);
        start.setFocusable(false);
        start.setOpaque(false);
        start.setContentAreaFilled(false);
        start.setBorderPainted(false);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cover.dispose();
                new MainMenu();
            }
        });
        cover.add(start);
        cover.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
