package pr12.animate;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ButtonWindow extends JFrame implements Action{
    JButton button = new JButton("CLICK ME!");
    public ButtonWindow(){

        super("CLICK BUTTON!");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(200,200);

        setLayout(new BorderLayout());
        button.setSize(200,300);
        button.addActionListener(new ButtonListener());

        add(button, BorderLayout.CENTER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public Object getValue(String key) {
        return null;
    }

    @Override
    public void putValue(String key, Object value) {

    }

    static class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent arg0) {
            try {
                AnimationInWindow animation = new AnimationInWindow();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
