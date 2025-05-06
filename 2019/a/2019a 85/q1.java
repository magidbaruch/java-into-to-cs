public class q1 {

    public static int longestPalindrome(int[] arr)
    {
        return longestPalindrome(arr, 0, arr.length - 1, arr.length);
    }

    private static int longestPalindrome(int[] arr, int start, int end, int length)
    {
        if(start == end || start > end)
        {
            return length;
        }

        if(start > arr.length - 1)
        {
            return 1;
        }

        if(arr[start] != arr[end])
        {
            return Math.max(longestPalindrome(arr, start + 1, end, length - 1), longestPalindrome(arr, start, end - 1, length - 1));
        }
        return longestPalindrome(arr, start + 1, end - 1, length);
    }
}
