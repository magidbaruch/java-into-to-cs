public class q2 {

    public static boolean search(int[][] mat, int num) {

        int startI = 0, startJ = 0;
        int endI   = mat.length  - 1;
        int endJ   = mat[0].length - 1;

        while (!(startI == endI && startJ == endJ)) {

            int midI = (startI + endI) / 2;   // middle row
            int midJ = (startJ + endJ) / 2;   // middle col

            // 1) upper-left quadrant
            if (num >= mat[startI][startJ] && num <= mat[midI][startJ]) {
                endI = midI;
                endJ = midJ;
            }
            // 2) upper-right quadrant
            else if (midJ + 1 <= endJ && num >= mat[startI][midJ + 1] && num <= mat[midI][midJ + 1]) {
                startJ = midJ + 1;
                endI   = midI;
            }
            // 3) lower-right quadrant
            else if (midI + 1 <= endI && midJ + 1 <= endJ && num >= mat[midI + 1][midJ + 1] && num <= mat[endI][midJ + 1]) {
                startI = midI + 1;
                startJ = midJ + 1;
            }
            // 4) lower-left quadrant
            else if (midI + 1 <= endI && num >= mat[midI + 1][startJ] && num <= mat[endI][startJ]) {
                startI = midI + 1;
                endJ   = midJ;
            }
            else {    // num can’t be in any quadrant
                return false;
            }
        }

        System.out.println("row = " + startI + "\ncol = " + startJ);
        return mat[startI][startJ] == num;
    }
    
}
