package lk.ijse.dep.service;

public class BoardImpl implements Board{

    private final Piece[][] pieces = new  Piece[NUM_OF_COLS][NUM_OF_ROWS];
    private final BoardUI boardUI;

    public BoardImpl( BoardUI boardUI) {

        this.boardUI = boardUI;

        for (int i=0; i<NUM_OF_COLS; i++){
            for (int j=0; j<NUM_OF_ROWS; j++){
                pieces[i][j] = Piece.EMPTY;
            }
        }
    }




    @Override
    public int findNextAvailableSpot(int col) {
        return col;
    }

    @Override
    public boolean isLegalMove(int col) {
        return false;
    }

    @Override
    public boolean exitLegalMoves() {
        return false;
    }

    @Override
    public void updateMove(int col, Piece move) {

    }

    @Override
    public Winner findWinner() {
        return null;
    }

    @Override
    public BoardUI getBoardUI() {
//        BoardUI boardUI1 = new BoardUI();
//
        return null;
    }
}
