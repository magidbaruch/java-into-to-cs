public class q1 {

    public static void findWord(char [][] arr, String word)
    {
        // Matrix to record the path (step number for each letter in the word)
        int [][] toPrintArr = new int [arr.length][arr[0].length];
        // Start searching from position (0, 0)
        findWord(arr, word, 0, 0, toPrintArr);
    }

    // Recursive function that tries every cell as a starting point
    private static void findWord(char[][] arr, String word, int i, int j, int[][] toPrintArr)
    {
        // If we reached the end of the matrix without finding the word
        if (i == arr.length)
        {
            System.out.println("No Such Word");
            return;
        }

        // Try building the word starting from cell (i, j)
        if (findWordHelper (arr, word, i, j, 0, toPrintArr, 1))
        {
            // If successful – print the path and stop
            printArr(toPrintArr);
            return;
        }

        // Otherwise, create a fresh matrix for the next attempt
        int [][] newToPrintArr = new int [arr.length][arr[0].length];

        // Move to the next column, or next row if we reached the end of the current one
        if (j + 1 < arr[0].length)
            findWord(arr, word, i, j + 1, newToPrintArr);
        else
            findWord(arr, word, i + 1, 0, newToPrintArr);
    }

    // Recursive helper that tries to build the word step by step
    private static boolean findWordHelper(char [][] arr, String word, int i, int j, int k, int [][] toPrintArr, int toNum)
    {
        // Base case: full word matched
        if (k == word.length())
            return true;

        // Out of bounds or mismatch or already visited cell
        if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length ||
            arr[i][j] != word.charAt(k) || arr[i][j] == '#')
            return false;

        // Save the original character
        char temp = arr[i][j];
        // Mark as visited
        arr[i][j] = '#';
        // Save the step number
        toPrintArr[i][j] = toNum;

        // Try to move in 4 directions (down, up, right, left)
        boolean found =
                        findWordHelper(arr, word, i + 1, j, k + 1, toPrintArr, toNum + 1) ||
                        findWordHelper(arr, word, i - 1, j, k + 1, toPrintArr, toNum + 1) ||
                        findWordHelper(arr, word, i, j + 1, k + 1, toPrintArr, toNum + 1) ||
                        findWordHelper(arr, word, i, j - 1, k + 1, toPrintArr, toNum + 1);

        // If not found, reset the step in the path matrix
        if (!found)
            toPrintArr[i][j] = 0;

        // Restore the original character before returning
        arr[i][j] = temp;
        return found;
    }

    // Prints the matrix showing the order of steps if the word was found
    private static void printArr(int[][] printMat)
    {
        for (int i = 0; i < printMat.length; i++)
        {
            for (int j = 0; j < printMat[0].length; j++)
            {
                System.out.print(printMat[i][j]);
            }
            System.out.println();
        }
    }
}
