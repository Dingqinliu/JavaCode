//地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。
// 一个机器人从坐标 [0, 0] 的格子开始移动，
// 它每次可以向左、右、上、下移动一格（不能移动到方格外），
// 也不能进入行坐标和列坐标的数位之和大于k的格子。
// 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。
// 但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子


//分析：
//采用递归实现深度优先
//1、能移动：左(i,j-1) 右(i,j+1) 上(i-1,j) 下(i+1,j) 每移动一次 count++
//2、不能移动 出界：j=0时不能左移 j=n-1时不能右移 i=0时不能上移 i=m-1时不能下移
    //如果没出界 数位之和>18则不能移
//特殊情况：[0,0]和[m-1,n-1]是同一位 返回1
//走过的格子不能再走
public class JZ13 {
    public int movingCount(int m,int n,int k){
        boolean[][] v=new boolean[m][n];//记录当前格子是否被访问过 访问过说明当前结果包含在子问题中，需要返回0 避免重复计算
        return dfs(0,0,m,n,k,v);
    }

    public int dfs(int i, int j, int m, int n, int k,boolean v[][]) {
        if (i<0||j<0||i>=m||j>=n||(i/10+i%10+j/10+j%10)>k||v[i][j]==true){
            return 0;
        }
        v[i][j]=true;
        return dfs(i+1,j,m,n,k,v)+dfs(i-1,j,m,n,k,v)+
                dfs(i,j+1,m,n,k,v)+dfs(i,j+1,m,n,k,v)+1;
    }
}