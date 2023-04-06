import javax.swing.*;
import java.awt.*;

public class MyLayout extends JFrame {

    JButton button1 = new JButton("Button 1");
    JButton button2 = new JButton("Button 2");
    JButton button3 = new JButton("Button 3");
    JButton button4 = new JButton("Button 4");
    JButton button5 = new JButton("Button 5");

    public MyLayout() {
        setTitle("Flow Layout Example");
        setBounds(100, 200, 500, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(button4, 0);
        c.add(button5, 1);

        GridLayout g = new GridLayout();
        // g.setVgap(10);
        // g.setHgap(20);
        c.setLayout(g);

    }

    public static void main(String[] args) {
        new MyLayout();
    }

}
