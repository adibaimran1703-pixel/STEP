/**
* OOPSBannerApp UC4- 0OPS Banner Display Application
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
*
* @author Adiba Imran

* @version 5.0
* @version 6.0
*/

public class OOPSBannerApp {
	public static void main(String[] args) {

        String[] lines = {
            String.join(" ", " *** ", " *** ", " **** ", " **** "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", " **** ", " ***  "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", " *** ", " *** ", "*     ", " **** ")

    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }


    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }


    public static String[] getSPattern() {
        return new String[] {
            " ****",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            "**** "
        };
    }

    public static void main(String[] args) {


        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();


        // Enhanced for-loop to print each banner line
        for (String line : lines) {
            System.out.println(line);}
	}
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + " " +
                oPattern[i] + " " +
                pPattern[i] + " " +
                sPattern[i]
            );
        }
    }
}