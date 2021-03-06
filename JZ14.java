//剪绳子
// 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
// 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
// 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
public class JZ14 {
    public int cuttingRope(int n){
        //思路
        //n=N1+N2+...+Nm 求解 max(N1*N2*...*Nm)
        //根据算术几何均值不等式 (N1+...+Nm/m)>=(N1*...*Nm)的1/a次方
        //当且仅当N1=...Nm时，等号成立，也就是乘积最大
        //所以，将绳子以相等的长度等分为多段，得到的乘积最大
        //一番推导后得出 当段长为3时 乘积达到最大
        //所以 最优情况 分为多个3 次优 分为多个3 最后一段为2 最差 分为多个3 最后一段为1 此时应该把长度4 分为2和2 而不是1和3
        if(n<=3){
            return n-1; //按照规则应不拆分 但题目要求m>1
        }
            int a=n/3;//能分为几个为3的段
            int b=n%3;//最后一段长度
//            if (b==0){
//                return (int)Math.pow(3,a);//全3 3^a
//            }
//            if (b==1){
//                return (int)Math.pow(3,a-1)*4;//最后一段为1 把倒数第二段和最后一段拆成2和2 那么就是a-1段*4
//            }
//        return (int)Math.pow(3,a)*2; //最后一段为2 和倒数第二段一共长5 5=2+3的情况下 2*3=6是最大
        //最后这一段我觉得用switch case好像也还不错
        switch (b){
            case 0:
                return (int)Math.pow(3,a);
            case 1:
                return (int)Math.pow(3,a-1)*4;
        }
        return (int)Math.pow(3,a)*2;
    }
}

