package Chapter10.이중민;
public class Moor {

    private boolean[][] moor;

    public Moor(int rows, int columns, double probLand) {
        moor = new boolean[rows][columns];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                moor[r][c] = ((Math.random()) < probLand);
            }
        }
    }

    public int getNumRows() {
        return moor.length;
    }

    public int getNumColumns() {
        return moor[0].length;
    }

    /**
     * r은 이동할 때 0 보다 크면서 moor row보다 작은 곳이 true가 나온다면 이동 가능
     * c은 이동할 때 0 보다 크면서 moor column보다 작은 곳이 true가 나온다면 이동 가능
     */
    public boolean land(int r, int c) {
        return (r >= 0) && (r < moor.length) &&
                (c >= 0) && (c < moor[0].length) && (moor[r][c]);
    }

    @Override
    public String toString() {
        String res = "";
        for (int r = 0; r < moor.length; r++) {
            for (int c = 0; c < moor[0].length; c++)
                res = res + (moor[r][c] ? "*" : "o");
            res = res + "\n";
        }
        return res;
    }

    public boolean[][] getMoor() {
        return moor;
    }
}
