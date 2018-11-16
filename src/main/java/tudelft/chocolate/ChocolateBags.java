package tudelft.chocolate;


// Small bars: 1kg each
// Big bars:   5kg each

public class ChocolateBags {

    // Calculate the number of small bars to use after maximum of big bars are used
    // small: available small bars
    // big: available big bars
    // total: desired total amount of kilos in the package
    public int calculate(int small, int big, int total) {
        int maxBigBoxes = total / 5;
        int bigBoxesWeCanUse = maxBigBoxes < big ? maxBigBoxes : big;
        total -= (bigBoxesWeCanUse * 5);

        if(small < total)
            return -1;
        return total;

    }

}
