package chess_game;

import java.util.Scanner;

//返回玩家落子位置
//用数组表示 第几行第几列 从0开始
//所以有效范围是[0,2]
public class Player {
    private final Scanner sc=new Scanner(System.in);

    public int[] getPosition(){
        System.out.println("请输入要落子的位置，行列有效取值范围为[0,2]");
        System.out.print(">>>");
        int r,c;
       while (true){
           System.out.print(">>>");
           r=sc.nextInt();
           c=sc.nextInt();

           if (r>=0&&r<=2&&c>=0&&c<=2){
               break;
           }
           System.out.println("行列有效范围为[0,2],请重新输入");

       }
        return new int[]{r,c};
    }
    //询问用户是否继续下一局
    public boolean queryContinue(){
        System.out.println("本局游戏结束，开始新游戏请输入true，否则输入false");
        System.out.print(">>>");
        return sc.nextBoolean();
    }
}
