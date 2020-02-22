package ro.fasttrackit.curs12.homeworkV2.extramile;

import java.util.Objects;

public class PriceRange {
    private int minRange;
    private int maxRange;

    public PriceRange(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public PriceRange() {
        this(500, 5000);
    }

    public int getMinRange() {
        return minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setPriceRange(int minRange, int maxRange) {
        if (minRange >= 0 && minRange < maxRange) {
            this.minRange = minRange;
            this.maxRange = maxRange;
            System.out.println("Price range set to " + minRange + " - " + maxRange);
        } else {
            System.out.println("Invalid price range");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceRange that = (PriceRange) o;
        return minRange == that.minRange &&
                maxRange == that.maxRange;
    }

    @Override
    public int hashCode() {
        return Objects.hash(minRange, maxRange);
    }

    @Override
    public String toString() {
        return "Price range: " + this.minRange + " - " + this.maxRange + " ";
    }
}
