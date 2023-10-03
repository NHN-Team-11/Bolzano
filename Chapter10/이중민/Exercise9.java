package Chapter10.이중민;

public class Exercise9 {
    static final int[] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
    static final int[] dy = {-1, 0 , 1 , 1 ,1 ,0 ,-1 ,-1};
    private Moor moor;
    private boolean[][] moorMatrix;
    private boolean[][] visited;
    public Exercise9(Moor m) {
        moor = m;
        visited = new boolean[m.getNumRows()][m.getNumColumns()];
        moorMatrix = m.getMoor();
    }

    public void dfs(int x, int y) {
        visited[x][y] = true;
        for (int i = 0; i < dx.length; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if(moor.land(nextX, nextY) && !visited[nextX][nextY]) {
                dfs(nextX, nextY);
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < moor.getNumRows(); i++) {
            for (int j = 0; j < moor.getNumColumns(); j++) {
                if (visited[i][j]) {
                    sb.append('#'); // 'V' represents a visited cell
                } else if (moorMatrix[i][j]) {
                    sb.append('*'); // 'L' represents a land cell
                } else {
                    sb.append('o'); // 'W' represents a water cell or unvisited cell
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}

