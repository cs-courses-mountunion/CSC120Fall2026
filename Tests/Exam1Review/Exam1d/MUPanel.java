/*
    CSC 120 Exam 1 Review Problem d
    Samantha Student
    Today's Date

    Description: You are to write a complete class definition for a class called ThingToBeDrawn,
    that is used by this program.

    The values sent to the constructor represent an over and down used for
    position, a String representing the object's name, and a color.
 
    Your ThingToBeDrawn objects can draw a very simple filled rectangle
    using the proper color, and in the proper position.

    (Could you sketch the output window after looking at this code only?)

    Be sure you provide these methods: getAnchorX, setAnchorX, and toString.
*/

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {
    // Declare private data here
    
    private ThingToBeDrawn drawing1, drawing2;
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("CSC 120 Exam 1 Review Problem d");
        setBackground(Color.WHITE);
        
        // Instantiate objects and initialize data here
        drawing1 = new ThingToBeDrawn(50, 40, Color.GREEN, "upper box");
        drawing2 = new ThingToBeDrawn(150, 220, Color.BLUE, "lower box");
        
        drawing1.setAnchorX(drawing1.getAnchorX() + 30);
        System.out.println("drawing1: " + drawing1.toString());
        drawing2.setAnchorX(450);
        System.out.println("drawing2: " + drawing2.toString());
        if ( drawing2.getAnchorX() < drawing1.getAnchorX() ) {
            System.out.println("drawing 2 is the one on the left");
        }
        else {
            System.out.println("drawing 1 is the one on the left");
        }

    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        drawing1.draw(g);
        drawing2.draw(g);

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
