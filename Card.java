import javax.swing.*;
import java.awt.*;

public class Card {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100, 100, 500, 400);
        frame.setTitle("Card");
        Container container = frame.getContentPane();

        CardLayout cardLayout = new CardLayout();
        container.setLayout(cardLayout);

        JButton button1 = new JButton("Page 1");
        JButton button2 = new JButton("Page 2");
        JButton button3 = new JButton("Page 3");
        JButton button4 = new JButton("Page 4");

        container.add(button1, "1");
        container.add(button2, "2");
        container.add(button3, "3");
        container.add(button4, "4");

        cardLayout.next(container);
        cardLayout.previous(container);
        cardLayout.first(container);
        cardLayout.last(container);

        cardLayout.show(container, "3");

    }
}
