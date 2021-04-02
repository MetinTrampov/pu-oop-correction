import javax.swing.*;
import java.awt.*;

public class Board extends JFrame {

    public static final int TILE_SIDE_COUNT = 12;
    int countBoxes = 12;
    int coordinate = 60;
    int borders = 3;

        private Monsters[][] monsterCollection;



    public Board (){
        this.monsterCollection = new Monsters[TILE_SIDE_COUNT][TILE_SIDE_COUNT];


        this.monsterCollection[1][7]=(new DrunkenKnight(1,7,Color.red));
        this.monsterCollection[7][7]=(new DrunkenKnight(7,7,Color.red));
        this.monsterCollection[6][7]=(new DrunkenKnight(6,7,Color.red));
        this.monsterCollection[1][6]=(new SofisticatedSam(1,6,Color.CYAN));
      // this.monsterCollection[2][3]=(new Sandturtle(2,3,Color.CYAN));
      //  this.monsterCollection[1][5]=(new SofisticatedSam(1,5,Color.CYAN));
       // this.monsterCollection[1][4]=(new SofisticatedSam(1,4,Color.CYAN));

       // this.monsterCollection[2][7]=(new DrunkenKnight(2,7,0,0,Color.yellow,5,5));
       // this.monsterCollection[3][7]=(new DrunkenKnight(3,7,0,0,Color.yellow,5,5));
       // this.monsterCollection[4][7]=(new DrunkenKnight(4,7,0,0,Color.yellow,5,5));





        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setVisible(true);




    }
    /*public void paint(Graphics g) {

        for(int row = 0; row < countBoxes; row++) {
            for(int col = 0; col < countBoxes; col++) {
                this.renderGameTile(g, row, col);
                this.renderGamePiece(g, row, col);

            }
        }
    }*/
    public void  paint (Graphics g){
        g.fillRect(0, 0, 1200, 800);
        g.setColor(Color.BLUE);

        for (int i = 0; i < countBoxes; i++) {
            for (int j = 0; j < countBoxes; j++) {

                this.renderGameTile(g, i, j,Color.RED);
                this.renderGamePiece(g, i, j);

                g.fillRect(i * coordinate, j * coordinate, coordinate - borders, coordinate - borders);

            }

        }
       // DrunkenKnight knight = new DrunkenKnight(5,5,5,5);
    }

   /* private Color getTileColor(int row, int col) {

        boolean isRowEven  = (row % 2 == 0);
        boolean isRowOdd   = !isRowEven;
        boolean isColEven  = (col % 2 == 0);
        boolean isColOdd   = !isColEven;

        if(isRowEven && isColEven   ) return Color.BLACK;
        if(isRowEven && isColOdd    ) return Color.WHITE;
        if(isRowOdd  && isColEven   ) return Color.WHITE;

        return Color.BLUE;
    }*/
    private void renderGameTile(Graphics g, int row, int col,Color color) {


        Tile tile = new Tile(row, col,Color.red);
        tile.render(g);
    }

    private Monsters getBoardPiece(int row, int col) {
        return this.monsterCollection[row/2][col/2];
    }

    private boolean hasBoardPiece(int row, int col) {
        return this.getBoardPiece(row, col) != null;
    }

    private void renderGamePiece(Graphics g, int row, int col) {

        if(this.hasBoardPiece(row, col)) {

            Monsters m = this.getBoardPiece(row, col);
            m.render(g);
        }
    }

    private int getBoardDimentionBasedOnCoordinates(int coordinates) {
        return coordinates / Tile.TILE_SIZE;
    }
}
