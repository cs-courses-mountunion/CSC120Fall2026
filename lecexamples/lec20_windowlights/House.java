import java.awt.*;

public class House {
    
    private Integer over, down;
    private Window w1, w2, w3;
    
    public House(Integer x, Integer y) {
        over = x;
        down = y;
        w1 = new Window(over + 10, down+15, true);
        w2 = new Window(over + 100, down+15, false);
        w3 = new Window(over + 55, down+60, true);
        
    } // end of constructor
    
    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawRect(over, down, 150, 100);
        g.drawLine(over, down, over+75, down-60);
        g.drawLine(over+75, down-60, over+150, down);
        
        w1.draw(g);
        w2.draw(g);
        w3.draw(g);
    } // end of draw()
    
    public void turnLightsOn() {
        w1.turnLightsOn();
        w2.turnLightsOn();
        w3.turnLightsOn();
    } // end of turnLightsOn
    
    public void turnLightsOff() {
        w1.turnLightsOff();
        w2.turnLightsOff();
        w3.turnLightsOff();
    } // end of turnLightsOff
    
    public void toggleLights() {
        w1.toggleLights();
        w2.toggleLights();
        w3.toggleLights();
    } // end of turnLightsOn
    
} // end of class House
