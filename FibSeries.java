import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfFib(n));
    }
    public static int sumOfFib(int n){
        if(n<=1){
            return n;
        }
            return sumOfFib(n-1)+sumOfFib(n-2);
    }
}
