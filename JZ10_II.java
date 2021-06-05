//青蛙跳台阶

public class JZ10_II {
    public int numWays(int n){
        return getStep(n);
    }
    public int getStep(int n){
        if(n<2) return 1;
        int a=1;
        int b=1;
        for(int i=2;i<=n;i++){
            a=a+b;
            b=a-b;
            a=a>=1000000007?(a-1000000007):a;
        }
        return a;
    }
}
