import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

class Scrabble {
    private String word;

    Scrabble(String word) {
        this.word = word;
    }

    int getScore() {
        char charArr[] = this.word.toCharArray();
        int scoreSum = 0;

        for (char c: charArr) {
            scoreSum += getMatch(Character.toUpperCase(c));
        }

        return scoreSum;
    }

    static int getMatch(char c) {
        Map<Character, Integer> scoresMap = scoresMap();      

        return scoresMap.get(c);
    }

    static Map<Character, Integer> scoresMap() {
        Map<Character, Integer> scoresMap = new HashMap<>();

        scoresMap.put('A', 1);
        scoresMap.put('E', 1);
        scoresMap.put('I', 1);
        scoresMap.put('O', 1);
        scoresMap.put('U', 1);
        scoresMap.put('L', 1);
        scoresMap.put('N', 1);
        scoresMap.put('R', 1);
        scoresMap.put('S', 1);
        scoresMap.put('T', 1);
        scoresMap.put('D', 2);
        scoresMap.put('G', 2);
        scoresMap.put('B', 3);
        scoresMap.put('C', 3);
        scoresMap.put('M', 3);
        scoresMap.put('P', 3);
        scoresMap.put('F', 4);
        scoresMap.put('H', 4);
        scoresMap.put('V', 4);
        scoresMap.put('W', 4);
        scoresMap.put('Y', 4);
        scoresMap.put('K', 5);
        scoresMap.put('J', 8);
        scoresMap.put('X', 8);
        scoresMap.put('Q', 10);
        scoresMap.put('Z', 10);

        return scoresMap;

    }
}
