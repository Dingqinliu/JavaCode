package Homework;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s1 = "Hello World Xupt";//最后一个单词为Xupt
        String s2=" ";//为空格
        LengthOfLastWord p = new LengthOfLastWord();
        System.out.println(p.lengthOfLastWord(s1));
        System.out.println(p.lengthOfLastWord(s2));
    }

    //给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。如果不存在最后一个单词，
    //请返回 0 。
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {//字符串转成数组 倒数
                length++;
            } else if (length != 0) {
                return length;
            }
        }
        return length;
    }
}
