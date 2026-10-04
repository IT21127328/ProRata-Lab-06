import java.util.Scanner;

public class IT21127328Lab6Q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter positive integers (terminate input with -99):");

        double sumOfSquares = 0;
        int count = 0;

        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == -99) {
                break;
            }

            if (num < 0) {
                System.out.println("Invalid input. Please enter a positive integer or -99 to terminate");
                continue;
            }

            sumOfSquares += Math.pow(num, 2);
            count++;
        }

        System.out.println();
        if (count > 0) {
            double rms = Math.sqrt(sumOfSquares / count);
            System.out.println("The Root Mean Square (RMS) is: " + rms);
        }

        scanner.close();
    }
}