public class DuplicateCharInStr {
    public static void main(String[] args){
        String s = "Automation";
        char[] ch = s.toCharArray();
        int count = 0;
        for (int i = 0 ; i<=ch.length-1;i++){
            for (int j = i+1;j<=ch.length-1;j++){
                if (ch[i]==ch[j]){
                    System.out.println("Duplicate char: " + ch[j]);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
