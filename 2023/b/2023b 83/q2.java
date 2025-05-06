public class q2 {

        public static int findSmallestSubarrayLen(int[] arr, int num) 
        {
            int minLength = Integer.MAX_VALUE;
            int left = 0, sum = 0, minLeft = 0, minRight = 0;

            for (int right = 0; right < arr.length; right++) {
                sum += arr[right];

                while (sum > num) {
                    if (minLength > right - left + 1) {
                        minLength = right - left + 1;
                        minLeft = left;
                        minRight = right;
                    }
                    if (right - 1 >= 0) {
                        if (sum - arr[right] <= num) {
                            System.out.println("Subarray found [" + left + " - " + right + "]");
                        }
                    }
                    sum -= arr[left];
                    left++;
                }
            }

            if (minLength == Integer.MAX_VALUE) {
                System.out.println("No Subarray exists");
                return 0;
            }

            System.out.println("Smallest Subarray found [" + minLeft + " - " + minRight + "]");
            return minLength;
        }
        
}
