public class Queen extends ChessPiece {
    public String color;
    public Queen (String color){
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
        return "Q";
    }
}
