public class SecondSmallestElement {
    public static void main(String [] args){
        int[] s= {2,3,4,2,4,13,2,1};
        int temp;
        for (int i = 0;i<s.length;i++){
            for (int j=i+1;j<s.length;j++){
                if (s[i]>s[j]){
                    temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
            if(i==1){
                break;
            }
        }
        System.out.println(s[1]);
    }
}
