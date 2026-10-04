import java.util.Scanner;

public class IT21127328Lab6Q2C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        int count = 1;
        String numbersList = "";
        int sum = 0;

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int num = scanner.nextInt();
            numbersList += num + " ";
            sum += num;
            count++;
        }

        double average = (double) sum / 10;

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbersList.trim());
        System.out.println("\nSum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        scanner.close();
    }
}