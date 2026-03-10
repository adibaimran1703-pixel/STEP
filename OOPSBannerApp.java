/**
* OOPSBannerApp UC4- 0OPS Banner Display Application
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
*
* @author Adiba Imran

* @version 4.0
* @version 5.0
*/

public class OOPSBannerApp {
	public static void main(String[] args) {
		String[] lines = new String[7];

        lines[0] = String.join(" ", " *** ", " *** ", " **** ", " **** ");
        lines[1] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[2] = String.join(" ", "*   *", "*   *", "*   *", "*     ");
        lines[3] = String.join(" ", "*   *", "*   *", " **** ", " ***  ");
        lines[4] = String.join(" ", "*   *", "*   *", "*     ", "    * ");
        lines[5] = String.join(" ", "*   *", "*   *", "*     ", "    * ");
        lines[6] = String.join(" ", " *** ", " *** ", "*     ", " **** ");
        String[] lines = {
            String.join(" ", " *** ", " *** ", " **** ", " **** "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", "*   *", "*     "),
            String.join(" ", "*   *", "*   *", " **** ", " ***  "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", "*   *", "*   *", "*     ", "    * "),
            String.join(" ", " *** ", " *** ", "*     ", " **** ")
        };

        // Enhanced for-loop to print each banner line
        for (String line : lines) {
            System.out.println(line);
		}
            System.out.println(line);}
	}
}
