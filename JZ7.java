import java.util.Scanner;

public class JZ7 {
    public static int Fibonacci(int n) throws Exception {
        if (n>39 || n<0){
            throw new Exception("n的范围在[0,39]");
        }
        if (n==0){
            return 0;
        }else if (n==1){
            return 1;
        }else {
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int res = Fibonacci(n);
        System.out.println(res);
    }
}
