/*
    CSC 120 Final Exam Review
    Samantha Student
*/

import java.awt.*;
import javax.swing.*;


public class MUPanel extends JPanel {    
    

    
    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("CSC 120 Final Exam Practice");
        setBackground(Color.ORANGE);
        
    
    
    
    
    
    
    }//end of constructor
    
    	
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

		
		
    } // end of paintComponent()

    
    
    
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
