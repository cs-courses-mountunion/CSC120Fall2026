/*  CSC 120 Lab 7b
 *  
 *  Practice with loops and drawing shapes
 * 
 */

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    

    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Mount Union Java Program");
        setUp();
        setBackground(Color.LIGHT_GRAY);

        // 2. Instantiate objects here by calling "new":
        
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        Integer over, down, width, height;
        
        over = 50;
        down = 50;
        width = 15;
        height = 25;
    
        Integer howMany = 25;
        
        for (Integer count = 1; count <= howMany; count++ ) {
            
            g.setColor(Color.BLUE);
            g.fillRect(over, down, width, height);
            g.drawString(""+count, over, down+height+15);
            
            over = over + 20;
            height = height + 10;
            
        } // end for
        
    } // end of paintComponent()
    
    
    
    
       
    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(false);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
