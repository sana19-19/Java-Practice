public class NegativeNumSum {
    public static void main(String[] args){
        int[] num = {2,3,-4,5,-6};
        int sum=0;
        for(int i= 0; i<=num.length-1;i++){
        if(num[i]<0){
            sum+=num[i];
        }
    }
    System.out.println(sum);}
}
