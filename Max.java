import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int max=Max3(a, b,c);
        System.out.println(max);
    }
    public static int Max2(int a,int b) {
        int max2=0;
        if(a>b){
            max2=a;
        }else{
            max2=b;
        }
        return max2;
    }
    public static int Max3(int a,int b,int c){
        int max3=0;
        int max2=Max2(a,b);
        if(max2>c){
            max3=max2;
        }else{
            max3=c;
        }
        return max3;
    }
}
