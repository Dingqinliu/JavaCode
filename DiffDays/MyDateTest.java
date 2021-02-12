public class MyDateTest {
    public static void main(String[] args) {
        MyDate from=new MyDate(2025,1,15);
        MyDate to=new MyDate(2025,1,13);

        //测试compareTo()
//        System.out.println(to.compareTo(from));//正数
//        System.out.println(from.compareTo(to));//负数
//        System.out.println(to.compareTo(to));//0
//        System.out.println(from.compareTo(from));//0

        System.out.printf("从%s到%s经过了%d天\n",from,to,to.DiffDays(from));
    }
}

