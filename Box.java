import javax.swing.*;
import java.awt.*;

public class Box {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);
        frame.setTitle("Box");
        Container container = frame.getContentPane();

        BoxLayout boxLayout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(boxLayout);

        JButton button1 = new JButton("button 1");
        JButton button2 = new JButton("button 2 --");
        JButton button3 = new JButton("button 3");
        JButton button4 = new JButton("button 4 ------");

        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button3.setAlignmentX(Component.CENTER_ALIGNMENT);
        button4.setAlignmentX(Component.CENTER_ALIGNMENT);

        container.add(button1);
        container.add(Box.createRigidArea(new Dimension(0, 80)));
        container.add(button2);
        container.add(button3);
        container.add(button4);
    }

    private static Component createRigidArea(Dimension dimension) {
        return null;
    }
}