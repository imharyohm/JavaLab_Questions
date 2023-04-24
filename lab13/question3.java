import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

//  <applet code = "question3" width = 500 height = 500>
//    </applet>

public class question3 extends Applet {

    @Override
    public void paint(Graphics g) {
        // Set the background color
        setBackground(Color.white);

        // Draw a yellow filled circle for the face
        g.setColor(Color.yellow);
        g.fillOval(100, 100, 200, 200);

        // Draw black circles for the eyes
        g.setColor(Color.black);
        g.fillOval(150, 160, 40, 40);
        g.fillOval(250, 160, 40, 40);

        // Draw a curved line for the smile
        g.setColor(Color.black);
        g.drawArc(130, 170, 150, 100, 180, 180);
    }
}