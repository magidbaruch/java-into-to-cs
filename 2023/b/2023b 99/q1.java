public class q1 {

    public static int longestNearlyPal (int[] arr){
        return arr.length == 0 ? 0 : longestNearlyPal(arr, 0, 0, true);
    }

    private static int longestNearlyPal (int[] arr, int left, int right, boolean isPalindrome){
        if(left < 0 || right == arr.length)
            return 0;

        if (left == right)
            return  Math.max(1 + longestNearlyPal(arr, left - 1, right + 1, isPalindrome),
                    Math.max(    longestNearlyPal(arr, left + 1, right + 1, isPalindrome),
                            longestNearlyPal(arr, left, right + 1, isPalindrome)));

        if (arr[left] == arr[right])
            return 2 + longestNearlyPal(arr, left - 1, right + 1, isPalindrome);

        if (isPalindrome != true)
            return 0;

        int removeLeft = longestNearlyPal(arr, left - 1, right, false);
        int removeRight = longestNearlyPal(arr, left, right + 1, false);

        return removeLeft == 0 && removeRight == 0 ? 0 : Math.max(removeLeft, removeRight) + 1;

    }

}
