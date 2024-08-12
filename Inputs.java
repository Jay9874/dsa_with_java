import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        System.out.print("What is your roll number: ");
        Scanner input = new Scanner(System.in);
        int roll = input.nextInt();
        System.out.println("Your roll number is: " + roll);
        float newFloat = input.nextFloat();
    }
}
