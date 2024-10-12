import java.util.Scanner;

public class HappyState {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = scanner.nextInt();
        System.out.println(happyOrNot(number));
    }
    public static int happyOrNot(int number) {
        for (int i = 0; i <= number / 10; i++) {
            int sum = number % 10;
            number = number * number;
        }
        return 0;
    }
}
