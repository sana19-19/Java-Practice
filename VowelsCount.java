import java.util.Scanner;

public class VowelsCount {
    public static String counting(String str){
        int len = str.length();
        char[] ch = str.toCharArray();
        int count = 0;
        int i;
        for (i=0;i<=len-1;i++) {
            if (ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'a' || ch[i] == 'e') {
                count = count + ch[i];
                System.out.println(count);
            }
        }
        return str;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = scanner.next();
        System.out.println(counting(str));
    }
}
