public class Teacher {
    //把类用于实例化对象的模板---都不被static修饰
    //一直和Teacher对象有关
    public String name;//某个老师（对象）的名字
    public int age;//某个老师（对象）的年龄

    //构造方法用于构造某个老师（对象）
    public Teacher(String name,int age){
        this.name=name;
        this.age=age;
    }

    //某个老师(对象)的自我介绍
    public void introduce(){
        System.out.printf("我是%s,我今年%d岁\n",name,age);
    }

    //把类用于静态属性和静态方法的集合---都被static修饰
    public static int countOfTeacher=0;
    //超脱于一个个老师（对象）之上，和Teacher无关

    //和Teacher无关
    public static String buildTeacher(String name){//新增
        countOfTeacher++;
        return name;
    }

    //和Teacher无关
    public static int getCountOfTeacher(){//统计
        return countOfTeacher;
    }
}
