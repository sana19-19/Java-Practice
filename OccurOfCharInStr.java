public class OccurOfCharInStr {
    public static void main(String[] args){
        String s = "Sana Sardar Naikwade";
        int oriLeng = s.length();
        System.out.println(oriLeng);
        String newStr= s.replace("a","");
        System.out.println(newStr);
        int newLen = newStr.length();
        System.out.println(newLen);
        int count = oriLeng - newLen;
        System.out.println(count);
    }
}
