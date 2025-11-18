import java.awt.Color;

/**
 * Class that manipulates the colors in a specified picture
 *
 * @author mrcallaghan
 * @version 18nov2025
 */
public class ColorManipulator
{
    private Picture picture;

    /**
     * Constructs a new ColorManipulator object with the specified picture
     *
     * @param  newPicture  the picture to manipulate
     */
    public ColorManipulator( Picture newPicture )
    {
        this.picture = newPicture;
    }
    
    /**
     * Returns the Picture associated with this ColorManipulator object. Intended to
     *      be used by the test class.
     *
     * @returns the Picture associated with this ColorManipulator object
     */
    public Picture getPicture()
    {
        return this.picture;
    }
    
    /**
     * Negates the color of every pixel in the picture
     */
    public void negate()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                
                int negatedRed = 255 - color.getRed();
                int negatedBlue = 255 - color.getBlue();
                int negatedGreen = 255 - color.getGreen();
                
                Color negated = new Color( negatedRed, negatedBlue, negatedGreen );
                pixel.setColor( negated );
            }
        }
    }

    /**
     * Sets the blue component of the color of every pixel in the picture to the maximum value
     */
    public void maxBlue()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setBlue( 255 );
            }
        }
    }
    
    // TO DO: create and implement maxRed and maxGreen methods...
    public void maxRed()
    {}
    
    public void maxGreen()
    {}
    
    // TO DO: create and implement grayscale method...
    public void grayscale()
    {}
    
    /**
     * Method to apply a Shepard Fairey style effect to an image.  This version uses a 4 color palette.
     * 
     * @param color1 the lightest color in the color palette
     * @param color2 the second lightest color in the color palette
     * @param color3 the third lightest color in the color palette
     * @param color4 the darkest color in the color palette
     */
    public void posterize(Color color1, Color color2, Color color3, Color color4) {
        // TO DO: implement posterize method...

    }

    

}
