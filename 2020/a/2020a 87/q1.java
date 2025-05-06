public class q1 {

    public static int totalWays(int[][] mat, int k){
        return totalWays(mat, k, 0, 0, 0, 0);
    }
    private static int totalWays(int[][] mat, int k, int i, int j, int curTurns, int lastStep){
        if (i < 0 || i >= mat.length || j < 0 || j >= mat[0].length || curTurns > k)
            return 0;
        if (i == mat.length - 1 && j == mat[0].length - 1){
            if (curTurns == k)
                return 1;
            return 0;
        }
        int continueStraight = 0;
        if (lastStep == 2){
            continueStraight = totalWays(mat, k, i+1, j, curTurns, lastStep);
        }
        else if(lastStep == 3){
            continueStraight = totalWays(mat, k, i, j+1, curTurns, lastStep);
        }
        int turn = 0;
        if (lastStep == 0){
            turn = totalWays(mat, k, i, j+1, curTurns, 3); //going right
            continueStraight =  totalWays(mat, k, i+1, j, curTurns, 2);
        }
        else if (lastStep == 2)
            turn = totalWays(mat, k, i, j+1, curTurns+1, 3);
        else if(lastStep == 3)
            turn = totalWays(mat, k, i+1, j, curTurns+1, 2);
        return continueStraight + turn;
    }












}