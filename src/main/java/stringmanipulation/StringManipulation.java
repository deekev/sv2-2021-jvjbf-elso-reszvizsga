package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        String newString = "";
        for (int i = 0; i < s.length(); i += 2) {
            newString += s.charAt(i);
        }
        return newString;
    }
}