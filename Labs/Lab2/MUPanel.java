/*
    CSC 120 Lab 2
    Samantha Student
    Today's Date

    Description:
    This program creates a picture of a house, tree, and happy-face sun.
    The purpose is to practice using methods of the Graphics class.
*/

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    // Declare private data here
    
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("CSC 120 Lab 2");
        setBackground(Color.WHITE); 

        // Instantiate objects and initialize data here
        
        
    } // end of MUPanel constructor
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // The house
        g.setColor(Color.BLACK);
        g.drawRect(200, 150, 200, 100);
		
        // The roof


		// The window
        g.setColor(Color.YELLOW);
        g.fillRect(225, 180, 90, 40);
        g.setColor(Color.BLACK);
        g.drawRect(225, 180, 90, 40);
		
		
        // The door and doorknob



        // The tree

    
        // The sun


    } // end of paintComponent()

    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void frame()
    {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);   
        
    } // end of frame()

    public static void main(String args[]){new MUPanel().frame();}

}
