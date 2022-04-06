package swingTest;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ButtonFrameTest {
    public static void main(String[] args)
    {
        EventQueue.invokeLater(()->{
                    JFrame frame=new ButtonFrame();
                    frame.setTitle("ListenerTest");
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setVisible(true);
                }
        );
    }
}