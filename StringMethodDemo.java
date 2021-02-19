package bit.java.se;

import java.util.Arrays;

public class StringMethodDemo {
    public static void main1(String[] args) {
        String s;

        // 最常见
        s = "Hello";
        s = "Hello" + " " + "World";
        System.out.println(s);
        // <=> s = "Hello World"

        s = new String();
        // 构造了一个空的字符串 s = "";
        // 空字符串 != null
        // s = ""  完全两个概念 s = null
        System.out.println(s);

        char[] a;
        a = new char[]{'我', '是', '中', '国', '人'};
        s = new String(a);
        // s = "我是中国人"
        System.out.println(s);

        s = new String(a, 1, 2);
        // s = "是中";
        System.out.println(s);

        s = new String("Hello");
        System.out.println(s);

        String t = new String(s);
        System.out.println(t);
    }

    public static void main2(String[] args) {
        String s="我是中国人，我爱中国";
        System.out.println(s.length());
        //数组.length()是属性
        //字符串.length()是方法
        //二者不同
//        System.out.println(s.charAt(0));
//        System.out.println(s.charAt(1));
//        System.out.println(s.charAt(9));
        //System.out.println(s.charAt(10));//越界

//        char[] chars=s.toCharArray();
//        System.out.println(Arrays.toString(chars));

        //这里注意 字符数组的打印会做特殊处理 但其他类型的不会

//        int[] a={1,2,3};
//        System.out.println(a);
//        char[] b={'1','2','3'};
//        System.out.println(b);

        //实现字符串遍历
        //方法一
        int length=s.length();
        for (int i=0;i<length;i++){
            System.out.print(s.charAt(i));
        }

        //方法二
        char[] chars=s.toCharArray();//先处理成一个数组 再遍历数组
        for (int i=0;i<chars.length;i++){
            System.out.println(chars[i]);
        }
        //或者用for-each遍历
        for(char ch:chars){
            System.out.println(ch);
        }
        //或者
        for (char ch:s.toCharArray()){
            System.out.println(ch);
        }

    }

    public static void main3(String[] args) {
        String s="我是中国人，我爱中国";
        System.out.println(s.indexOf('我'));//返回第一次遇到这个字符时的下标
        System.out.println(s.indexOf('我', 3));//从第三个位置开始找
        System.out.println(s.indexOf("我爱"));
        System.out.println(s.indexOf("我爱",7));

        //找到s中所有出现过“我爱”的位置

    }

    public static void main4(String[] args) {
        String s="我爱吃饭，我爱睡觉，我爱玩耍，就是不爱学习";
        for (int i=0;i<s.length();i++){
            System.out.printf("%2d:%c\n",i,s.charAt(i));
        }
        System.out.println("------------");
//        int index=-1;
//        do{
//            index=s.indexOf("我爱",index+1);//实则可以跳过“我爱"的长度
//            System.out.println("index="+index);
//        }while (index!=-1); //越界后index=-1

        //反向查找
        String t="我爱";
        System.out.println(s.lastIndexOf(t));
        System.out.println(s.lastIndexOf('爱', 4));
    }

    //substring 找子串
    public static void main5(String[] args) {
        String s="我爱吃饭，我爱睡觉，我爱玩耍，就是不爱学习";
        System.out.println(s.substring(9));
        System.out.println(s.substring(3, 6));//左闭右开 也就是实际生是[3,5]

    }
    //replace 替换
    public static void main6(String[] args) {
        String s="我爱吃饭，我爱睡觉，我爱玩耍，就是不爱学习";
        String t=s.replace('我','你');
        System.out.println(t);
        String t1=s.replace("我爱","我不爱");
        System.out.println(t1);
    }
    //split() 一个字符串分割为数组
    public static void main7(String[] args) {
        String s="我爱吃饭，我爱睡觉，我爱玩耍，就是不爱学习";
        String[] group = s.split("我爱");
        System.out.println(Arrays.toString(group));

        String s1="255.255.255.0";
        //.运算符在正则表达式中是特殊字符 要让它变成. 需要转义 所以\.
        String[] group1 = s1.split("\\.");//字符串中\本身就需要转义 所以再\
        System.out.println(Arrays.toString(group1));//[]

    }
    //组合 join
    public static void main8(String[] args) {
        String[] group={"192","168","92","7"};
        String s = String.join(".", group);
        System.out.println(s);
    }


    public static void main9(String[] args) {
        String[] a={"Hello","World","你好","世界"};
        String s = String.join("!", a);
        System.out.println(s);
    }
public static void main10(String[] args) {
        String s="hello world";//小写转大写
        String S1 = s.toUpperCase();
        System.out.println(S1);

        String s2 = S1.toLowerCase();//大写转小写
        System.out.println(s2);
    }

    public static void main11(String[] args) {
        String s="hello world";//查找子串是否存在
        boolean s1 = s.contains("ow");
        System.out.println(s1);
        boolean s2 = s.contains("o w");
        System.out.println(s2);
    }

    public static void main12(String[] args) {
        String s="hello world";//询问是否以什么开头
        boolean b = s.startsWith("h");
        System.out.println(b);

        boolean c = s.startsWith("hel", 0);//从0位置开始找
        System.out.println(c);

        boolean d = s.startsWith("hel", 1);//从1位置开始找
        System.out.println(d);
    }

    public static void main13(String[] args) {
        String s="hello world";//以什么结尾
        boolean s1 = s.endsWith("ld");
        System.out.println(s1);
    }

    public static void main14(String[] args) {
        //比较
        //是否相等 == 或 ！=
        // 包含大于小于的比较 > 或者 <
        //是否需要考虑大小写敏感
        //四种 equals()/equals()IgnoreCase()
        //compareTo()/compareToIgnoreCase()
        String s="Hello";
        String t="Hello";
        //System.out.println(s==t); 比较的是二者是否指向同一对象
        boolean b = s.equals(t);
        System.out.println(b);//true 二者指向的对象相等（字符串意义上的相等）

    }
}
