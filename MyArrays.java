public class MyArrays {
    public static void main(String[] args) {
       long[] array={2,4,6,8};
        System.out.println(toString(array));

        long[] array2;
        array2=new long[0];//检验空数组情况
        System.out.println(toString(array2));

        long[] c1=copyOf(array,1);
        System.out.println(toString(c1));
        long[] c2=copyOf(array,4);
        System.out.println(toString(c2));
        long[] c3=copyOf(array,6);
        System.out.println(toString(c3));

        long[] c4=copyOfRange(array,0,0);
        System.out.println(toString(c4));

        long[] c5=copyOfRange(array,1,6);
        System.out.println(toString(c5));


    }

    public static String toString(long[] array){
        //基本思想仍是遍历
        String ans="[";

        //遍历最后一个元素前的所有元素（因为带逗号）
            for (int i = 0; i < array.length - 1; i++) {
                ans = ans +  array[i]+ ",";
            }
        //把最后一个元素添加到字符串ans中
        //需要考虑空数组的情况
        if (array.length>0) {
            ans = ans + array[array.length - 1];
        }

        ans=ans+"]";//添加反括号
        return ans;
    }

    public static long[] copyOf(long[] original, int newlength){
        //长度判断
        if (newlength<0){
            throw new RuntimeException("newLength必须大于0");
        }

        long[] ans=new long[newlength];
        //下标i到original.length和ans.length中最小的那一个（均合法）
        int size=Integer.min(original.length,newlength);
        for (int i=0;i<size;i++){
            ans[i]=original[i];
        }
        //如果newLength>original.length了
        //ans中剩余的位置，已经是long类型的默认值0
        //所以无需处理
        return ans;
    }

    public static long[] copyOfRange(long[] original,int from,int to){
        if (from<0){
            throw new RuntimeException("from必须>=0");
        }
        if (from>to){
            throw new RuntimeException("from必须<=to");
        }
        if (from>original.length){
            throw new RuntimeException("from必须<=original.length");
        }

        int newLength=to-from;
        long[] ans=new long[newLength];

        //i代表ans的下标时
        //i的取值需满足两个条件
        //1、i在ans中是合法下标，[0,ans.length-1]
        //2、from+i在original中是合法下标[0,original.length-1]
        //i的取值[-from,original.length-from-1]
        //最后，i的合法范围取交集
        //也就是[0,min(ans.length,original.length-from))
        int size=Integer.min(newLength,original.length-from);
        for (int i=0;i<size;i++){
            ans[i]=original[from+i];//下标不等，但均需合法
        }
        //i如果代表original的下标
        //for(int i=from;i<？;i++){ans[i-from]=original[i];}
        return ans;
    }
    //填充默认值的情况和copyOf相同
}
