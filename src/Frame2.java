import javax.swing.*;
import java.util.jar.JarEntry;

public class Frame2 extends JFrame {
    private JPanel panel;

    public Frame2(int x, int y, int width, int height){
        setTitle("2");
        setContentPane(panel);
        setBounds(x,y,width,height);
        setVisible(true);

    }
}
