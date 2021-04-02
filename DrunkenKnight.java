import java.awt.*;

public   class DrunkenKnight  extends Monsters {
    int row ;
    int col ;
    int attack  = 5;
    int defence = 5;
    int magic   = 5;
    int speed   = 5;

    public DrunkenKnight(int row , int col  , Color color ) {
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
        g.setColor(Color.yellow);

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
