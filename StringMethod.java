package biteTest;

public class StringMethod {
    public static int compareTo(String str1,String str2){
        int len1=str1.length();
        int len2=str2.length();
        int short_len=0;
        if(len1>=len2)
        {
            short_len=len2;
        }
        else
            short_len=len1;
        for(int i=0;i<short_len;i++)
        {
            if(str1.charAt(i)-str2.charAt(i)<0)
            {
                return -1;
            }
            else if(str1.charAt(i)-str2.charAt(i)>0)
            {
                return 1;
            }
            else//相同
                continue;
        }
        //两个字符串前面short_len个字符相同，经过上面的循环不会有返回值
        if(len1==len2)
        {
            return 0;
        }
        else
            return (len1-len2>0)?1:-1;
    }

    public static void main(String[] args) {
        String str1="hello";
        String str2="worldworld";
        int i = compareTo(str1, str2);
        System.out.println(i);
    }
}
