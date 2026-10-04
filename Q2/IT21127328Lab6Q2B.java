import java.util.Scanner;

public class IT21127328Lab6Q2B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter 10 numbers:");

        int count = 1;
        String numbersList = "";

        while (count <= 10) {
            System.out.print("Enter number " + count + ": ");
            int number = scanner.nextInt();
            numbersList += number + " ";
            count++;
        }

        System.out.println("\nThe numbers you entered are:");
        System.out.println(numbersList.trim());

        scanner.close();
    }
}