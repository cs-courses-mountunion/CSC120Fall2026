/**
 *
 * File:  Logo.java
 * 
 * Author: 
 * 
 * Description:
 * 
 */

import java.awt.*;

public class Logo {

    private Integer anchorX;
    private Integer anchorY;
    private Integer width;
    private Integer height;
    private String  name;
    private Color   aColor;
    
    
    public Logo(Integer x, Integer y, Integer w, Integer h, String n, Color c) {
        anchorX = x;
        anchorY = y;
        width = w;
        height = h;
        name = n;
        aColor = c;
    } // end of constructor
    
    
    public void draw( Graphics g ) {
        
    } // end of draw()
    
    
    public String toString() {
        return "My name is " + name + " and I am a Logo that is "
                + width + " wide and " + height + " high";
    } // end of toString()
    
    
} // end of class Logo
