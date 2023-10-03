package Chapter10.이중민;

public class Traversal {
    private int[] traversal;
    private Moor moor;
    private boolean found;
    private boolean[][] visit;
    public Traversal(Moor m) {
        moor = m;
        traversal = new int[moor.getNumColumns()]; // 그 칸의 행 번호
        visit = new boolean[moor.getNumRows()][moor.getNumColumns()];
        found = traverseMoor(moor, traversal,visit);
    }

    public Moor moor() {
        return moor;
    }
    public boolean existsTraversal() {
        return found;
    }
    public void visitTraversal() {
        if(found) {
            for (int i = 0; i < traversal.length; i++) {
                visit[traversal[i]][i] = true;
            }
        }
        else
            throw new RuntimeException("Traversal: traversal does not exist");
    }

    public int length() {
        if(found) {
            return traversal.length;
        }
        else {
            throw new RuntimeException("Traversal: traversal does not exist");
        }
    }
    public int step(int i) {
        if (found) {
            return traversal[i];
        }
        else {
            throw new RuntimeException("Traversal : traversal does not exist");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        visitTraversal();
        for (int i = 0; i < moor.getNumRows(); i++) {
            for (int j = 0; j < moor.getNumColumns(); j++) {
                if(!moor.land(i, j)) {
                    sb.append("o");
                }
                else if(visit[i][j]) {
                    sb.append("#");
                }
                else {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    private static boolean traverseMoor(Moor m, int[] path, boolean[][] visited) {
        for (int row = 0; row < m.getNumRows(); row++) {
            if (searchTraversal(m, row, 0, path, visited)){
                return true;
            }
        }
        return false;
    }
    private static boolean searchTraversal(Moor m, int r, int c, int[] path, boolean[][] visited) {
        if(!m.land(r, c) || visited[r][c]) {
            return false;
        }
        else {
            path[c] = r;
            visited[r][c] = true;
            if(c == m.getNumColumns() - 1) {
                return true;
            }
            else {
                return searchTraversal(m, r-1, c+1, path, visited) ||
                        searchTraversal(m, r, c + 1, path, visited) ||
                        searchTraversal(m, r+1, c+1, path, visited);
            }
        }
    }
}

