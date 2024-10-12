import java.util.Scanner;

public class BinarySum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sumOfDigit = covBinary_sum(num);
        System.out.println(sumOfDigit);
        scanner.close();
    }
    public static int covBinary_sum(int num){
        int sum=0;
        while(num>0){
            int binary = num%2;
            sum += binary;
            num/=2;
        }
        return sum;
    }

}
