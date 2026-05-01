
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
        setPreferredSize(new Dimension(600, 400));
        setName("Mount Union Java Program");
        setBackground(Color.LIGHT_GRAY);
    } // end of MUPanel constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        int howMany = 7;
        
        int over, down, width, height;
        
        over = 50;
        down = 50;
        width = 15;
        height = 250;
        
        for (Integer count = 1; count <= howMany; count = count + 1 ) {
            
			g.setColor(Color.BLUE);
            g.drawRect(over, down, width, height);
			g.drawString(""+count, over, down+height+15);
            
            over = over + 20;
            
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
