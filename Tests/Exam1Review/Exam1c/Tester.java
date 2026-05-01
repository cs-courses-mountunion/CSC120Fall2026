/*
 * Tester.java
 * Exam 1 Review Problem c
 *
 * Acknowledgements: Tester created by Louise Moses, Fall, 2006
 * Modified by John Kirchmeyer, Spring, 2007 [draw lines differently]
 * This comment modified by K. Weber, Spring, 2012. (Changed MUCJapplet.java to MUPanel.java.)
 */

import java.awt.*;
public class Tester {
    
    private Integer over, down, width, height;
    private Color testerColor, lineColor;
    
    public Tester(Integer x, Integer y, Integer size) {
        over = x;
        down = y;
        width = size;
        height = size;
        testerColor = Color.BLACK;
        lineColor = Color.WHITE;
    } // constructor
    
    public void draw(Graphics g) {
        g.setColor(testerColor);
        g.fillRect(over, down, width, height);
        g.setColor(lineColor);
        g.drawLine(over, down, over + width, down + height);
        g.drawLine(over, down + height/2, over + width, down + height/2);
        g.drawLine(over, down + height, over + width, down);
    } // end of draw()
    
    public void setTesterColor( Color c ) {
        testerColor = c;
        if (testerColor.equals(Color.WHITE) ) {
            lineColor = Color.BLACK;
        }
    } // end of setTesterColor()
	
} // end of class Tester
