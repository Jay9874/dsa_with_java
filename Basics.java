public class Basics {
    public static void main(String[] args) {
        if (true) {
            System.out.println("hello world");
        }
        for (int i = 0; i <= 5; i += 2) {
            System.out.println(i);
        }
        // do{
        // //body
        // }while(true);

        // Math.max()

        System.out.println(Math.min(20, 40));

        // chatAt
        char letter = "Zello".trim().charAt(0);
        if (letter >= 65 && letter <= 90) {
            System.out.println("character is capital");
        }
        System.out.println("Hello".trim().charAt(0));

    }
}
