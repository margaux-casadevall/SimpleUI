import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonPanel extends JPanel {
    JButton Butt1 = new JButton("Kiss here");

    public ButtonPanel() {
        Butt1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Thank you ;)");
            }
        });
        add(Butt1);
    }
}


