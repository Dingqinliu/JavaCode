import java.util.Scanner;

//打印*组成的菱形 输入2 先打印两行 中间一行为结尾 再对称打印两行 一共五行
//
public class NiuKeBC63 {
    public static void main(String[] args) {
        char ch = '*';//字符固定，用*

        System.out.println("请输入行数：");
        Scanner s = new Scanner(System.in);

        while (s.hasNext()) {
            int lines = s.nextInt();//行数不固定

            //找规律
            //上半部分同12 但是打空格的地方会少打一个 所以打印空格的位置+1即可
            int d = 1;
            while (d <= lines) {
                for (int i = 0; i < lines - d + 1; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < d; i++) {
                    System.out.print(ch + " ");
                }
                System.out.println();
                d++;
            }
            for (int i = 0; i < lines + 1; i++) {
                System.out.print(ch + " ");
            }
            System.out.println();

            //打印下半部分
            int e = 1;
            while (e <= lines) {
                for (int i = 0; i < e; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < lines - e + 1; i++) {  //找e和lines的关系规律
                    System.out.print(ch + " ");
                }
                System.out.println();
                e++;
            }
        }
    }
}

