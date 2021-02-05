//对象=状态（数据）+操作=属性（field）+方法（method）。对象是一组数据的组织单位。
//类需要定义这类对象具有的属性和方法。（类规定了对象有哪些数据）。
//需要掌握的语法
//1、如何定义类。
//2、如何使用定义好的类，实例化出对象。
//3、如何使用对象（通过引用）。
//  （1）、操作对象中的属性。
//  （2）、调用对象关联的方法。
//属性（field）又可以称为实例变量或对象变量。
//属性定义在类的内部，方法的外部 类型不限定。
//利用类去实例化对象。定义好的类，可以当作数据类型使用（通过这种类型定义的数据，都是引用类型）。比如：Scanner s= new Scanner();
//使用同一个类实例化出的是不同的对象。可理解为带有new的操作，会实例化出一个新的对象。
//操作对象的属性的语法（读取/修改），通过 . 解引用。
//属性也遵循默认值规则---即默认值为0的变形。
//对象不能直接指向对象。但对象中有引用，引用可以指向对象。

public class pra01 {
    public static void main(String[] args) {
        //使用Student类实例化对象
        Student a=new Student();
        Student b=new Student();
        Student c=new Student();

        //思考：a、b、c指向的是同一个对象吗？
        System.out.println(a==b);//false
        System.out.println(b==c);//false
        //因为带有new的操作，就会实例化出一个新的对象出来

        //操作对象的属性的语法（读取/修改）--通过.解引用

        System.out.println(a.name);//读取 0的变形
        System.out.println(b.age);

        //修改 通过解引用修改对象的属性
        a.name="美女";
        b.age=18;
        System.out.println(a.name);//美女
        System.out.println(b.age);//18
    }

}
