package swingTest;

import javax.swing.*;
import java.awt.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonFrame2Test {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(()->{
                    JFrame frame=new ButtonFrame2();
                    frame.setTitle("ListenerTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}
