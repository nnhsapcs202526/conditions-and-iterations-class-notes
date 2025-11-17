import java.awt.Color;

/**
 * Tester class for the ColorManipulator class to explore and modify pictures.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColorManipulatorTester
{
    public static void main(String[] args)
    {
        // // create a new picture object based on the .jpg file saved to folder
        // Picture selfie = new Picture( "Callaghan.jpg" );

        // // create a ColorManipulator object, used to transform the picture
        // ColorManipulator manipulator = new ColorManipulator( selfie );

        // // display the original picture
        // selfie.explore();

        // // transform the picture by applying a negate effect
        // manipulator.negate();
        
        // // display the transformed picture
        // selfie.explore();

        // // save the transformed picture to your repository
        // //selfie.write("CallaghanNegate.jpg");
        
        // /* This code doesn't work for some students for unknown reasons.
         // * You may need to specify an absolute path instead. For example:
         // *  selfie.write("C:\\Users\\mcallaghan\\GitHub\\decisions-loops\\CallaghanNegate.jpg");
         // */
                
        // // repeat the steps above for other modifications
        // Picture selfie2 = new Picture( "Callaghan.jpg" );
        // manipulator = new ColorManipulator( selfie2 );
        // selfie2.explore();
        // manipulator.maxBlue();
        // selfie2.explore();
        // //selfie2.write("CallaghanBlue.jpg");
    
        
        
        Picture pic4 = new Picture("IMG_7597.png");
        ColorManipulator man4 = new ColorManipulator(pic4);

        Color c1 = new Color(255,239,167); // light
        Color c2 = new Color(219,21,34);  
        Color c3 = new Color(101,147,160);
        Color c4 = new Color(10,42,63);     // dark

        pic4.explore();
        //man4.posterize(c1, c2, c3, c4);
        man4.blur(10);
        pic4.explore();
    }
}