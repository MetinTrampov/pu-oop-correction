import java.awt.*;

public  abstract class Monsters {

    protected int row;
    protected int col;
    int attackPoints ;
    int defencePoints ;
    int magicPoints ;
    int speed ;
    Color color;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }
    public void move(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public void render(Graphics g) {

        int x = this.col * Tile.TILE_SIZE;
        int y = this.row * Tile.TILE_SIZE;

        g.setColor(this.color);
        g.fillRect(x, y, 50, 50);

        g.setColor(Color.BLACK);
        //g.drawString(this.id, x + 25, y + 25);
    }

    public abstract boolean isMoveValid(int moveRow, int moveCol);



    public abstract boolean isAttackValid(int attackRow, int attackCol);

    public Monsters(int row , int col   , Color color){


    }


}
