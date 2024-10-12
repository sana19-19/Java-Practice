public class SumOfDivisibleNumbers {
    public static void main(String[] args){
        int[] numbers={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int length = numbers.length-1;
        System.out.println("The total length of the array: " + length);
        int sum1=0;
        int sum2=0;
        for (int i=0;i<=length;i++){
            if(numbers[i]%4!=0){
                sum1 = sum1 + numbers[i];
            }
           else {
                sum2 = sum2 + numbers[i];
            }
        }
        System.out.println("The sum of numbers that are not divisible by 4: " + sum1);
        System.out.println("The sum of numbers that are not divisible by 4: " + sum2);
        int difference = sum1 - sum2;
        System.out.print("Sum of Differences: "+ difference);
    }
}
