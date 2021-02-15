package binary_search;

public class Search {
    //用一维数组表示返回元素下标 比如 int[]{0，3} 第0行的第3个
    public static int[] Search(long[][] array,int rows,int columns,long target){
        //划范围
        Range range=new Range(array,rows,columns);

        while (range.size()>0) {
            long midValue = range.getMidValue();
            if (target == midValue) {
                return range.getMidIndex();
            }
            else if (target < midValue) {
                range.discardRightPart();//丢右边
            }
            else {
                range.discardLeftPart();//丢左边
            }
        }
        return null;//没找到
        //或者 return new int[] {-1,-1};
    }
}
