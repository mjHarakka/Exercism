class RnaTranscription {

    public static void main(String[] args) {

    }


    String transcribe(String dnaStrand) {
        char[] charArr = dnaStrand.toCharArray();
        char[] rnaStrand = new char[charArr.length]; 
       
        if (dnaStrand.length() == 0) {
            return new String("");
        } else {
            for (int i = 0; i < charArr.length; i++) {
                switch (charArr[i]) {
                    case 'G':
                        rnaStrand[i] = 'C';
                        break;
                    case 'C':
                        rnaStrand[i] = 'G';
                        break;
                    case 'T':
                        rnaStrand[i] = 'A';
                        break;
                    case 'A':
                        rnaStrand[i] = 'U';
                        break;
                }
            }
        }
        return rnaStrand.toString();        

        }

    
}
