package lib;

import java.util.Arrays;

public enum Temperature {
    Freezing,
    Cold,
    Normal,
    Hot,
    Melting;

    public boolean hotter(Temperature other) {
        Temperature[] temps = Temperature.values();

        int thisIdx = Arrays.binarySearch(temps, this);
        int otherIdx = Arrays.binarySearch(temps, other);

        return thisIdx > otherIdx;
    }

    public boolean hottereq(Temperature other) {
        return this.equals(other) || this.hotter(other);
    }

    public boolean lower(Temperature other) {
        Temperature[] temps = Temperature.values();

        int thisIdx = Arrays.binarySearch(temps, this);
        int otherIdx = Arrays.binarySearch(temps, other);

        return thisIdx < otherIdx;
    }

    public boolean lowereq(Temperature other) {
        return this.equals(other) || this.lower(other);
    }

    public Temperature oneUp() {
        Temperature[] temps = Temperature.values();

        int newIdx = Math.min(Arrays.binarySearch(temps, this) + 1, temps.length - 1);
        return temps[newIdx];
    }
}
