public class q2 {
    public static int findFirstMissing(int[] arr)
    {

        // Step 1: Replace negative numbers, zeros, and numbers greater than the array length with a placeholder
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] <= 0 || arr[i] > arr.length)
            {
                arr[i] = arr.length + 1;
            }
        }
        // Step 2: Mark existing numbers by converting the value at their corresponding index to negative
        for (int i = 0; i < arr.length; i++)
        {
            if (Math.abs(arr[i]) <= arr.length && arr[Math.abs(arr[i]) - 1] > 0)
            {
                arr[Math.abs(arr[i]) - 1] = - arr[Math.abs(arr[i]) - 1];
            }
        }
        // Step 3: Find the first positive value, indicating the missing number
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > 0)
            {
                return i + 1;
            }
        }
        // If all numbers from 1 to arr.length are present, the missing number is arr.length + 1
        return arr.length + 1;
    }
}
