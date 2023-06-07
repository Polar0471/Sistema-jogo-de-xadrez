package src.boardgame;

public class BoardException extends RuntimeException {
    private static final long seriealVersionUID = 1L;

    public BoardException(String msg) {
        super(msg);
    }
}
