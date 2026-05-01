
/*  CSC 120 Lab 10
 *  
 *  Practice with loops and drawing shapes
 * 
 */


import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 500));
        setName("Mount Union Java Program");
        setBackground(new Color(255, 255, 204));
    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        int howMany = 5;
        
        int over, down, width, height;
        
        over = 50;
        down = 0;
        
        for (int count = 1; count <= howMany; count = count + 1 ) {
            
            System.out.println("over = " + over 
                    + ", down = " + down
                    );
            
            over = over + 25;
            
        } // end for
        
    } // end of method paintComponent
    
        
    
    
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
    }

    public static void main(String args[]){new MUPanel().frame();}

} // end of class MUPanel
