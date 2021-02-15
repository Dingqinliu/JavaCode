package binary_search;

public class Range {
    private final long[][] array;
    private final int columns;

    private int lowRow;
    private int lowColumn;

    private int highRow;
    private int highColumn;

    public Range(long[][] array,int rows,int columns){
        this.array=array;
        this.columns=columns;

        this.lowRow=0;//二维数组左上角第一个元素
        this.lowColumn=0;

        this.highRow=rows-1;
        this.highColumn=columns-1;

        //剩余元素个数=low所在行的剩余元素个数 columns-lowColumn
        // +完整行的元素个数 columns * (highRow-lowRow-1)
        // +high所在行的元素个数 highColumn+1


    }

    public int size() {//区间内剩余所有元素个数
        return (columns-lowColumn)+columns*(highRow-lowRow-1)+(highColumn+1);
    }

    public long getMidValue() { //?
       int[] index=getMidIndex();
       int row=index[0];
       int column=index[1];

       return array[row][column];
    }

    public int[] getMidIndex() {
        int halfSize=size()/2;
        int midRow=lowRow;
        int midColumn=lowColumn;
        midColumn+=halfSize;

        while (midColumn>=columns){ //midColumn还不是合法下标
            midRow++;
            midColumn-=columns;
        }
        return new int[]{midRow,midColumn};
    }

    public void discardRightPart() {
        //high左移 不包括midIndex
        int[] index=getMidIndex();
        int row=index[0];
        int column=index[1];
        //以上求出中间位置

        highRow=row;
        highColumn=column-1;
        if (highColumn<0){
            highRow--;
            highColumn=columns-1;
        }
    }

    public void discardLeftPart() {
        //low右移 不包括midIndex
        int[] index=getMidIndex();
        int row=index[0];
        int column=index[1];
        //以上求出中间位置下

        lowRow=row;
        lowColumn=column+1;
        if (lowColumn>=columns){
            lowRow++;
            lowColumn=0;
        }
    }
}
