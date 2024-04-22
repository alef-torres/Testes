import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a string ");
        String input = scanner.nextLine();
        
        String reversed = inversor(input);
        
        System.out.println("String invertida: " + reversed);
        
        scanner.close();
    }

    public static String inversor(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        return new String(charArray);
    }
}