import java.awt.*;

public class Sandturtle extends  Monsters {
    int row ;
    int col ;
    int attack  = 5;
    int defence = 10;
    int magic   = 1;
    int speed   = 4;
    public Sandturtle(int row , int col  , Color color ) {
        super(col,row,Color.GRAY);
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
