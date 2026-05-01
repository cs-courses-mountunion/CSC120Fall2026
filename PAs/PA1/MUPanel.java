/* CSC 120 Programming Assignment 1
 * Alice Jones
 * 9-8-2017
 *
 * Project Description: First programming assignment.
 *
 * Acknowledgements: Referenced previous labs made in class. Ran to Google 
 *  and my brother for help on a few occasions. All work is my own.
 *
 * Enhancements: 
 *  - Defined my own color for multiple objects in the project. 
 *  - Changed the font of the drawString method.
 *  - Created an additional class to put a box around the title.
 *
 */

import java.awt.*;
import java.util.HashSet;
import javax.swing.*;

public class MUPanel extends JPanel {

    // 1. Declare private objects here:
    
        private Citizens person1, person2, person3;
        private Cars     car1, car2, car3;
        private TitleBox box1;

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(800, 800));
        setName("PA1");
        setUp();
        setBackground(new Color(153, 204, 255));

        // 2. Instantiate objects here by calling "new":
            
            // REF: Citizens(x, y, name, skin color, shirt color, pants color)
            person1 = new Citizens( 50, 150, "Jimbob"      , new Color(92, 56, 54)   , new Color(255, 26, 255) , new Color(102, 0, 102));
            person2 = new Citizens(150, 350, "Sally"       , new Color(255, 220, 178), new Color(255, 153, 153), new Color(255, 255, 204));
            person3 = new Citizens(250, 550, "Michelangelo", new Color(229, 160, 115), new Color(26, 198, 255) , new Color(51, 51, 153));
            
            // REF: (x, y, name, car color)
            car1 = new Cars(137, 110, "Jimbob's"       , new Color(230, 46, 0));
            car2 = new Cars(237, 310, "Sally's"        , new Color(255, 255, 153));
            car3 = new Cars(337, 510, "Michelangelo's" , new Color(0, 179, 60));
            
            // REF: Citizens(x, y, color)
            box1 = new TitleBox(410, 50, new Color(51, 51, 255));
        
        //Display in the Java console
        
            System.out.println(person1.toString());
            System.out.println(person2.toString());
            System.out.println(person3.toString());

            System.out.println(car1.toString());
            System.out.println(car2.toString());
            System.out.println(car3.toString());
            
            System.out.println(box1.toString());
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

        // 3. Call methods of objects here:
        
            person1.draw(g);
            person2.draw(g);
            person3.draw(g);

            car1.draw(g);
            car2.draw(g);
            car3.draw(g);
            
            box1.draw(g);
            
            // font for drawString
            Font tr = new Font("TimesRoman", Font.PLAIN, 18);
            g.setFont(tr);
            g.setColor(new Color(51, 51, 255));
            g.drawString("\"Tiny People & Their Cars\" by Faith Haiss", 425, 75);
		
		
    } // end of paintComponent()
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void setUp() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel();}

} // end of class MUPanel
