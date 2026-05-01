/*
    CSC 120
    Lab 4
  
    Sammy Student 

    Practice with arithmetic and System.out.println
*/

import java.awt.*;
import java.util.*;
import java.text.*;
import javax.swing.*;

public class MUPanel extends JPanel  {
    
    private ClothingItem myFavoriteShirts, otherShirts, bestJeans, jeans2,
                         blackShoes, flipFlops;
    


    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(650, 100));
        setName("CSC 120 Lab # 4");
        setBackground(Color.WHITE); 
        
        
        myFavoriteShirts = new ClothingItem("Old Navy button-downs", "long-sleeved shirt", 25.50, 2);
        otherShirts    = new ClothingItem("A & F tees", "short-sleeved shirt", 35.00, 4);
        bestJeans       = new ClothingItem("Levis 550s", "pair of pants", 47.75, 3);
        jeans2          = new ClothingItem("Wranglers", "pair of pants", 40.00, 1);
        blackShoes      = new ClothingItem("Bass Loafers", "pair of shoes", 74.80, 1);
        flipFlops       = new ClothingItem("Orange Flip Flops", "pair of shoes", 9.95, 5);

        workWithClothingItems();

    } // end of MUPanel constructor
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        g.setFont( new Font("SansSerif", Font.PLAIN, 24));
        g.drawString("Look in Java Console for output", 100, 60);
        
    } // end of paintComponent()

    
    public void workWithClothingItems() {
        DecimalFormat currency = new DecimalFormat("#.00");
        System.out.println("My favorite shirts: " + myFavoriteShirts.toString() );
        System.out.println("Other shirts I own: " + otherShirts.toString() );
        System.out.println();
        System.out.println("I have two kinds of jeans: " + bestJeans.toString() );
        System.out.println("   ... and: " + jeans2.toString() );
        System.out.println();
        System.out.println("Going to class I wear: " + blackShoes.toString() );
        System.out.println("For the beach I have: " + flipFlops.toString() );

        // how many shirts do I have?
        Integer numberOfShirts;
        numberOfShirts = myFavoriteShirts.getQuantity() + otherShirts.getQuantity();
        System.out.println();
        System.out.println("I have " + numberOfShirts + " shirts overall");

        // how much did I spend on A & F tee shirts?
        Double totalSpent;
        totalSpent = otherShirts.getQuantity() * otherShirts.getPrice();
        System.out.println();
        System.out.println("I spent $" + currency.format(totalSpent) + " to buy all of my tee shirts");
        
        
        // change the type of the shoe objects
        blackShoes.setType("pair of dress shoes");
        flipFlops.setType("pair of casual shoes");
        System.out.println();
        System.out.println("Going to class I wear: " + blackShoes.toString() );
        System.out.println("For the beach I wear: " + flipFlops.toString() );
        
        // reduce price of jeans2 object by a discount %
        Double discountPct = 0.0;
        
        //////////////////////////////////////////////////////////////////////
        // UNCOMMENT THE FOLLOWING FOUR LINES IN STEP 4 OF THE LAB DIRECTIONS

//        Scanner kbdInput = new Scanner(System.in);
//        System.out.print("\n");
//        System.out.print("Enter the discount percentage: ");
//        discountPct = kbdInput.nextDouble();

        Double originalPrice, updatedPrice;
        originalPrice = jeans2.getPrice();
        updatedPrice = originalPrice * (100.0 - discountPct)/100.0 ;
        jeans2.setPrice( updatedPrice );

        System.out.println();
        System.out.println("The original price of the " + jeans2.getName() + " pants was " + currency.format(originalPrice));
        System.out.println("If I had gotten my " + jeans2.getName()
                + " pants at a " + discountPct + "% discount, they would have cost $" + currency.format(jeans2.getPrice()));

    } // end of workWithClothingItems
    
    
    
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void frame() {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);   
        
    } // end of frame()

    public static void main(String args[]){new MUPanel().frame();}

}
