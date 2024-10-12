public class CharInterchange {
    public static void main(String[] args)
    {
        String str = "aabbbbbbaaaacccc";
        char[] ch = str.toCharArray();
        for (int i=0;i<ch.length;i++)
        {
            if (ch[i]=='a')
            {
                System.out.print(ch[i]='b');
            } else if (ch[i]=='b') {
                System.out.print(ch[i]='a');
            } else if (ch[i]=='c') {
                System.out.print(ch[i]='c');
            }
        }
    }
}
