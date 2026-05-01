/**
 * VerticalLine.java
 * 
 * @author cindricbb
 */

import java.awt.*;

public class VerticalLine {

    private Color color;
    private int   down;
    private int   height;
    private int   over;
                  
    public VerticalLine(int x, int y, int h, Color c) {
        over = x;
        down = y;
        height = h;
        color = c;
    } // end of constructor
    
    public void draw(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.drawLine(over, down, over, down+height);
        g.setColor(origColor);
    } // end of draw()
    
    
    // setters
    public void setOver( int x ) {
        over = x;
    } // end of setOver
    
    public void setDown( int y ) {
        down = y;
    } // end of setDown
    
    public void setHeight( int h ) {
        height = h;
    } // end of setHeight
    
    public void setColor( Color c ) {
        color = c;
    } // end of setColor

} // end of class VerticalLine
