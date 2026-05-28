public int getPointsForRow(int targetRow) {
    int sum = 0;
    String color = board[targetRow][0].getColor();
    boolean sameColor = true;

    for (Tile tile : board[targetRow]) {
        sum += tile.getPoints();

        if (!tile.getColor().equals(color)) {
            sameColor = false;
        }
    }

    if (sameColor) {
        sum *= 2;
    }

    return sum;
}
