import java.util.Arrays;

public class reference {
    //对象类似于电视 程序不直接接触到对象 而是通过遥控器 也就是引用 间接操控对象
    //即 通过引用 操纵对象
    //一个引用可以不关联到对象，但如果要关联，则只能关联到一个对象上
    //一个遥控器只能操作一个电视 也可以一个都不操作
    //一个对象可以同时被多个引用所指向 多个遥控器操作一个电视
    //引用细分类型 比如通过Scanner定义的变量是个引用 Scanner s; Random r;  String str; long[] array
    //类似于空调遥控器 电视遥控器 汽车遥控器
    //null 是关于引用类型的特殊字面量，如果一个引用的值是null，一般称其为空
    //含义是 这个引用没有指向任何对象
    //String s=null;s是一个String类型的引用，但目前还未指向任何对象
    //引用之间的赋值含义
    //String s=...; String t=s;
    //即 s是一个String类型的引用，指向某个对象
    //t是一个String类型的引用，让t指向s目前指向的对象
    //引用的比较 没有> 和 < 有== !=
    //除了八种之外 全是引用类型
    public static void main(String[] args) {
        long[] array={1,2,3,4,5};

        long[] array2=array;
        System.out.println(Arrays.toString(array2));

        long[] a1=null;//定义了引用a1，没有指向任何对象
        //long b=a1.length;//通过a1引用，找到a1指向的对象，获取对象中的length值
        // System.out.println(b);//找不到 所以会报错 运行时：空指针异常

        long[] array3={1,2,3,4,5};//false
        System.out.println(array==array3);
        //array指向一个对象，放着{1，2，3，4，5}
        //array3指向一个新的对象，也放着{1，2，3，4，5}
        //它俩指向的不是同一个对象
        //比较数组 用 Arrays.equals(a1,a2);
    }

    //解引用 通过引用，修改/获取 该引用指向的对象中的数据
    //System.out.println(a1); 通过a1找到a1指向的对象。获取对象中保存的length的值，打印该值
    //a1[0]=100；通过a1找到a1指向的对象，修改对象中下标为0的位置的元素
    //拿遥控器换台

}
