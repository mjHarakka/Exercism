import java.lang.Math;

class Darts {
    
    public static void main(String[] args) {
        Darts dart1 = new Darts(0.8, -0.8);
        System.out.println(dart1.score());
    }

    // Initialize the variables like radi and center
    private double x;
    private double y;
    private int outerRad = 10;
    private int middleRad = 5;
    private int innerRad = 1;
    private static final int CENTER = 0;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }

    int score() {
        int score = 0;
        // Some pythagorean magic, actually copied from: https://math.stackexchange.com/questions/198764/how-to-know-if-a-point-is-inside-a-circle
        double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        // Modifies the score, depending on where the dart lands
        if (d > outerRad) {
            score = 0;
        } else if (d > middleRad) {
            score = 1;
        } else if (d > innerRad) {
            score = 5;
        } else if (d > 0.0) {
            score = 10;
        }

        return score;
    }

}
