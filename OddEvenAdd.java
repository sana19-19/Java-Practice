

public class OddEvenAdd {
    public static void main(String[] args){
        int even=0;
        int odd=0;
        int[] array = {2,4,5,6};
        int length= array.length-1;
        for (int i=0;i<=length;i++){
            if(array[i]%2==0){
               even+=1;
            } else {
                odd+=1;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
