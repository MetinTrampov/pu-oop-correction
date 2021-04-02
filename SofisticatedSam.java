import java.awt.*;

public class SofisticatedSam extends  Monsters {
    int row ;
    int col ;
    int attack  = 10;
    int defence = 5;
    int magic   = 4;
    int speed   = 1;


    public SofisticatedSam(int row , int col  , Color color ) {
        super(col,row,Color.RED);
        // this.attack     =   attack;
        //   this.defence    =   defence;
        //  this.magic      =   magic;
        //  this.speed      =   speed;
        this.row        = row;
        this.col        = col;
        this.color      = color;


    }

    public  void printPiece (Graphics g){
        g.fillRect(0,0,500,500);
        g.setColor(Color.red);

    }



    @Override
    public boolean isMoveValid(int moveRow, int moveCol) {
        return false;
    }

    @Override
    public boolean isAttackValid(int attackRow, int attackCol) {
        return false;
    }
}
