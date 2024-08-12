import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        // When one type of data is assigned to other type of data
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();
        System.out.println(num);
        // Casting in incompatible type { small to big }
        int num2 = (int) 89.9; // type casting

        // Automatic type promotion in expression
        int a = 257;
        byte b = (byte) a; // 257 % 256 = 1
        byte c = 50;
        byte d = 100;
        byte f = 127;
        int e = (c * d)/f;

        // Type promotion
        // byte g = c + 50; //Error because, the operation converts bytes to int
        int nm = 'a';
        System.out.println("नमस्ते");

        // Rules for type promotion
        // 1. All the short, byte, char are promoted to int
        // 2. Any one of the operand is long, then entire expression to long
        byte by = 3;
        int i = 40580;
        
    }
}
