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
    public static final Color c1 = new Color(255,239,167); // light
    public static final Color c2 = new Color(219,21,34);  
    public static final Color c3 = new Color(101,147,160);
    public static final Color c4 = new Color(10,42,63);     // dark
    // TO DO: add your own custom color palette here...

    public static void main(String args[])
    {
        // TO DO: apply a shepard fairey style effect to your own images
        Picture tacoPortrait = new Picture("IMG_7597.png");
        Picture tacoLandscape = new Picture("IMG_4282.jpg");

        ColorManipulator manipulate = new ColorManipulator(tacoPortrait);
        ColorManipulator manipulate2 = new ColorManipulator(tacoLandscape);


        tacoPortrait.explore();
        manipulate.posterize(c1, c2, c3, c4);
        tacoPortrait.explore();
        
        tacoLandscape.explore();
        manipulate2.posterize(c1, c2, c3, c4);
        tacoLandscape.explore();
    }
}