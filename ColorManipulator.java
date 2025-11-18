import java.awt.Color;

/**
 * Class that manipulates the colors in a specified picture
 *
 * @author 
 * @version 
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
    
    /**
     * Sets the red component of the color of every pixel in the picture to the maximum value
     */
    public void maxRed()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setRed( 255 );
            }
        }
    }
    
    /**
     * Sets the green component of the color of every pixel in the picture to the maximum value
     */
    public void maxGreen()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setGreen( 255 );
            }
        }
    }
    
    // TO DO: create and implement grayscale method...
    
    public void grayscale()
    {
        //make the r g and b values all equal
        //maybe averaging them?
        //after researching ill make and use a formula called the luminosity method or something
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();
        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                int red = pixel.getRed();
                int blue = pixel.getBlue();
                int green = pixel.getGreen();
                int greyValue = (int) Math.round((0.299 * red) + (0.587 * green) + (0.114 * blue));
                pixel.setRed(greyValue);
                pixel.setGreen(greyValue);
                pixel.setBlue(greyValue);
            }
        }
    }
    
    
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
        this.grayscale();
        
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();
    
        int minGray = 255;
        int maxGray = 0;
        
        for (int y = 0;
        y < height; y++) {
            for (int x = 0;
            x < width; x++){
                Pixel pixel = this.picture.getPixel(x, y);
                int value = pixel.getRed();
                if (value < minGray){
                    minGray = value;
                }
                if (value > maxGray){
                    maxGray = value;
                }
            }
        }
        
        if (maxGray == minGray) {
            for (int y = 0; y < height; y++) {
                for (int x = 0; x < width; x++) {
                    this.picture.getPixel(x, y).setColor(color1);
                }
            }
            return;
        }
    
        // divide range into 4 
        double range = (double)(maxGray - minGray + 1);
        double t1 = minGray + range / 4.0;
        double t2 = minGray + 2.0 * range / 4.0;
        double t3 = minGray + 3.0 * range / 4.0;
    
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Pixel p = this.picture.getPixel(x, y);
                int gray = p.getRed();
    
                if (gray >= t3) {
                    p.setColor(color1); //lightest
                } else if (gray >= t2) {
                    p.setColor(color2); //second lightest
                } else if (gray >= t1) {
                    p.setColor(color3); //third lightest
                } else {
                    p.setColor(color4); //darkest
                }
            }
        }
    }
}
