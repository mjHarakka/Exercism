class ResistorColor {
    int colorCode(String color) {
        int colorCode = 0;
        String[] colors = colors();

        for (int i = 0; i < colors.length; i++) {
            if (color.equals(colors[i])) {
                colorCode = i;
            }
        }

        return colorCode;
    }

    String[] colors() {
        String[] colors = {
                "Black",
                "Brown",
                "Red",
                "Orange",
                "Yellow",
                "Green",
                "Blue",
                "Violet",
                "Grey",
                "White"
        };

        return colors;
    }
}
