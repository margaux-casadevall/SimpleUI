import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.*;

public class SimpleUI {
    static GraphicsConfiguration gc;	// Class field containing config info

    public static void main(String[] args) {
        JFrame frame= new JFrame(gc);	// Create a new JFrame
        frame.setSize(500,300);
        frame.getContentPane().add(new ButtonPanel());
        frame.setVisible(true);
        // This next line closes the program when the frame is closed
        frame.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }

}
