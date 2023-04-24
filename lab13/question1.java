import java.applet.Applet;
import java.awt.Graphics;

 <applet code = "question1" width = 300 height = 300>
   </applet>

public class question1 extends Applet {

    String rollNo = "12345";
    String name = "John Doe";
    String branch = "Computer Science";
    String section = "A";

    @Override
    public void paint(Graphics g) {
        g.drawString("Roll No: " + rollNo, 20, 20); // Display Roll No
        g.drawString("Name: " + name, 20, 40); // Display Name
        g.drawString("Branch: " + branch, 20, 60); // Display Branch
        g.drawString("Section: " + section, 20, 80); // Display Section
    }
}