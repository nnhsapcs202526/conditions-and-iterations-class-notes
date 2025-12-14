
/**
 * Class to determine if a year is a leap year or not
 *
 * @author santigutierrezsch
 * @version 24oct2025
 */
public class LeapYear
{
    /**
     * main function to know if year is a leap year or not
     * 
     * @param yearInput the year you want to check
     * @return boolean boolean if year is leap year
     */
    public static boolean isLeapYear(int yearInput)
    {
        if ((yearInput % 4 == 0 && yearInput % 100 != 0) || (yearInput % 400 == 0))
        {
            return true;
        } else {
            return false;
        }
    }
}
