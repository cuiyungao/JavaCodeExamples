package swingTest;

//https://www.geek-share.com/detail/2652038835.html
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TestController {
    private TestView testview;
    private TestModel testmodel;

    public TestController() {
        testview=new TestView();
        testmodel=new TestModel();
        testview.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("suc...");
                testmodel.setMessage("test...");
                testview.setTextArea(testmodel.getMessage());
            }
        });

    }
    public JPanel getView(){
        return testview;
    }

    public static void main(String[] args) {
        TestController testcontroller=new TestController();
        JFrame frame=new JFrame("TEST");
        frame.setLayout(new BorderLayout());
        frame.setBounds(100, 100, 450, 300);
        frame.getContentPane().add(testcontroller.getView());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

}
