class SpaceAge {
    private double seconds;
    private final int yearDiv = 31556926;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return seconds / yearDiv;
    }

    double onMercury() {
        return (seconds / yearDiv) / 0.2408467;
    }

    double onVenus() {
        return (seconds / yearDiv) / 0.61519726;
    }

    double onMars() {
        return (seconds / yearDiv) / 1.8808158;
    }

    double onJupiter() {
        return (seconds / yearDiv) / 11.862615;
    }

    double onSaturn() {
        return (seconds / yearDiv) / 29.447498; 
    }

    double onUranus() {
        return (seconds / yearDiv) / 84.016846; 
    }

    double onNeptune() {
        return (seconds / yearDiv) / 164.79132;
    }

}
