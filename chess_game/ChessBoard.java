package chess_game;

import java.util.Arrays;

//棋盘 用来实例化对象
//棋盘对象
//功能 1、落子 2、判断棋盘状态
public class ChessBoard {
   private static final int empty=0;//空白位置用0表示
   private static final int circle=1;//落子为o的位置
   private static final int cross=2;//落子为x的位置
   private final int[][] array={
           {empty,empty,empty},
           {empty,empty,empty},
           {empty,empty,empty}
   };

   public boolean moveCircleAt(int row,int column){//落一个o
      if (array[row][column]!=empty){ //落子前需要先判断该位置是否为空白
         return false;
      }
      array[row][column]=circle;
      return true;
   }

   public boolean moveCrossAT(int row,int column){//某个位置落个x
      if (array[row][column]!=empty){
         return false;
      }
      array[row][column]=cross;
      return true;
   }

   //棋盘的四种状态
   public static final int CIRCLE_WIN=0;//执o者赢  //三横三竖两对角成直线
   public static final int CROSS_WIN=1;//执x者赢
   public static final int DRAW=2;//平局 //没有成直线 但无落子位置了
    public static final int CONTINUE=3;//继续

   public int getState(){//得到棋盘的状态
      //判断行
      for (int i=0;i<3;i++){
         if(array[i][0]==array[i][1]&&array[i][1]==array[i][2]){
            if (array[i][0]==circle){
               System.out.println("恭喜你赢了！");
               return CIRCLE_WIN;
            }
            else if (array[i][0]==cross){
               System.out.println("很遗憾你输了！");
               return CROSS_WIN;
            }
         }
      }

      for (int i=0;i<3;i++){
         if (array[0][i]==array[1][i]&&array[1][i]==array[2][i]){
            if (array[0][i]==circle){
               System.out.println("恭喜你赢了！");
               return CIRCLE_WIN;
            }
            else if(array[0][i]==cross){
               System.out.println("很遗憾你输了！");
               return CROSS_WIN;
            }
         }
      }

      //正负对角线
      if ((array[0][0]==array[1][1]&&array[1][1]==array[2][2])
              ||(array[0][2]==array[1][1]&&array[1][1]==array[2][0])){
         if (array[1][1]==circle){
            System.out.println("恭喜你赢了！");
            return CIRCLE_WIN;
         }
         else if (array[1][1]==cross){
            System.out.println("很遗憾你输了！");
            return CROSS_WIN;
         }
      }
      //无获胜
      for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
           if (array[i][j]==empty){
              return CONTINUE;
           }
        }
      }
      System.out.println("平局！");
      return DRAW;//无获胜也无空白 平局
   }

   private static String show(int i){ //显示
      switch (i){
         case empty:
            return " ";
         case circle:
            return "o";
         case cross:
            return "x";
         default:
            return "1";
      }
   }

   @Override
   public String toString() {
      String s="---------\n";
      for (int i=0;i<2;i++){ //前两行
         s+=String.format("|%s|%s|%s|\n",show(array[i][0]),show(array[i][1]),show(array[i][2]));
         s+="---------\n";
      }
      //最后一行
      s+=String.format("|%s|%s|%s|\n",show(array[2][0]),show(array[2][1]),show(array[2][2]));
      s+="---------";

      return s;
   }

   public void reset() {
      for (int i=0;i<3;i++){
         Arrays.fill(array[i],empty);//所有位置再次设置为空白
      }
   }
}
