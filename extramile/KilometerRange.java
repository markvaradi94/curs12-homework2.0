package ro.fasttrackit.curs12.homeworkV2.extramile;

import java.util.Objects;

public class KilometerRange {
    private int minRange;
    private int maxRange;

    public KilometerRange(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public KilometerRange() {
        this(0, 10000);
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setKilometerRange(int minRange, int maxRange) {
        if (minRange >= 0 && minRange < maxRange) {
            this.minRange = minRange;
            this.maxRange = maxRange;
            System.out.println("Kilometer range set to " + minRange + " - " + maxRange);
        } else {
            System.out.println("Invalid kilometer range");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KilometerRange that = (KilometerRange) o;
        return minRange == that.minRange &&
                maxRange == that.maxRange;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minRange, maxRange);
    }

    @Override
    public String toString() {
        return "Kilometer range: " + this.minRange + " - " + this.maxRange + " ";
    }
}
