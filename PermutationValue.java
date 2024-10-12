public class PermutationValue {
    public static void main(String[] args) {
        String[] input1 = {"hello", "cbcb", "aaeiou"};
        int input2 = input1.length;
        System.out.println(maxPermutation(input1, input2));
    }
    public static long maxPermutation(String[] input1,int input2){
       String vowels = "aeiouAEIUO";
       long maxPermutation = 1;
       for (String str : input1){
           int permutableLetters = 0;
           for (char c : str.toCharArray()){
               if (vowels.indexOf(c)==-1){
                   permutableLetters++;
               }
           }
           long permutations = factorial(permutableLetters);
           maxPermutation = Math.max(maxPermutation,permutations);}
       return maxPermutation;

    }
    public static long factorial(int n){
        long result=1;
        for(int i =2;i<=n;i++){
            result*=1;
        }
        return result;
    }

}
