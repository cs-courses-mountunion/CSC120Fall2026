/**
 * Arc.java
 * 
 * @author cindricbb
 */

import java.awt.*;

public class Arc {
    
    private int   arcAngle;
    private Color color;
    private int   down;
    private int   height;
    private int   over;
    private int   startAngle;
    private int   width;
    
    public Arc(int x, int y, int w, int h, int sA, int aA, Color c) {
        over = x;
        down = y;
        width = w;
        height = h;
        startAngle = sA;
        arcAngle = aA;
        color = c;
    } // end of constructor method
    
    public void draw(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.drawArc(over, down, width, height, startAngle, arcAngle);
        g.setColor(origColor);
    } // end of draw()
    
    public void fill(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.fillArc(over, down, width, height, startAngle, arcAngle);
        g.setColor(origColor);        
    } // end of fill()
    
    public void fillWithBorder(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.fillArc(over, down, width, height, startAngle, arcAngle);
        g.setColor(Color.BLACK);
        g.drawArc(over, down, width, height, startAngle, arcAngle);
        g.setColor(origColor);       
    } // end of fillWithBorder()
    
    public void fillWithBorder(Graphics g, Color borderColor) {
        Color origColor = g.getColor();
        g.setColor(color);
        g.fillArc(over, down, width, height, startAngle, arcAngle);
        g.setColor(borderColor);
        g.drawArc(over, down, width, height, startAngle, arcAngle);
        g.setColor(origColor);       
    } // end of fillWithBorder()
    
    public void drawWithBoundingRectangle(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(over, down, width, height);
        g.setColor(color);
        g.drawArc(over, down, width, height, startAngle, arcAngle);
        g.setColor(origColor);        
    } // end of drawWithBoundingRectangle()
    
    public void fillWithBoundingRectangle(Graphics g) {
        Color origColor = g.getColor();
        g.setColor(Color.LIGHT_GRAY);
        g.drawRect(over, down, width, height);
        g.setColor(color);
        g.fillArc(over, down, width, height, startAngle, arcAngle);
        g.setColor(origColor);               
    } // end of fillWithBoundingRectangle()
    
    
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
    
    public void setStartAngle( int sA ) {
        startAngle = sA;
    } // end of setStartAngle
    
    public void setArcAngle( int aA ) {
        arcAngle = aA;
    } // end of setArcAngle
    
    public void setColor( Color c ) {
        color = c;
    } // end of setColor
    
} // end of class Arc
