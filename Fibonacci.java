import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        /*
         * We are going to write code for fibonacci series in multiple ways.
         * 1. Normal "for loop"
         * 2. Recursion
         */
        Scanner in = new Scanner(System.in);
        int terms = 1;
        do {
            System.out.print("Enter the number of terms you want in series(>= 1): ");
            terms = in.nextInt();
        } while (terms <= 0);

        // Fibo with loop
        // String r1 = fiboWithLoop(terms);
        int r2 = fiboWithRec(terms - 1);
        System.out.println("The answer is: " + r2);

        // Count appearance
        int[] arr = { 2, 4, 2, 8, 3, 9, 2, 10 };
        // System.out.println("Appearance is: " + count(arr, 2));
        // System.out.println("in 339937383, count of 3s are: " + appearance(339937383,
        // 3));
        // System.out.println("The reverse of -98734534 is: " + reverseInt(-98734534));

        // switch case
        System.out.print("Enter a fruit name: ");
        String fruits = in.next();
        switch (fruits) {
            case "Mango" -> System.out.println("Mango entered.");
            case "Apple" -> System.out.println("Apple entered.");
            default -> System.out.println("No valid fruit.");
        }
        int[] arr1 = new int[5];
        System.out.println(arr1[0]);
        

    }

    static String fiboWithLoop(int terms) {
        int prev = 1, secondPrev = 0;
        String result = "";
        for (int i = 0; i < terms; i++) {
            if (i == 0) {
                result += secondPrev + " ";
                continue;
            } else if (i == 1) {
                result += prev + " ";
                continue;
            }
            int curr = prev + secondPrev;
            secondPrev = prev;
            prev = curr;
            result += curr + " ";
        }
        return result;
    }

    // Recursion implementation
    static int fiboWithRec(int terms) {
        if (terms <= 1) {
            return terms;
        }
        int result = fiboWithRec(terms - 1) + fiboWithRec(terms - 2);
        System.out.print(result + " ");
        return result;
    }

    // Finding the number of occurrence of a digit in an array.
    static int count(int[] digits, int target) {
        int res = 0;
        for (int i = 0; i < digits.length; i++) {
            if (digits[i] == target)
                res++;
        }
        return res;
    }

    // Count the number of occurrence in a large number,
    // For example 3s in 1399373843
    static int appearance(int largeNum, int target) {
        int res = 0;
        boolean flag = false;
        if (largeNum < 0) {
            flag = true;
            largeNum = Math.abs(largeNum);
        }
        while (largeNum > 0) {
            int remainder = largeNum % 10;
            if (remainder == target)
                res++;
            largeNum /= 10;
        }

        return res;
    }

    static int reverseInt(int largeNum) {
        int res = 0;
        boolean flag = false;
        if (largeNum < 0) {
            flag = true;
            largeNum = Math.abs(largeNum);
        }
        while (largeNum > 0) {
            int rem = largeNum % 10;
            res = (res * 10) + rem;
            largeNum /= 10;
        }
        if (flag)
            res *= -1;
        return res;
    }

}
