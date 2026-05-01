/* 
    CSC 120 Lab 6
    Samantha Student
    Today's Date

    Declare, instantiate, and use RoundHead objects.

    Originally authored by various UMU CSIS Dept. faculty
 */

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    private RoundHead firstOne;
    

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 500));
        setName("CSC 120 Lab # 6 -- RoundHeads");
        setUp();
        setBackground(Color.WHITE);

        firstOne  = new RoundHead(true, Color.MAGENTA, 480, 250, -30);

        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!


        firstOne.draw(g);
		
		
    } // end of paintComponent()
    
    
    public void moveObjects() {
        
        firstOne.moveVertically();
        
    } // end of moveObjects()
       
    
    
    
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

    //public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
