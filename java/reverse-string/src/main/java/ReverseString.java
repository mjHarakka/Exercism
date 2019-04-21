class ReverseString {

    String reverse(String inputString) {
        String[] reverse = inputString.split("");
        String outPutString = "";
        for (int i = 0; i < reverse.length; i++) {
            outPutString += reverse[reverse.length-i];
        }
        return outPutString;
    }
}