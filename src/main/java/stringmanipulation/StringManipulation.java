package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < s.length(); i += 2) {
            newString.append(s.charAt(i));
        }
        return newString.toString();
    }
}