
import java.awt.*;

public class SportsCar {

    private String make, model;
    private Integer doors, over, down;


    public SportsCar(String mk, String mdl, Integer d, Integer x, Integer y) {
        
        make  = mk;
        model = mdl;
        doors = d;
        over  = x;
        down  = y;
        System.out.println("Just made a new sportscar object.");

    } // end of constructor


    public Integer getDoors() {

	    return doors;

    } // end of getDoors()


    public void setDoors(Integer d) {
        
        doors = d;
		
    } // end of setDoors
    
    public void draw(Graphics g) {

        // body
        g.setColor( Color.MAGENTA );
        g.fillRect( over, down, 100, 40 );
        g.setColor( Color.BLACK );
        g.fillOval( over+10, down+30, 20, 20 );
        g.fillOval( over+70, down+30, 20, 20 );
        g.drawString(make+" "+model, over+5, down+60);

    } // end of draw()

    public String toString() {
        
        return "A " + make + " " + model + " sportscar"
                + " with " + doors + " doors.";

    } // end of toString()

} // end of class SportsCar
