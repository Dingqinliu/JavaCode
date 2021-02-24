//求阶乘
public class factorial {
    public static void main(String[] args) {
        int N=3;
        System.out.println(fun(N));
    }

    public static long fun(int N){
        long ans=1;
        if (N<0){
            throw new RuntimeException("N不能为负数");
        }
        else{
            for (int i=1;i<=N;i++){
                ans*=i;
            }
            return ans;
        }
    }
}
