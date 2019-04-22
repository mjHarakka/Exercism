import java.util.Random;
import java.util.Arrays;
import java.lang.Math;

class DnDCharacter {

    public static void main(String[] args) {
        System.out.println(modifier(4));
    }

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int charisma;
    private int hitpoints;
    private Random rand;

    public DnDCharacter() {
        rand = new Random();
        int strength = ability();
        int dexterity = ability();
        int constitution = ability();
        int intelligence = ability();
        int widsom = ability();
        int charisma = ability();
        int hitpoints = (int)modifier(constitution); 
    }

    int ability() {
        int[] diceRolls = new int[4];
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            diceRolls[i] = rand.nextInt(6) + 1;
        }

        Arrays.sort(diceRolls);

        for (int i = 0; i < 3; i++) {
            sum += diceRolls[i];
        }

        return sum;
    }

    static int modifier(int input) {
        double n = ((input - 10) / (double)2); 
        int intNum = (int)Math.floor(n);

        return intNum; 
    }
    

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

    int getHitpoints() {
        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }

}
