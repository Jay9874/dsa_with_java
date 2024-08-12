import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws Exception{
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);

    }
}
