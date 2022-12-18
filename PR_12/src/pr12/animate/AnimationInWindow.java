package pr12.animate;


import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Objects;

public class AnimationInWindow extends JFrame {

    Image[] frames;

    public AnimationInWindow() throws IOException {
        super("Animation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLayout(new FlowLayout());


        frames = new Image[]{
                ImageIO.read(Objects.requireNonNull(AnimationInWindow.class.getResource("resources/0.png"))),
                ImageIO.read(Objects.requireNonNull(AnimationInWindow.class.getResource("resources/1.png"))),
                ImageIO.read(Objects.requireNonNull(AnimationInWindow.class.getResource("resources/2.png"))),
                ImageIO.read(Objects.requireNonNull(AnimationInWindow.class.getResource("resources/3.png"))),
                ImageIO.read(Objects.requireNonNull(AnimationInWindow.class.getResource("resources/4.png"))),
                ImageIO.read(Objects.requireNonNull(AnimationInWindow.class.getResource("resources/5.png"))),
                ImageIO.read(Objects.requireNonNull(AnimationInWindow.class.getResource("resources/6.png"))),
                ImageIO.read(Objects.requireNonNull(AnimationInWindow.class.getResource("resources/7.png"))),
        };


        final JLabel animation = new JLabel(new ImageIcon(frames[0]));
        add(animation, BorderLayout.CENTER);

        ActionListener animate = new ActionListener() {
            private int index = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (index < frames.length - 1) {
                    index++;
                } else {
                    index = 0;
                }
                animation.setIcon(new ImageIcon(frames[index]));
            }
        };
        final Timer timer = new Timer(100, animate);

        timer.start();

        pack();
        setVisible(true);
    }
}
