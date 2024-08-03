package backtracking;

public class RatInAMaze {


    public static void main(String[] args) {
        //Matrix or array representing teh maze
        int mat[][] = new int[][]{{1, 1, 1, 0},
        {1, 0, 0, 1},
        {1, 1, 0, 0},
        {1, 1, 1, 1}};
        //rows
        int n = mat.length;
        //columns
        int m = mat.length;

        boolean visit[][] = new boolean[n][m];

        System.out.println("Welcome to Rat in a Maze problem!!");
       /* System.out.println("Here is the maze for solving the problem");

        for (int[] element : mat) {
            for (int i : element) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/

        System.out.println("Printing the initial visit array:");
        for (boolean[] element : visit) {
            for (boolean i : element) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        //marking the first location of the visit array true as it is the location from where we start
        visit[0][0] = true;
        System.out.println("Printing the different paths containing the solution");
        ratInaMaze(mat, visit, 0, 0, "", n, m);
        /*System.out.println("Printing the final visit array:");
        for (boolean[] element : visit) {
            for (boolean i : element) {
                System.out.print(i + " ");
            }
            System.out.println();
        }*/
    }

    static void ratInaMaze(int mat[][], boolean visit[][],
                           int i, int j, String path,
                           int n, int m) {
        //Base condition
        if ((i == n - 1) && (j == m - 1)) {
            System.out.println("The path : " + path);
            /*System.out.println("Visit array :");
            for (boolean[] element : visit) {
                for (boolean vi : element) {
                    System.out.print(vi + " ");
                }
                System.out.println();
            }*/
            return;
        }
        //Downward direction D
        //check if teh given path is valid
        if (isValidPath(i + 1, j, mat, visit, n, m)) {
            visit[i + 1][j] = true;
            //path += "D";
            ratInaMaze(mat, visit, i + 1, j, path+"D", n, m);
            visit[i + 1][j] = false;
        }

        //Left Direction
        if (isValidPath(i, j - 1, mat, visit, n, m)) {
            visit[i][j - 1] = true;
//            path += "L";
            ratInaMaze(mat, visit, i, j - 1, path+"L", n, m);
            visit[i][j - 1] = false;
        }

        //Right Direction
        if (isValidPath(i, j + 1, mat, visit, n, m)) {
            visit[i][j + 1] = true;
//            path += "R";
            ratInaMaze(mat, visit, i, j + 1, path+"R", n, m);
            visit[i][j + 1] = false;
        }

        //Upward Direction U
        if (isValidPath(i - 1, j, mat, visit, n, m)) {
            visit[i - 1][j] = true;
//            path += "U";
            ratInaMaze(mat, visit, i - 1, j, path+"U", n, m);
            visit[i - 1][j] = false;
        }

    }

    static boolean isValidPath(int rowidx, int colidx, int[][] mat, boolean[][] visit, int n, int m) {
        return (rowidx < n && rowidx >= 0 && colidx < m && colidx >= 0 && mat[rowidx][colidx] == 1  && !visit[rowidx][colidx]);
    }
}
