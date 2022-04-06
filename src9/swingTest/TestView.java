package swingTest;

//https://www.geek-share.com/detail/2652038835.html
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class TestView extends JPanel{
    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private List<ActionListener> listeners;
    public void addActionListener(ActionListener actionlistener){
        listeners.add(actionlistener);
    }
    public void setTextArea(String text){
        textArea.setText(text);
    }

    public TestView() {
        listeners=new ArrayList<ActionListener>();
        setLayout(null);
        textArea=new JTextArea();
        textArea.setBounds(20, 20, 400, 100);
        add(textArea);
        JButton textbtn=new JButton("Show Message");
        textbtn.setBounds(120, 140, 150, 40);
        add(textbtn);
        textbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<listeners.size();++i){
                    listeners.get(i).actionPerformed(e);
                }
            }
        });
    }
}
