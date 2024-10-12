import java.util.Scanner;

public class TimeFinding {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1 : ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2 : ");
        int num2 = scanner.nextInt();
            int product = num1*num2;
            if (product<=24) {
                int actualTime = product - 12;
                System.out.println(actualTime);
            }
    }
}
