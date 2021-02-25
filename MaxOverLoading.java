import java.util.Scanner;

public class MaxOverLoading {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Maxint="+Maxint(a,b));
        double x=sc.nextDouble();
        double y=sc.nextDouble();
        System.out.println("Maxdouble="+Maxdouble(x,y));
        double i=sc.nextDouble();
        double j=sc.nextDouble();
        int k=sc.nextInt();
        Compare(i,j,k);
        sc.close();
    }
    public static int Maxint(int a,int b) {
        if(a>b) {
            return a;
        }else {
            return b;
        }
    }
    public static double Maxdouble(double x,double y) {
        if(x<y) {
            return x;
        }else {
            return y;
        }
    }
    public static double Compare(double i,double j,int k) {
        double temp=i>j?i:j;//求i和j中较大的
        double max=temp>k?temp:k;//求最大值；
        double temp1=i<j?i:j;//求i和j中较小的；
        double min=temp1<k?temp1:k;//求最小值
        double mid=(i+j+k*1.0)-max-min;
        System.out.print(max+">"+mid+">"+min);
        return 0;
    }
}
