class Acronym {
    private String phrase;

    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        phrase = phrase.replace("_", " ");
        phrase = phrase.replace("-", " ");
        String[] p = phrase.split("\\s+");
        StringBuilder acronym  = new StringBuilder("");

        for (int i = 0; i < p.length; i++) {
            acronym.append(p[i].toUpperCase().charAt(0));
        }
        
        return acronym.toString();
    }

}
