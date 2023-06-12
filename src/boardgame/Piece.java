package src.boardgame;

public abstract class Piece {
    
    // a posição está como private pois não quero que ela fique visível na camada de xadrez. Ela é uma posição simples de matriz e não de xadrez
    protected Position position;
    private Board board;


    public Piece(Board board) {
        this.board = board;
        this.position = null;
    }

    // será acessado somente pelo pacote e pelas subclasses de Piece
    protected Board getBoard() {
        return this.board;
    }

    public abstract boolean[][] possibleMoves();

    // hook method --> método que faz um gancho com a subclasse
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for (int i=0; i<mat.length; i++) {
            for (int j=0; j<mat.length; j++) {
                if (mat[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
