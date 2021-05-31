//二维数组中的查找
//在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
// 请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。(true or false)

public class JZ04 {
    //站在右上角看。这个矩阵其实就像是一个二叉搜索树
    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length; //获取行数
        int m = matrix[0].length; //获取列数
        if(n==0 || m==0){
            return false;
        }
        int left = 0,right = m-1;
        while(left<n&&right>=0){
            if(matrix[left][right]<target){
                left++;
            }else if(matrix[left][right]==target){
                return true;
            }else{
                right--;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] array= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9,10,11,12}
        };

        boolean res = findNumberIn2DArray(array, 8);
        System.out.println(res);
    }
}
