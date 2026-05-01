/*
    CSC 120 Exam 1 Review Problem b
    Samantha Student
    Today's Date

    Declare, instantiate, and use SportsCar objects.

    Before you run the program, write down
    what you think will be the output in the Java Console, and in the
    output window. Pretend you are the computer, and trace the execution
    steps and method calls one line at a time.

    After you've written down on paper what you think the output will be,
    check yourself by running the program.
*/

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {
    
    private SportsCar car1, car2;
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("CSC 120 Exam 1 Review Problem b");
        setBackground(Color.WHITE);
        
        
        car1 = new SportsCar("Toyota", "Celica", 4, 300, 300);
        car2 = new SportsCar("Ford", "Mustang", 2, 10, 10);
        
        System.out.println("car1 = " + car1.toString());
        System.out.println("car2 = " + car2.toString());
        
        car1.setDoors(5);
        System.out.println("car1 now = " + car1.toString());

    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        car1.draw(g);
        car2.draw(g);

    } // end of method paintComponent
    
    // Add other methods here:
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel().frame();}

} // end of class MUPanel
