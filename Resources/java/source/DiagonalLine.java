/**
 * DiagonalLine.java
 * 
 * @author cindricbb
 */

import java.awt.*;

public class DiagonalLine {

    private Color color;
    private int   down;
    private int   height;
    private int   over;
    private int   width;
                  
    public DiagonalLine(int x, int y, int w, int h, Color c) {
        over = x;
        down = y;
        width = w;
        height = h;
        color = c;
    } // end of constructor
    
    public void drawLeftToRight(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.drawLine(over, down, over+width, down+height);
        g.setColor(origColor);
    } // end of drawLeftToRight()
    
    public void drawRightToLeft(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.drawLine(over+width, down, over, down+height);
        g.setColor(origColor);
    } // end of drawRightToLeft()
    
    public void drawBothWithBoundingRectangle(Graphics g){
        Color origColor = g.getColor();
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(over, down, width, height);
        g.setColor(color);
        g.drawLine(over, down, over+width, down+height);
        g.drawLine(over+width, down, over, down+height);
        g.setColor(origColor);   
    } // end of drawBothWithBoundingRectangle()

    
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
    
    public void setHeight( int h ) {
        height = h;
    } // end of setHeight
    
    public void setColor( Color c ) {
        color = c;
    } // end of setColor

} // end of class DiagonalLine
