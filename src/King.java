public class King extends ChessPiece{
    public String color;
    public King (String color){
        super (color);
        this.color = color;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if ((0 > line) && (line < 8)) return true;
        if ((line + toLine < 8) && (line + toLine > 0)) return true;
        if ((line - toLine < 8) && (line - toLine > 0)) return true;
        if (line != (line + toLine)) return true;
        if (line != (line - toLine)) return true;
        if (column != (column + toColumn)) return true;
        if (column != (column - toColumn)) return true;
        return false;
    }
    @Override
    public String getSymbol(){
        return "K";
    }
    public boolean isUnderAttack(ChessBoard chessBoard, int line, int column) {
        for (int i = 0; i < chessBoard.board.length; i++) {
            for (int j = 0; j < chessBoard.board[i].length; j++) {
                if (!chessBoard.board[i][j].color.equals(this.color) &&
                        chessBoard.board[i][j].canMoveToPosition(chessBoard, i, j, line, column) &&
                        chessBoard.board[i][j] != null)
                    return true;
            }
        }
        return false;
    }
}
