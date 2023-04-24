import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

 <applet code = "question2" width = 500 height = 500>
   </applet>

public class question2 extends Applet {

    @Override
    public void init() {
        // Set the background color
        setBackground(Color.white);
    }

    @Override
    public void paint(Graphics g) {
        // Get the applet's size
        int appletWidth = getSize().width;
        int appletHeight = getSize().height;

        // Generate random values for rectangle properties
        int x = (int) (Math.random() * appletWidth);
        int y = (int) (Math.random() * appletHeight);
        int width = (int) (Math.random() * 100);
        int height = (int) (Math.random() * 100);
        int arcWidth = (int) (Math.random() * 50);
        int arcHeight = (int) (Math.random() * 50);
        Color color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256),
                (int) (Math.random() * 256));

        // Draw a rectangle
        g.setColor(color);
        g.drawRect(x, y, width, height);

        // Generate new values for rounded rectangle properties
        x = (int) (Math.random() * appletWidth);
        y = (int) (Math.random() * appletHeight);
        width = (int) (Math.random() * 100);
        height = (int) (Math.random() * 100);
        arcWidth = (int) (Math.random() * 50);
        arcHeight = (int) (Math.random() * 50);
        color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

        // Draw a rounded rectangle
        g.setColor(color);
        g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);

        // Generate new values for 3D rectangle properties
        x = (int) (Math.random() * appletWidth);
        y = (int) (Math.random() * appletHeight);
        width = (int) (Math.random() * 100);
        height = (int) (Math.random() * 100);
        color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

        // Draw a 3D rectangle
        g.setColor(color);
        g.fill3DRect(x, y, width, height, true);

        // Generate new values for filled rectangle properties
        x = (int) (Math.random() * appletWidth);
        y = (int) (Math.random() * appletHeight);
        width = (int) (Math.random() * 100);
        height = (int) (Math.random() * 100);
        color = new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));

        // Draw a filled rectangle
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}