package Boardgame;

public class Board {
    private int rows;
    private int collumns;
    private Piece[][] pieces;


    public Board(int rows, int collums) {
        this.rows = rows;
        this.collumns = collums;
        pieces = new Piece[rows][collums];

    }
    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getCollumns() {
        return collumns;
    }

    public void setCollumns(int collumns) {
        this.collumns = collumns;
    }

    public Piece piece(int row, int column){
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        return pieces[position.getRow()][position.getColumn()];
    }
}
