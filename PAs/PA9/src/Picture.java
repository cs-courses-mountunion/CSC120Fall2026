/*
 * Picture.java
 * Staring Point Code for Image Processing Project
 * @author Richard Wicentowski and Tia Newhall (2005)
 * Revised by Blase Cindric
 */

import java.awt.Image;
import java.awt.image.*;
import java.net.URL;
import javax.swing.ImageIcon;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class Picture
{
    private Image image;
    private BufferedImage bufferedImage;
    private WritableRaster raster;
    
    public Picture(String filename) {
        try {
            bufferedImage = ImageIO.read(new File( filename ) );
            raster = bufferedImage.getRaster();
        } // end try
        catch (IOException e) {
            System.err.println("problem occurred: " + e);
        } // end catch
} // end of constructor
    
    public BufferedImage getBufferedImage() {
        return bufferedImage;
    } // end of getBufferedImage()
    
    public WritableRaster getRaster() {
        return raster;
    } // end of getRaster()

    public Pixel getPixel(int x, int y) {
        return new Pixel(raster.getPixel(x, y, new int[3]));
    } // end of getPixel

    public void setPixel(int x, int y, Pixel p) {
        raster.setPixel(x, y, p.getComponents());
    }
    
    public int getWidth() {
        return bufferedImage.getWidth();
    }
    
    public int getNumColumns() {
        return getWidth();
    }
    
    public int getHeight() {
        return bufferedImage.getHeight();
    }
    
    public int getNumRows() {
        return getHeight();
    }
    
    public Pixel[][] getThePixels() {
        Pixel[][] result = new Pixel[getHeight()][getWidth()];
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                result[y][x] = new Pixel(raster.getPixel(x, y, new int[3]));
            }
        }
        return result;
    } // end of getThePixels()
    
    public void setThePixels(Pixel[][] thePixels) {
        for (int x = 0; x < getWidth(); x++) {
            for (int y = 0; y < getHeight(); y++) {
                raster.setPixel(x, y, thePixels[y][x].getComponents());
            }
        }
    } // end of setThePixels()
    
} // end of class Picture
