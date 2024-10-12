import java.util.Scanner;

public class SpecialFib {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n<=0){
            System.out.println("PLZ Enter the positive number");
            return;
        }
        long[] series = new long[n];
        series[0] = 0;
        series[1] = 1;
        series[2] = 1;
        int i;
        for (i = 3;i<n;i++){
            series[i]=series[i-1]+series[i-2]+series[i-3];
        }
        for (i=0;i<n;i++){
            System.out.println(series[i]);
        }
     }
}
