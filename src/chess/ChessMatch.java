package chess;

import Boardgame.Board;
import Boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getCollumns()];
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCollumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }

        }
        return mat;
    }

    private void initialSetup(){
        board.placePiece(new Rook(board, Color.WHITE), new Position(7, 1));
        board.placePiece(new King(board, Color.BLACK), new Position(0, 4));
    }


}