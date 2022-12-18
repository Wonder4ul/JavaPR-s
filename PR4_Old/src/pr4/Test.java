package pr4;


import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class Test extends JFrame implements ActionListener
{
    private JLabel label1, label2, label3;
    //private JTextField field;

    private int i=0, j=0;
    private String s="N/A";
    public Test()
    {

        super("Milan X Madrid MATCH");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(190, 200));
        ((JPanel) getContentPane()).setBorder(new EmptyBorder(13, 13, 13, 13) );
        setLayout(new FlowLayout());

        JButton btn1 = new JButton("AC Milan");
        btn1.setActionCommand("myButton1");
        btn1.addActionListener(this);

        JButton btn2 = new JButton("Real Madrid");
        btn2.setActionCommand("myButton2");
        btn2.addActionListener(this);

        label1 = new JLabel("Result " + i +" X "+ j);
        label1.setForeground(Color.RED);
        label2 = new JLabel("Last Scorer: " + s);
        label2.setForeground(Color.BLUE);
        label3 = new JLabel("Winner: N/A");
        label3.setForeground(Color.ORANGE);
        add(btn1);
        add(btn2);

        add(label1);
        add(label2);
        add(label3);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getActionCommand().equals("myButton1"))
        {
            i++;
            s="AC Milan";
            label1.setText("Result " + i +" X "+ j);
            label2.setText("Last Scorer: " + s);
        }
        if(e.getActionCommand().equals("myButton2"))
        {
            j++;
            s="Real Madrid";
            label1.setText("Result " + i +" X "+ j);
            label2.setText("Last Scorer: " + s);
        }
        if(i==10) {label3.setText("Winner: AC Milan"); label3.setForeground(Color.GREEN);}
        if(j==10) {label3.setText("Winner: Real Madrid"); label3.setForeground(Color.GREEN);}
        if((i==11)||(j==11)) System.exit(0);
    }

    public static void main(String[] args)
    {
        Test exec= new Test();
        exec.pack();
        exec.setLocationRelativeTo(null);
        exec.setVisible(true);
        exec.setResizable(false);
    }
}
