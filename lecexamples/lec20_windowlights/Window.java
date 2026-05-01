import java.awt.*;

public class Window {
    
    private Integer over, down;
    private Boolean lightsAreOn;
    
    public Window(Integer x, Integer y, Boolean lights) {
        over = x;
        down = y;
        lightsAreOn = lights;        
    } // end of constructor
    
    public void draw(Graphics g) {

        if ( lightsAreOn == false ) {
            g.setColor(Color.LIGHT_GRAY);
        }
        else {
            g.setColor(Color.YELLOW);
        }
        
        g.fillRect(over, down, 40, 25);
        
        g.setColor(Color.BLACK);
        g.drawRect(over, down, 40, 25);
        g.drawLine(over, down+13, over+40, down+13);
        g.drawLine(over+20, down, over+20, down+25);
    } // end of draw
    
    public void turnLightsOn() {
        lightsAreOn = true;
    } // end of turnLightsOn()
    
    public void turnLightsOff() {
        lightsAreOn = false;
    } // end of turnLightsOff
    
    public void toggleLights() {

        // write Java code to implement this logic:
        
        // if the lights are off,
        //      turn the lights on
        // otherwise,
        //      turn the lights off        
        
        
        
        
    } // end of toggleLights
    
} // end of class Window
