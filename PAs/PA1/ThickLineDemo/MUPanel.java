/*
    Mount Union Computer Science
    
    Demo of Setting Line Thickness
    Requires the use of a Graphics2D object
        and the setStroke method from the Graphics2D class

*/

import java.awt.*;
import javax.swing.*;

public class MUPanel extends JPanel {

    
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(600, 400));
        setName("Setting Line Thickness in Java");
        setBackground(Color.BLACK); 

    } // end of MUPanel constructor
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        
        g.setColor(Color.GREEN);
        // default line width is 1 pixel
        g.drawLine(50, 50, 150, 50);
        g.drawLine(50, 50, 50, 250);
        g.drawLine(50, 125, 125, 125);
        g.drawArc(125, 175, 75, 75, 75, 210);
        
        // declare a Graphics2D object and link it to g
        Graphics2D g2d = (Graphics2D) g;
        
        g.setColor(Color.YELLOW);
        g2d.setStroke( new BasicStroke(5) ); // 5 pixels for line width;
        // now all lines drawn with g will be 5 pixels wide
        g.drawLine(250, 50, 350, 50);
        g.drawLine(250, 50, 250, 250);
        g.drawLine(250, 125, 325, 125);
        g.drawArc(325, 175, 75, 75, 75, 210);
        
        g.setColor(Color.RED);
        g2d.setStroke( new BasicStroke(15) ); // 15 pixels for line width;
        // now all lines drawn with g will be 15 pixels wide
        g.drawLine(450, 50, 550, 50);
        g.drawLine(450, 50, 450, 250);
        g.drawLine(450, 125, 525, 125);
        g.drawArc(525, 175, 75, 75, 75, 210);
        
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
