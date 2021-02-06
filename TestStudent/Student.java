public class Student {
    //方法分为普通方法和静态方法
    //没有static，必须通过对象去操作（普通方法）
    //有static，通过类去操作（静态方法）
    //提到方法，若不加说明，可认为是普通方法

    //在类中定义了属性
    public String name;
    public int age;
    public String[] courseArray;

    //在类中定义 普通方法
    public void selfIntroduction(){
        //在方法中可以直接使用属性
        System.out.printf("我是%s,我的年龄为%d岁，本学期我的专业课有以下几门：\n",name,age);
        if (courseArray!=null){
            for(String course:courseArray){
                System.out.println(course);
            }
        }
    }
}
