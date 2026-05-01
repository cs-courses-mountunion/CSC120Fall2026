/* 
 * CSC 120 PA5
 * Samantha Student
 * Today's Date
 *
 * Project Description:
 * This program allows the user to enter data in text fields
 * to create Book objects. A more useful program would
 * store the objects in a disk file or in a database.
 *
 * Acknowledgements:
 * The user interface, and general structure of this program
 * was created by John Kirchmeyer.
 * 
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MUPanel extends JPanel {

    // =====>                  <=====
    // =====> INSTRUCTION 3 a) <=====
    // =====>                  <=====
    private Book theBook;
    
    // an int variable for counting the number of objects added by the user
    private int numOfWhateversAdded;
    
    
    // =====>                  <=====
    // =====> INSTRUCTION 3 b) <=====
    // =====>                  <=====
    // labels & textfields for creating a Book
    private JLabel titleLabel, authorLabel;
    private JTextField titleField, authorField;
    
    // =====>                  <=====
    // =====> INSTRUCTION 5 a) <=====
    // =====>                  <=====
    // declare more JLabels and JTextFields for the other data members of your class
    
    
    
    
    
    // output area
    private JTextArea outputArea;
    private JScrollPane outputPane;
    private JLabel totalLabel;
    private JTextField totalField;
    
    // button to be clicked by user when program is run
    private JButton addObjectButton;

    public MUPanel() {
        
        setLayout(null);
        setPreferredSize(new Dimension(800, 600));
        setName("Mount Union Java Program");
        setBackground(Color.WHITE);

        numOfWhateversAdded = 0;
        
        setUpUserInterface();

    } // end of MUPanel constructor
	
	
    public void paintComponent( Graphics g ) {
        super.paintComponent(g);
        
        g.setFont( new Font("Serif", Font.PLAIN, 22) );
        g.drawString("CSC 120, PA 5 by Samantha Student", 100, 32);
    }
    
    private void setUpUserInterface() {        
                
        // =====>                  <=====
        // =====> INSTRUCTION 3 c) <=====
        // =====>                  <=====

        // Book title (change to use a property of your class)
        
        titleLabel = new JLabel("Title:");
        titleLabel.setLocation(10, 50);
        add(titleLabel);
        
        titleField = new JTextField(40);
        titleField.setLocation(80, 50);
        add(titleField);
        
        
        // Book author (change to use a property of your class)
        
        authorLabel = new JLabel("Author:");
        authorLabel.setLocation(10, 80);
        add(authorLabel);
        
        authorField = new JTextField(40);
        authorField.setLocation(80, 80);
        add(authorField);
        
        
        // =====>                  <=====
        // =====> INSTRUCTION 5 a) <=====
        // =====>                  <=====
        // Instantiate the JLabels & JTextFields for the properties here
        
        
        
        
        

        // Area for displaying the objects
        outputArea = new JTextArea(20, 70);
        outputArea.setBackground(new Color(224,224,224));
        outputPane = new JScrollPane(outputArea);
        outputPane.setLocation(10, 230);
        add(outputPane);
        
        // a JLabel & a JTextField for
        // displaying the total number of objects.
        totalLabel = new JLabel("Number of Books:");
        totalLabel.setLocation(10, 570);
        add(totalLabel);
        
        totalField = new JTextField(5);
        totalField.setLocation(120, 570);
        totalField.setText("" + numOfWhateversAdded);
        add(totalField);
               
        // Add button
        addObjectButton = new JButton("Add this Book");
        addObjectButton.setLocation(600, 80);
        addObjectButton.addActionListener(new AddObjectListener());
        add(addObjectButton);
        
    } // end of setUpUserInterface method
        
    private class AddObjectListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent ae) {
            // =====>                            <=====
            // =====> INSTRUCTIONS 3 d) and 5 b) <=====
            // =====>                            <=====
            // Use the values in the textfields as parameters
            // when calling the Book constructor to
            // create an instance of a Book.
            // Then display the book in the textarea
            // using its toString method.
        
            String t;
            String a;
         
            t = titleField.getText();
            a = authorField.getText();
        
            theBook = new Book(t, a);
            outputArea.append("Added this book:\n");
            outputArea.append(theBook.toString() + "\n\n");
        
            // =====>                  <=====
            // =====> INSTRUCTION 6 b) <=====
            // =====>                  <=====
            // Add one to the numOfWhateversAdded variable
            
            
           
            // Display new count in totalField
            totalField.setText("" + numOfWhateversAdded);
        
            repaint();        
        } // end of actionPerformed method
        
    } // end of addObjectListener nested class
    
    /***********************************************
     * Do NOT change or delete anything below here!
     ***********************************************/
    public void frame()
    {
        for (Component c: getComponents())
            c.setSize(c.getPreferredSize());
        JFrame f = new JFrame(getName());
        f.setContentPane(this);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);    
    }

    public static void main(String args[]){new MUPanel().frame();}

} // end of class MUPanel
