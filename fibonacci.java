import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o numero");
        int number = scanner.nextInt();
        
        if (isFibonacci(number)) {
            System.out.println(number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(number + " não pertence à sequência de Fibonacci.");
        }
        
        scanner.close();
    }

    public static boolean isFibonacci(int n) {
        int a = 0;
        int b = 1;

        while (a <= n) {
            if (a == n) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        
        return false;
    }
}