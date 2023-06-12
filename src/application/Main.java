package src.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import src.chess.ChessException;
import src.chess.ChessMatch;
import src.chess.ChessPiece;
import src.chess.ChessPosition;

class Main {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();

        while (true) {
            try {
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UI.readChessPosition(entrada);

                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(entrada);

                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch (ChessException e) {
                System.out.println(e.getMessage());
                entrada.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                entrada.nextLine();
            }
        }

    }
}