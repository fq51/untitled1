import javax.swing.*;

public class Frame1 extends JFrame {
    private JButton button1;
    private JPanel panel;

    public Frame1(){
        setTitle("1");
        setContentPane(panel);
        setBounds(100,100,200,200);
        setVisible(true);

        button1.addActionListener((event)->{
            new Frame2(getX(), getY(), getWidth(), getHeight());
            dispose();
        });

    }
}
