import java.applet.Applet;
import java.awt.Graphics;


    // <applet code="question4.class" width="200" height="100">
    //     <param name="Employee_ID" value="123">
    //     <param name="EMP_Name" value="John Doe">
    // </applet>
public class question4 extends Applet {
    private String employeeID;
    private String empName;

    @Override
    public void init() {
        // Get the parameters from <PARAM> tags
        employeeID = getParameter("Employee_ID");
        empName = getParameter("EMP_Name");
    }

    @Override
    public void paint(Graphics g) {
        // Display the received parameters in the applet window
        g.drawString("Employee ID: " + employeeID, 100, 100);
        g.drawString("Employee Name: " + empName, 100, 120);
    }
}