import java.util.Scanner;

public class ShareCandy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();

        int A=(a+c)/2;
        int B=(b+d)/2;
        int C=(d-b)/2;

        if (A-B==a && B-C==b && A+B==c && B+C==d){
            System.out.println(A+" "+B+" "+C);
        }else {
            System.out.println("No");
        }
    }
}
