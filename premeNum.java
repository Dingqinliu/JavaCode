public class premeNum {
    public static void main(String[] args) {
        //方法3 [2,sqtr(n)]所有数都无法被整除，才是素数
        for (int n=1;n<=100;n++){
            boolean isPrime=true;
            for(int j=2;j<Math.sqrt(n);j++){
                if (n%j==0){
                    isPrime=false;
                    break;
                }
            }
            if (isPrime){
                System.out.println(n+"是素数");
            }
        }

    }
}
