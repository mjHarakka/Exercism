import java.lang.Math;

class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(10));
    }

	static boolean isArmstrongNumber(int n) {
        int nLen = (int)Math.log10(n) + 1;
        int divider = 0; 
        int sum = 0;

        for (int i = 0; i < nLen; i++) { 
            divider = (int)Math.pow(10, nLen - i - 1);
            int curNum = (n / divider) % 10;
            sum += Math.pow(curNum, nLen);
        }

        if (sum == n) {
            return true;
        } else {
            return false;
        }

    }
}
