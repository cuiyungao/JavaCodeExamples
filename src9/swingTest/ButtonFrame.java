package swingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        JButton YellowButton = new JButton("Yellow");
        JButton BlueButton = new JButton("Blue");
        JButton RedButton = new JButton("Red");

        //重复的步骤，可以创建一个辅助方法
        buttonPanel = new JPanel();
        buttonPanel.add(YellowButton);
        buttonPanel.add(BlueButton);
        buttonPanel.add(RedButton);
        add(buttonPanel);
        ColorAction YellowAction = new ColorAction(Color.YELLOW);
        ColorAction BlueAction = new ColorAction(Color.BLUE);
        ColorAction RedAction = new ColorAction(Color.RED);
        YellowButton.addActionListener(YellowAction);
        BlueButton.addActionListener(BlueAction);
        RedButton.addActionListener(RedAction);
    }

    /**
     * An action listener that sets the panel's background color.
     */
    private class ColorAction implements ActionListener {
        private Color backgroundColor;

        public ColorAction(Color C) {
            backgroundColor = C;
        }

        public void actionPerformed(ActionEvent event) {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}

