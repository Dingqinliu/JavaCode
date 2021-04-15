import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str1 = "";
            String str = sc.nextLine();
            for (char ch : str.toCharArray()) {
                if (ch >= '0' && ch <= '9') {
                    str1 += ch;
                } else {
                    str1 += "a";
                }
            }

            String[] str2 = str1.split("a");
            int max = 0;//记录最长的连续数字串的长度
            for (int i = 0; i < str2.length; i++) {
                max = str2[i].length() > max ? str2[i].length() : max;
            }
            for (int i = 0; i < str2.length; i++) {
                if (str2[i].length() == max)
                    System.out.print(str2[i]);
            }
            System.out.println();
        }
    }
}
