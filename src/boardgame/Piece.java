package src.boardgame;

public class Piece {
    
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

}
