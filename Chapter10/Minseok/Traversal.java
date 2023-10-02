package Chapter10.Minseok;

public class Traversal {
    private int[] traversal;
    private Moor moor;
    private boolean[][] visited;
    private boolean found;

    // Exercise 8
    public Traversal(Moor m) {
        moor = m;
        traversal = new int[moor.getNumColumns()];
        visited = new boolean[moor.getNumRows()][moor.getNumColumns()];
        found = traverseMoor(moor, 0, 0, 0);
    }

    public Moor moor() {
        return moor;
    }

    public boolean existsTraversal() {
        return found;
    }

    public int length() {
        if (found)
            return traversal.length;
        else
            throw new RuntimeException("Traversal: traversal does not exist");
    }

    public int step(int i) {
        if (found)
            return traversal[i];
        else
            throw new RuntimeException("Traversal: traversal does not exist");
    }

    // Exercise7
    public String toString() {
        int Rows = moor.getNumRows();
        int Cols = moor.getNumColumns();

        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < Rows; row++) {
            for (int col = 0; col < Cols; col++) {
                int index = traversal[col];
                boolean isLand = moor.land(row, col);

                char c;

                if (isLand) {
                    if (index == row) {
                        c = '#';
                    } else {
                        c = '*';
                    }
                } else {
                    c = 'o';
                }
                sb.append(c);
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    private boolean traverseMoor(Moor m, int row, int col, int length) {
        if (col == m.getNumColumns()) {
            return true;
        }

        if (!m.land(row, col) || visited[row][col]) {
            return false;
        }

        visited[row][col] = true;

        traversal[length] = row;

        int[] index = { -1, 0, 1 };
        for (int i = 0; i < index.length; i++) {
            int j = index[i];
            if (row + j >= 0 && row + j < m.getNumRows()) {
                if (traverseMoor(m, row + j, col + 1, length + 1)) {
                    return true;
                }
            }
        }

        visited[row][col] = false;

        return false;
    }

    private boolean searchTraversal(Moor m, int r, int c, int[] path) {
        if (!m.land(r, c) || visited[r][c])
            return false;
        else {
            path[c] = r;
            visited[r][c] = true;
            if (c == m.getNumColumns() - 1)
                return true;
            else
                return searchTraversal(m, r - 1, c + 1, path) ||
                        searchTraversal(m, r, c + 1, path) ||
                        searchTraversal(m, r + 1, c + 1, path);
        }
    }

}
