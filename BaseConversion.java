import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        if (N<0){
            throw new IndexOutOfBoundsException("");
        }
       String ret=null;
        int flag=1;//默认是正数
        String[] table={"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
        if (M<0){
            flag=0;
            M=-M;
        }
        while (M!=0){
            M=M/N;
            ret+=table[M%N];
            M/=N;
        }
        if (flag==0){
            ret+='-';
        }
        for (int i=0;i<table.length;i++){
            System.out.print(table[i]);
        }
    }
}
