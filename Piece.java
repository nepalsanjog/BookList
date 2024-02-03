public abstract class Piece {
    protected Position position;
    protected String color;

    public Piece(Position pos, String col) {
        this.position = pos;
        this.color = col;
    }

    protected abstract boolean validMove(Board board, Position pos);

    // Method to move the piece to a new position.
    public boolean move(Board board, Position newPosition) {
        // Check if the move is valid for this piece.
        if (validMove(board, newPosition)) {
            this.position = newPosition;
            return true;
        }
        return false;
    }

    // Add a method to get the piece's current position
    public Position getPosition() {

        return position;
    }

    public String geString() {
        return color;
    }
}
