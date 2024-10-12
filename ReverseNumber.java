import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int sum=0;
        for(;number!=0;number=number/10){
            int remainder=number%10;
            sum=sum*10+remainder;
        }
        System.out.print("Reversed number: " + sum);

    }
}
