/**
    Author:  John Kirchmeyer
    Created: January 15, 2015
*/
import java.awt.*;

public class Boat {

    // property declarations
        // Note:  anchorX and anchorY represent the upper left corner of the body of this boat.
        //        boatName represents the the name of this boat
		
    private Integer anchorX, anchorY;
    private String boatName;

	
    public Boat(String n, Integer over, Integer down) {
        boatName = n;
        anchorX = over;
        anchorY = down;
    } // end of constructor

	
    public void draw(Graphics g) {

        // body of the boat
        g.setColor(Color.GRAY);
        g.fillRect(anchorX,      anchorY, 5,  5);
        g.fillRect(anchorX +  5, anchorY, 5, 10);
        g.fillRect(anchorX + 10, anchorY, 5, 15);
        g.fillRect(anchorX + 15, anchorY, 5, 20);
        g.fillRect(anchorX + 20, anchorY, 5, 25);
        g.fillRect(anchorX + 25, anchorY, 75, 30);

        // mast
        g.setColor(new Color(225, 125, 105));
        g.fillRect(anchorX + 50, anchorY - 50, 5, 50);

        // sail
        g.setColor(new Color(240, 240, 240));
        g.fillRect(anchorX + 55, anchorY - 45, 90, 35);

        // lines steadying the mast

		
        // name on the sail

		
        // port holes

		
    } // end of draw

	
    public String toString() {
        String result;
        result = "I'm a Boat named " + boatName + " at (" + anchorX + "," + anchorY + ").";
        return result;
    } // end of toString

} // end of class Boat
