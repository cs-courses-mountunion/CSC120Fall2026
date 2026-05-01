/*
    CSC 120 Lab 6
    RoundHead class

    Class definition for a RoundHead character.
    The character can smile or frown, depending
    on the value of isHappy, and can be asked
    to move. Initially, it only moves up and down, but we will
    modify it to also move sideways.
    If it moves too close to the top or bottom edge
    of the viewer window, it will "turn around"
    and start moving in the opposite direction.

    Acknowledgements:
    The original version of the RoundHead class
    was created by Blase Cindric.

    Modified by John Kirchmeyer to 
	    moveVertically first instead of moveHorizontally.
*/
import java.awt.*;

public class RoundHead {

    private final Integer LEFT_EDGE  = 0;
    private final Integer RIGHT_EDGE  = 600;
    private final Integer TOP_EDGE  = 0;
    private final Integer BOTTOM_EDGE = 500;

    private Boolean isHappy;
    private Color hatColor;
    private Integer over, down;          // corner of the face.
    private Integer size;                // size of face
    private Integer verticalStepSize;    // how far to move
    
    public RoundHead(Boolean startHappiness, Color hc,
                       Integer o, Integer d,
                       Integer vStepSize) {
        isHappy = startHappiness;
        hatColor = hc;
        over = o;
        down = d;
        verticalStepSize = vStepSize;
        size = 30; // fixed size now -- may be changed later
    } // end of constructor

    public void draw(Graphics g) {
        // Draw the RoundHead's face.
        g.setColor(Color.YELLOW);
        g.fillOval(over, down, size, size);

        // Put a black outline around face.
        g.setColor(Color.BLACK);
        g.drawOval(over, down, size, size);

        // Draw the RoundHead's hat.
        g.setColor(hatColor);
        g.fillRect(over, down, size, size/10);
        g.fillRect(over+size/4, down-size/3, size/2, size/3);

        // Draw the RoundHead's facial features in black, based on mood.
        g.setColor(Color.BLACK);

        if (isHappy) {
            g.fillOval(over+size/5, down+3*size/10, size/5, size/5);
            g.fillOval(over+3*size/5, down+3*size/10, size/5, size/5);
            g.drawArc(over+3*size/10, down+size/2, 2*size/5, 3*size/10, 190, 160);
        } // end if
        else {
            g.fillRect(over+size/5, down+3*size/10, size/5, size/10);
            g.fillRect(over+3*size/5, down+3*size/10, size/5, size/10);
            g.drawArc(over+3*size/10, down+7*size/10, 2*size/5, 3*size/10, 10, 160);
        } // end else
		
    } // end of draw()

    public void moveVertically() {
        // Change direction if the move would make the RoundHead
        // go past either the top or bottom edge of the viewer window.
        
        if (   (down + verticalStepSize <= TOP_EDGE)
            || (down + size + verticalStepSize >= BOTTOM_EDGE) ) {
			
            verticalStepSize = -1 * verticalStepSize;
			
        } // end if

        // Now make a vertical move.
        down += verticalStepSize;
		
    } // end of moveVertically()

    public void changeMood() {
	
        isHappy = !isHappy;
		
    } // end of changeMood()

} // end of class RoundHead
