/*
    CS 121 Project 6 
    Samantha Student
    Fall Semester, 2006

    This application allows the user to do editing on a jpeg picture.

    Acknowledgements:
        Original idea & some code by Richard Wicentowski and Tia Newhall
        at Swarthmore. This version is based upon a modified version
        by Blase Cindric and John Kirchmeyer.
*/

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.*;
import java.net.*;

public class MUPanel extends JPanel implements ActionListener, ItemListener {

    private Button[] buttons;
    private Picture originalPicture, currentPicture;
    private JLabel imageLabel;
    private Choice fileChooser;

    // constructor method
    public MUPanel() {
        setLayout(null);
        setPreferredSize(new Dimension(750, 420));
        setName("Image Modification");
        setUp();
        setBackground(Color.WHITE);

        fileChooser = new Choice();
        fileChooser.add("--Choose a file--");
        fileChooser.add("CSLab.jpg");
        fileChooser.add("flowers.jpg");
        fileChooser.add("swanFace.jpg");
        fileChooser.add("DONOTLOCK.jpg");
        fileChooser.add("golf2.jpg");
        fileChooser.add("MarkerBoard2.jpg");

        /* ---- Don't change the next three lines ---- */
        fileChooser.setBounds(20, 400, 400, 20);
        fileChooser.addItemListener(this);
        add(fileChooser);

        imageLabel = new JLabel();
        imageLabel.setBounds(0, 0, 600, 400);
        add(imageLabel);

        createButtons();
        
    } // end of constructor
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // This line must be first in this method!

    } // end of paintComponent()
    
    @Override
    public void itemStateChanged(ItemEvent e) {
        String filename = fileChooser.getSelectedItem();
        if (!filename.equals("--Choose a file--")) {
            loadPicture(filename);
            repaint();                  // jfk
        } // end if

    } // end of itemStateChanged()
    
    public void loadPicture(String filename) {
        originalPicture = new Picture(filename);
        currentPicture = new Picture(filename);
        
        ImageIcon icon = new ImageIcon();
        icon.setImage(currentPicture.getBufferedImage());

        imageLabel.setIcon(icon);
    } // end of loadPicture()




    @Override
    public void actionPerformed(ActionEvent ae) {
        Object source = ae.getSource();
        
        if (source.equals(buttons[0])) {
            doRestoreImage();
            repaint();
        }
        else if (source.equals(buttons[1])) {
            doFlipHoriz();
            repaint();
        }

        /********************************************
         * ADD AN ELSE/IF FOR EACH OF YOUR BUTTONS  *
         ********************************************/
         
        
    } // end of actionPerformed
    


    
    public final void createButtons() {
        int numButtons = 16;
        int counter = 0;
        
        buttons = new Button[numButtons];
        
        /*****************************************************************
         * ADD YOUR OWN BUTTON DEFINITIONS AT THE BOTTOM OF THIS LIST    *
         *****************************************************************/
         
        buttons[0] = new Button("Restore Image");
        buttons[0].addActionListener(this);
    
        buttons[1] = new Button("Flip Horizontal");
        buttons[1].addActionListener(this);
        
        
       
        Font buttonFont = new Font("Dialog",Font.PLAIN,18);
       
        for (int i = 0; i < numButtons; i++)
        {
            if (buttons[i] == null)
            { // create "Unused" button for ones you did not define
                buttons[i] = new Button("Unused");
            } // create "Unused" button for ones you did not define
            buttons[i].setBounds(600, i*25, 150, 25);
            buttons[i].setFont(buttonFont);
            buttons[i].setBackground(Color.YELLOW);
            add(buttons[i]);
        } // end for
        buttons[0].setBackground(Color.GREEN);
        
    } // end of createButtons()



    
    public void doRestoreImage() {
       Pixel[][] origPixels = originalPicture.getThePixels();
       int numRows = originalPicture.getNumRows();
       int numCols = originalPicture.getNumColumns();
       Pixel[][] currPixels = new Pixel[numRows][numCols];
       
       for (int row = 0; row < numRows; row++) {
           for (int col = 0; col < numCols; col++) {
               currPixels[row][col] = origPixels[row][col];
           }
       }
       currentPicture.setThePixels(currPixels);
    } // end of doRestoreImage()

    
    public void doFlipHoriz() {    
       int numRows = currentPicture.getNumRows();
       int numCols = currentPicture.getNumColumns();
       
       Pixel[][] thePixels = currentPicture.getThePixels();
       
       for (int row = 0; row < numRows; row++) {
           for (int col = 0; col < numCols/2; col++) {
               Pixel pixel1 = thePixels[row][col];
               Pixel pixel2 = thePixels[row][numCols-col-1];
               thePixels[row][col] = pixel2;
               thePixels[row][numCols-col-1] = pixel1;
           } // end inner for
       } // end outer for    
       
       currentPicture.setThePixels(thePixels);
    } // end of doFlipHoriz()
    
    
       
    
    
    
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


