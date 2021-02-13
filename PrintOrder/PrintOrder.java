public class PrintOrder {
    public static void main(String[] args) {
        System.out.println("1");//1
        new 执行顺序();//CB
        System.out.println("2");
        new 执行顺序();
        System.out.println("3");
    }

}
class Print{
    public static int a = initStatic();//D

    {
        System.out.println("A");//A
    }

    public Print() {
        this("Hello");//?C
        System.out.println("B");//B
    }

    public Print(String s) {
        System.out.println("C");
    }

    public int b = init();

    public static int initStatic() {
        System.out.println("D");
        return 0;
    }

    public int init() {
        System.out.println("E");
        return 0;
    }

    static {
        System.out.println("F");
    }
}