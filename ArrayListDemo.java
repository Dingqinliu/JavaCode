import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//定义一个空的顺序表
        list.add("我");//元素尾插
        list.add("爱");
        list.add("学");
        list.add("习");
        System.out.println(list);

        list.add(1,"不");//插入到指定位置，原位置及以后元素全部向后移动
        System.out.println(list);

        list.remove(1);//删除指定位置元素并返回该元素，原位置以后元素全部向前移动
        System.out.println(list);

        list.remove("我");//删除从前往后遍历遇到的第一个相等元素，返回值类型是boolean
        System.out.println(list);

        String s = list.get(0);//返回指定位置的元素
        System.out.println(s);

        list.set(2,"编程");//用新的元素替换指定位置的元素，返回指定位置原来的元素
        System.out.println(list);

        boolean a = list.contains("编程");//判断元素是否存在于线性表中
        System.out.println(a);

        int i = list.indexOf("爱");//从前往后遍历，找到第一个与该元素相等的元素下标
        System.out.println(i);//返回-1表示未找到

        int j = list.lastIndexOf("爱");//从后往前遍历，找到第一个与该元素相等的元素下标
        System.out.println(j);

        list.clear();//清空线性表
        int size = list.size();//0 元素个数
        boolean e = list.isEmpty();//ture 是否为空
        System.out.println(list);
        System.out.println(size);
        System.out.println(e);

    }
}
