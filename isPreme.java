import java.util.Scanner;

public class isPreme {
    public static void main(String[] args) {
        System.out.println("请输入需要判定的数：");
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            boolean isPrime=true;
            int n=sc.nextInt();
            for(int i=2;i<Math.sqrt(n);i++){
                if (n%i==0){
                    isPrime=false;
                    System.out.println(n+"不是素数");
                    break;
                }
            }
            if (isPrime){
                System.out.println(n+"是素数");
            }
        }
    }
}
