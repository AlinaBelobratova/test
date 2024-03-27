public class Horse extends  ChessPiece{
    public String color;
    public Horse (String color){
        super (color);
        this.color = color;
    }
    @Override
    public String getColor(){
        return this.color;
    }
    @Override
    public boolean canMoveToPosition(ChessBoard chessBoard, int line, int column, int toLine, int toColumn) {
        int[][] positions = new int[][]{
                {line - 2, column - 1}, {line - 2, column + 1},
                {line + 2, column - 1}, {line + 2, column + 1},
                {line - 1, column - 2}, {line - 1, column + 2},
                {line + 1, column - 2}, {line + 1, column + 2}};
        if ((0 > line) && (line < 8)) return true;
        {
            if ((line + toLine < 8) && (line + toLine > 0)) return true;
            if ((line - toLine < 8) && (line - toLine > 0)) return true;
            if (line != (line + toLine)) return true;
            if (line != (line - toLine)) return true;
            if (column != (column + toColumn)) return true;
            if (column != (column - toColumn)) return true;
            return false;
        }
    }
    @Override
    public String getSymbol(){
        return "H";
    }
}


