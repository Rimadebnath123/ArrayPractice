package Normal;

import java.util.Scanner;

public class AltenativeSumSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int N = sc.nextInt();
        sc.close();

        int sum = 0;

        System.out.print("The series is: ");
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                System.out.print("-" + i);
                sum -= i;
            } else {
                if (i > 1) {
                    System.out.print("+");
                }
                System.out.print(i);
                sum += i;
            }
        }

        System.out.println("\nThe sum of the first " + N + " terms is: " + sum);
    }
}


