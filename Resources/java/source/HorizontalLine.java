/**
 * HorizontalLine.java
 * 
 * @author cindricbb
 */

import java.awt.*;

public class HorizontalLine {

    private Color color;
    private int   down;
    private int   over;
    private int   width;
                  
    public HorizontalLine(int x, int y, int w, Color c) {
        over = x;
        down = y;
        width = w;
        color = c;
    } // end of constructor
    
    public void draw(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.drawLine(over, down, over+width, down);
        g.setColor(origColor);
    } // end of draw()
    
    
    // setters
    public void setOver( int x ) {
        over = x;
    } // end of setOver
    
    public void setDown( int y ) {
        down = y;
    } // end of setDown
    
    public void setWidth( int w ) {
        width = w;
    } // end of setWidth
    
    public void setColor( Color c ) {
        color = c;
    } // end of setColor

} // end of class HorizontalLine
