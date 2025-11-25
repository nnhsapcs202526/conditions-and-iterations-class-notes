import java.awt.Color;

/**
 * Transforms a picture by applying a Shepard Fairey-inspired effect.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShepardFairey
{
    public static final Color OFF_WHITE = new Color( 248, 229, 175 );
    public static final Color LIGHT_BLUE = new Color( 121, 149, 159 );
    public static final Color RED = new Color( 198, 50, 45 );
    public static final Color DARK_BLUE = new Color( 16, 48, 77 );
    
    //real sf colors (posterize method)
    public static final Color sf1 = new Color(255,239,167); // lightest
    public static final Color sf2 = new Color(219,21,34);  
    public static final Color sf3 = new Color(101,147,160);
    public static final Color sf4 = new Color(10,42,63);     // darkest
    
    //custom color pallete
    public static final Color c1 = new Color(232, 238, 241); // lightest
    public static final Color c2 = new Color(67, 176, 241); // SIX SEVEN SIX SEVEN
    public static final Color c3 = new Color(5, 125, 205);
    public static final Color c4 = new Color(30, 61, 88); // darkest

    
    // TO DO: add your own custom color palette here...

    public static void main(String args[])
    {
        // TO DO: apply a shepard fairey style effect to your own images
        Picture photoPortrait = new Picture("IMG_7597.png");
        Picture photoPortrait2 = new Picture("IMG_7597.png");
        Picture photoLandscape = new Picture("landscapeimage.png");

        ColorManipulator manipulate = new ColorManipulator(photoPortrait);
        ColorManipulator manipulate2 = new ColorManipulator(photoPortrait2);
        ColorManipulator manipulate3 = new ColorManipulator(photoLandscape);

        photoPortrait.explore();
        manipulate.posterize(sf1, sf2, sf3, sf4);
        photoPortrait.explore();
        photoPortrait.write("C:\\Users\\sagutierrez\\unit 3\\sfportrait.jpg");
        
        photoPortrait2.explore();
        manipulate2.posterize(c1, c2, c3, c4);
        photoPortrait2.explore();
        photoPortrait2.write("C:\\Users\\sagutierrez\\unit 3\\customportrait.jpg");
        
        photoLandscape.explore();
        manipulate3.posterize(c1, c2, c3, c4);
        photoLandscape.explore();
        photoLandscape.write("C:\\Users\\sagutierrez\\unit 3\\customlandscape.jpg");
    }
}