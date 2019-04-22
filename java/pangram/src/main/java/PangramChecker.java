import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class PangramChecker {

    public boolean isPangram(String input) {
        // get input and set every char to lowercase, regex all but chars and make it char array 
        char charArr[] = input.replaceAll("[^a-zA-Z]", "")
            .toLowerCase()
            .toCharArray();

        if (charArr.length < 26) {
            return false;
        }

        // initialize hashset
        Set<Character> charSet = new HashSet<>(); 
        int charArrLen = charArr.length;

        for (int i = 0; i < charArrLen; i++) {
            if (charSet.size() == 26) {
                return true;
            }
            
            charSet.add(charArr[i]);
        }

        if (charSet.size() == 26) {
            return true;
        }

        return false;

    }

}
