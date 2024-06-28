package Boardgame;

public class Board {
    private int rows;
    private int columns;
    private Piece[][] pieces;


    public Board(int rows, int collums) {
        if (rows <1 && collums < 1){
            throw new BoardException("Error creating bopard");
        }

        this.rows = rows;
        this.columns = collums;
        pieces = new Piece[rows][collums];

    }
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }


    public Piece piece(int row, int column){
        if(!positionExists(row,column)){
            throw new BoardException("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    public void placePiece(Piece piece, Position position){
        if(thereIsAPiece(position)){
            throw new BoardException("There is already a piece on position" + position);
        }

        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    public Piece removePiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        if(piece(position) == null){
            return null;
        }
        Piece aux = piece(position);
        aux.position = null;
        pieces[position.getRow()][position.getColumn()] = null;
        return aux;
    }

    private Boolean positionExists(int row, int column){
        return row >=0 && row < rows && column >=0 && column < columns;
    }

    public Boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if(!positionExists(position)){
            throw new BoardException("Position not on the board");
        }
        return piece(position) != null;
    }




}
