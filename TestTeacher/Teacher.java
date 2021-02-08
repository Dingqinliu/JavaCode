//定义构造方法
//接近于方法，但有区别：
//1、没有返回值类型
//2、出现方法名的位置必须使用类名
public class Teacher {
    public String name;
    public int age;
    public String[] courseArray;

    //定义构造器 构造方法重载--方法名相同 参数列表不同
    public Teacher(){} //没有参数的
    public Teacher(String name){}//一个参数的
    public Teacher(String name,int age){}//两个参数的
    public Teacher(String name,int age,String[] courseArray){}//三个参数的

}
