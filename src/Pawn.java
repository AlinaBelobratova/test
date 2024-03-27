public class Pawn extends ChessPiece {
    public String color;
    public Pawn (String color){
        super (color);
        this.color = color;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        if (toLine < 0 || toLine > 7)
            return false;
        if (column != toColumn)
            return false;
        if (line == toLine)
            return false;
        if (color.equals("White")) {
            if ((line == 1) && ((toLine - line) == 2)) return true;
            else if ((line > 1) && ((toLine - line) == 1)) return true;
        }
        if (color.equals("Black")) {
            if ((line == 6) && ((line - toLine) == 2)) return true;
            else if ((line < 6) && ((line - toLine) == 1)) return true;
        }
        return false;
    }
        @Override
        public String getSymbol(){
            return "P";
        }
}
