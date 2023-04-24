import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//  <applet code = "question5" width = 300 height = 300>
//    </applet>

public class question5 extends Applet implements ActionListener {
    private Button redButton;
    private Button blueButton;
    private String message;

    @Override
    public void init() {
        // Create two buttons with labels "RED" and "BLUE"
        redButton = new Button("RED");
        blueButton = new Button("BLUE");

        // Add action listeners to the buttons
        redButton.addActionListener(this);
        blueButton.addActionListener(this);

        // Add the buttons to the applet window
        add(redButton);
        add(blueButton);
    }

    @Override
    public void paint(Graphics g) {
        // Display the message in the applet window
        g.drawString(message, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Handle button click events
        if (e.getSource() == redButton) {
            // Set the message to "you have pressed RED"
            message = "you have pressed RED";
            repaint(); // Update the applet window
        } else if (e.getSource() == blueButton) {
            // Set the message to "you have pressed BLUE"
            message = "you have pressed BLUE";
            repaint(); // Update the applet window
        }
    }
}