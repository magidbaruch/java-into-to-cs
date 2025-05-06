public class q1 {
    public static int heaviestPath (int [] arr)
    {
        int []numOfSuccesfulPaths = new int[1];
        int biggestPath = heaviestPath(arr, 0, 1, 0, "", numOfSuccesfulPaths);
        return biggestPath > 0 ? biggestPath : Integer.MAX_VALUE;
    }

    private static int heaviestPath (int [] arr, int i, int numOfSteps, int sum, String Pathes, int []numOfSuccesfulPaths)
    {

        if (i >= arr.length || i < 0 || arr[i] == -1 )
            return Integer.MIN_VALUE;

        if (i == arr.length - 1)
        {
            numOfSuccesfulPaths[0]++;            sum += arr[i];
            System.out.println(numOfSuccesfulPaths[0] +". " + Pathes + " -- " + i + "  sum = " + sum);
            return sum;
        }
        int temp = arr[i];
        arr[i] = -1;

        int right = heaviestPath(arr, i + temp + numOfSteps, numOfSteps + 1, sum + temp, Pathes + " -- " + i, numOfSuccesfulPaths);
        int left = heaviestPath(arr, i - temp - numOfSteps, numOfSteps + 1,sum + temp , Pathes + " -- " + i, numOfSuccesfulPaths);
        arr[i] = temp;
        return Math.max(right, left);

    }

}
