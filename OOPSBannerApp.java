/**
* OOPSBannerApp UC4- 0OPS Banner Display Application
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
*
* @author Adiba Imran

* @version 3.0
* @version 4.0
*/

public class OOPSBannerApp {
	public static void main(String[] args) {
		System.out.println(String.join(" ", 
        " *** ", " *** ", " **** ", " ****"));

System.out.println(String.join(" ", 
        "*   *", "*   *", "*   *", "*    "));

System.out.println(String.join(" ", 
        "*   *", "*   *", "*   *", "*    "));

System.out.println(String.join(" ", 
        "*   *", "*   *", " **** ", " *** "));

System.out.println(String.join(" ", 
        "*   *", "*   *", "*     ", "    *"));
		String[] lines = new String[7];

System.out.println(String.join(" ", 
        "*   *", "*   *", "*     ", "    *"));
        lines[0] = String.join(" ", " *** ", " *** ", " **** ", " **** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[3] = String.join(" ", "*   *", "*   *", " **** ", " ***  ");
        lines[4] = String.join(" ", "*   *", "*   *", "*     ", "    * ");
        lines[5] = String.join(" ", "*   *", "*   *", "*     ", "    * ");
        lines[6] = String.join(" ", " *** ", " *** ", "*     ", " **** ");

System.out.println(String.join(" ", 
        " *** ", " *** ", "*     ", " ****"));
        for (String line : lines) {
            System.out.println(line);
		}
	}
}
