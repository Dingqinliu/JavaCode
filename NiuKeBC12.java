import java.util.Scanner;

//先找规律
//循环五行
//第一行 ----1\n
//第二行 ---1-1\n
//第三行 --1-1-1\n
public class NiuKeBC12 {
    public static void main(String[] args) {

        Scanner sca=new Scanner(System.in);
        System.out.println("分别输入字符和要打印的行数：");
        String ret=sca.next();
        int lines=sca.nextInt();

        int d=1;
        while (d<=lines){
            for(int i=0;i<lines-d;i++){
                System.out.print(" ");
            }
            for (int i=0;i<d;i++){
                System.out.print(ret+" ");
            }
            System.out.println();
            d++;
        }

    }

//        //打印第一行
//        for(int i=0;i<4;i++){
//            System.out.print(" ");
//        }
//        System.out.println(ret);
//
//        //打印第二行
//        for(int i=0;i<3;i++){
//            System.out.print(" ");
//        }
//        for(int i=0;i<2;i++){
//            System.out.print(ret+" ");
//        }
//        System.out.println();//换行
//
//        //打印第三行
//        for(int i=0;i<2;i++){
//            System.out.print(" ");
//        }
//        for(int i=0;i<3;i++){
//            System.out.print(ret+" ");
//        }
//        System.out.println();//换行
//
//        //打印第四行
//        for(int i=0;i<1;i++){
//            System.out.print(" ");
//        }
//        for(int i=0;i<4;i++){
//            System.out.print(ret+" ");
//        }
//        System.out.println();//换行
//
//        //打印第五行
//        for(int i=0;i<5;i++){
//            System.out.print(ret+" ");
//        }
//        System.out.println();//换行
//    }

}

//以上代码重复率过高，可以处理成整体循环
//规律 int 第几行 while(第几行<=5){打印一行(第几行++)}
//在变化的是 字符和空格的打印
//- r   d
//4 1 第一行  5-d d
//3 2 第二行  5-d d
//2 3
//1 4
//0 5

