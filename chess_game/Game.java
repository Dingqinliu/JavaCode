package chess_game;

import java.util.Arrays;

public class Game {
    private final ChessBoard chessboard;
    private final Player player;
    private final AI ai;

    public Game(Player player){
        this.chessboard=new ChessBoard();
        this.player=player;
        this.ai=new AI();
    }

    //初始化
    public void Init(){
        System.out.println("欢迎进入三子棋游戏");
        System.out.println(chessboard);
    }

    //回合制游戏，游戏主流程
    public void play(){
        while (true){  //一次循环=player回合+AI回合
           if (playerTurn()){//玩家回合
               break;
           }
           if (aiTurn()){//ai回合
               break;
           }
        }
    }

    private boolean aiTurn() {
        System.out.println("AI回合：");
        while (true) {
            int[] rc=ai.getPosition();
            int row=rc[0];
            int column=rc[1];
            if(chessboard.moveCrossAT(row, column)){
                break;
            }
        }
        System.out.println(chessboard);

        return chessboard.getState()!=ChessBoard.CONTINUE;

    }

    private boolean playerTurn() {
        System.out.println("玩家回合：");

        while (true) {
            int[] rc=player.getPosition();
            int row=rc[0];
            int column=rc[1];
            if(chessboard.moveCircleAt(row, column)){
                break;
            }
            System.out.println("该位置已经有棋子，请重新选择位置");
        }
        System.out.println(chessboard);
//        if (chessboard.getState()==ChessBoard.CONTINUE){
//           return false; //游戏不能结束
//        }
//        return true;
        return chessboard.getState()!=ChessBoard.CONTINUE;
    }
    //新一局游戏开始时 游戏的界面需要重置 否则会是上一局游戏的结局界面
    public void destory(){
        chessboard.reset();
    }

}
