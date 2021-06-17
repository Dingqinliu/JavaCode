//数值的整数次方
//实现 pow(x, n) ，
// 即计算 x 的 n 次幂函数（即，xn）。
// 不得使用库函数，同时不需要考虑大数问题。
public class JZ16 {
    public double myPow(double x, int n){

//        double res=1.0;
//        if(n>=0){
//            if (n==0){
//                return 1;
//            }
//            else {
//                for (double i=0.0;i<n;i++){
//                    res=res*x;
//                }
//            }
//        }
//        else {
//            for(double i=-1.0;i>=n;i--){ //这里超出时间限制 跑不通
//                res=res*x;
//                res=1/res;
//            }
//        }
//        return res;

        // 除了特殊三个点 其余 均可分为两个偶数次方之和 或者 两个偶数次方之和和一个1次方之和
        //比如 x^9=x^4 * x^4 * x^1
        if (n==0) return 1;
        if (n==1) return x;
        if (n==-1) return 1/x;

        double half=myPow(x,n/2);
        double mod=myPow(x,n%2);
        return half*half*mod;
    }
}
