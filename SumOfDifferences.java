import java.util.Scanner;

public class SumOfDifferences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The value of n: ");
        int n = scanner.nextInt();
        System.out.println("The value of m: ");
        int m = scanner.nextInt();
        System.out.println(differenceOfSum(n, m));
    }

    public static int differenceOfSum(int n, int m) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i <= m; i++) {
            if (i % n != 0) {
                sum1 = sum1 + i;
            } else {
                sum2 = sum2 + i;
            }
        }
        System.out.println("The sum of numbers which are not divisible by n: " + sum1);
        System.out.println("The sum of numbers which are divisible by n: " + sum2);
        return Math.abs(sum1-sum2);
    }

}

