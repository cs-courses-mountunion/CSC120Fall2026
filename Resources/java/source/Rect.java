/**
 * Rect.java
 * 
 * @author cindricbb
 */

import java.awt.*;

public class Rect {

    private Color color;
    private int   down;
    private int   height;
    private int   over;
    private int   width;
                  
    public Rect(int x, int y, int w, int h, Color c) {
        over = x;
        down = y;
        width = w;
        height = h;
        color = c;
    } // end of constructor
    
    public void draw(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.drawRect(over, down, width, height);
        g.setColor(origColor);
    } // end of draw()
    
    public void fill(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.fillRect(over, down, width, height);
        g.setColor(origColor);       
    } // end of fill()
    
    public void fillWithBorder(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.fillRect(over, down, width, height);
        g.setColor(Color.BLACK);
        g.drawRect(over, down, width, height);
        g.setColor(origColor);        
    } // end of fillWithBorder()
    
    public void fillWithBorder(Graphics g, Color borderColor) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.fillRect(over, down, width, height);
        g.setColor(borderColor);
        g.drawRect(over, down, width, height);
        g.setColor(origColor);        
    } // end of fillWithBorder()
    
    
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

} // end of class Rect
