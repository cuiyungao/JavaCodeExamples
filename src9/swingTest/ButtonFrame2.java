package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame2 extends JFrame
{
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame2()
    {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        buttonPanel = new JPanel();
        add(buttonPanel);
        makeButton("yellow",Color.YELLOW);
        makeButton("blue",Color.BLUE);
        makeButton("red",Color.RED);
        makeButton("green",Color.GREEN);
    }
    public void makeButton(String name , Color backgroundColor)
    {
        JButton button=new JButton(name);
        buttonPanel.add(button);
        ColorAction action=new ColorAction(backgroundColor);
        button.addActionListener(action);
    }
    /**
     * An action listener that sets the panel's background color.
     */
    private class ColorAction implements ActionListener
    {
        private Color backgroundColor;
        public ColorAction(Color c)
        {
            backgroundColor = c;
        }
        public void actionPerformed(ActionEvent event)
        {
            buttonPanel.setBackground(backgroundColor);
        }
    }
}
