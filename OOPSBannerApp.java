/**
* OOPSBannerApp UC7- 0OPS Banner Display Application
* This class demonstrates a simple Java application that displays the Object
* Oriented Programming System OOPS acronym to the console.
*
* @author Adiba Imran
  @version 6.0
* @version 7.0
*/

public class OOPSBannerApp {

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
    static class CharacterPatternMap {

        private final Character character;
        private final String[] pattern;

        public CharacterPatternMap(Character character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }


        public Character getCharacter() {
            return character;
        }


        public String[] getPattern() {
            return pattern;
        }
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
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        return new CharacterPatternMap[] {

            new CharacterPatternMap('O', new String[] {
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }),

            new CharacterPatternMap('P', new String[] {
                "**** ",
                "*   *",
                "*   *",
                "**** ",
                "*    ",
                "*    ",
                "*    "
            }),

            new CharacterPatternMap('S', new String[] {
                " ****",
                "*    ",
                "*    ",
                " *** ",
                "    *",
                "    *",
                "**** "
            }),

            new CharacterPatternMap(' ', new String[] {
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     ",
                "     "
            })
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {

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
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }

        return getCharacterPattern(' ', charMaps);
    }

    public static void main(String[] args) {

    public static void printMessage(String message, CharacterPatternMap[] charMaps) {

        int height = 7;

        for (int row = 0; row < height; row++) {

        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();
            StringBuilder lineBuilder = new StringBuilder();

            for (char ch : message.toCharArray()) {

        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(
                oPattern[i] + " " +
                oPattern[i] + " " +
                pPattern[i] + " " +
                sPattern[i]
            );
                String[] pattern = getCharacterPattern(ch, charMaps);
                lineBuilder.append(pattern[row]).append(" ");
            }

            System.out.println(lineBuilder);
        }
    }

    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}