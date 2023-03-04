import javax.swing.*;
import java.awt.*;

public class SimpleCalculator {

    public static void main(String[] args) {
    // Creating a panel
        JPanel windowContent = new JPanel();
        // creating a manager for the panel
        FlowLayout fl = new FlowLayout();
        windowContent.setLayout(fl);
        //creating components in memory store
        JLabel label1 = new JLabel("Number 1:");
        JTextField field1 = new JTextField(10);
        JLabel label2 = new JLabel("Number 2:");
        JTextField field2 = new JTextField(10);
        JLabel label3 = new JLabel("\n Sum:");
        JTextField result = new JTextField(10);
        JButton go = new JButton("Add");

        //adding components for our panel
        windowContent.add(label1);
        windowContent.add(field1);
        windowContent.add(label2);
        windowContent.add(field2);
        windowContent.add(label3);
        windowContent.add(result);
        windowContent.add(go);

        //
        JFrame frame = new JFrame("My Simple model of  MyCalc.Calculator");
        frame.setContentPane(windowContent);
        frame.setSize(400,100);
        frame.setVisible(true);

    }
}
/* JFrame myFrame = new JFrame("Моё  приложение для Windows");
    JButton myButton = new JButton();
    JPanel myPanel = new JPanel();
    */
