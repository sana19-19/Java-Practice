public class WithoutSpacesCharacterInString {
    public static void main(String[] args){
        String str="Lee Jong Suk";
        int length=str.length();
        int sum=0;
        System.out.println("Length with spaces: " + length);
        for (int i= 0; i <=length-1 ; i++) {
           if(str.charAt(i)!=' '){
               sum++;
           }
        }
        System.out.print("Length without spaces: " + sum);
    }
}
