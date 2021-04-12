import java.util.Scanner;

public class AaddBn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //1、A+B(1)
        // 输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据包括多组。
        //输出a+b的结果
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNextInt()){
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            if (a>=1 && b<=Math.pow(10,9)){
//                System.out.println(a+b);
//            }
//        }
//    }

        //2、A+B(2)
//    public static void main(String[] args) {
//        //输入第一行包括一个数据组数t(1 <= t <= 100)
//        //接下来每行包括两个正整数a,b(1 <= a, b <= 10^9)
//        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        while (sc.hasNextInt()){
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            if (t>=1 && t<=100 && a>=1 && b<=Math.pow(10,9)){
//                System.out.println(a+b);
//            }
//        }
//    }
        //输入包括两个正整数a,b(1 <= a, b <= 10^9),输入数据有多组, 如果输入为0 0则结束输入
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNextInt()){
//            int a=sc.nextInt();
//            int b=sc.nextInt();
//            if (a>=1 && b<= Math.pow(10,9)){
//                System.out.println(a+b);
//            }
//            if (a==0 && b==0){
//                break;
//            }
//        }
//    }

        //输入数据包括多组。
        //每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。
        //接下来n个正整数,即需要求和的每个正整数。
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while (sc.hasNextInt()){
//            int n=sc.nextInt();
//            if (n==0)
//                break;
//            int sum=0;
//            while (n!=0){
//                sum+=sc.nextInt();
//                n--;
//            }
//            System.out.println(sum);
//        }
//    }
        //输入的第一行包括一个正整数t(1 <= t <= 100), 表示数据组数。
        //接下来t行, 每行一组数据。
        //每行的第一个整数为整数的个数n(1 <= n <= 100)。
        //接下来n个正整数, 即需要求和的每个正整数。
        //每组数据输出求和的结果
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int i = 0; i < t; i++) {
//            int n=sc.nextInt();
//            int sum=0;
//            for(int j=0;j<n;j++){
//                sum+=sc.nextInt();
//        }
//            System.out.println(sum);
//        }
//    }

        //  输入数据有多组, 每行表示一组输入数据。
        //  每行的第一个整数为整数的个数n(1 <= n <= 100)。
        //  接下来n个正整数, 即需要求和的每个正整数。
        //  每组数据输出求和的结果
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while (sc.hasNextInt()) {
//            int n = sc.nextInt();
//            int sum = 0;
//            for (int i = 0; i < n; i++) {
//                sum += sc.nextInt();
//            }
//            System.out.println(sum);
//        }
//    }

        //> 输入数据有多组, 每行表示一组输入数据。每行不定有n个整数，空格隔开。(1 <= n <= 100)。
        //> 每组数据输出求和的结果

            while (sc.hasNextLine()) {
                String[] s = sc.nextLine().split(" ");
                int sum = 0;
                for (int i = 0; i < s.length; i++) {
                    sum += Integer.parseInt(s[i]);
                }
                System.out.println(sum);
        }
    }
}
