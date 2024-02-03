
public class Pawn extends Piece {
    private boolean firstMove = true;

    public Pawn(Position position, String color) {
        super(position, color);
        this.firstMove = true;
        this.color = color;
    }

    @Override
    public boolean validMove(Board board, Position newPosition) {

        int startX = this.position.getX();
        int startY = this.position.getY();
        int endX = newPosition.getX();
        int endY = newPosition.getY();
    }
}
