package Normal;

// 1 + (1 + 2) + (1 + 2 + 3) + ... + (1 + 2 + 3 + ... + 20)
// Sum of first n natural numbers = n⋅(n+1)/2

public class SeriesSum {

    public static void main(String[] args) {
        // Define the number of terms in the series
        int numberOfTerms = 20;

        // Calculate the sum of the series
        int seriesSum = calculateSeriesSum(numberOfTerms);

        // Print the result
        System.out.println("The sum of the series is: " + seriesSum);
    }

    // Method to calculate the sum of the series
    public static int calculateSeriesSum(int n) {
        int totalSum = 0;

        // Loop through each term in the series
        for (int i = 1; i <= n; i++) {
            // Add the sum of the first 'i' natural numbers
            totalSum += (i * (i + 1)) / 2;
        }

        return totalSum;
    }
}
