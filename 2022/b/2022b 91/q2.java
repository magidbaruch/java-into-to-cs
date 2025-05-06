public class q2 {
    public static int findTriplet(int[] arr) {
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE, max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }
            else if (arr[i] > max2)
            {
                max3 = max2;
                max2 = arr[i];
            }
            else if (arr[i] > max3)
            {
                max3 = arr[i];
            }

            if (arr[i] < min1)
            {
                min2 = min1;
                min1 = arr[i];
            }
            else if (arr[i] < min2)
            {
                min2 = arr[i];
            }
        }

        int prod1 = max1 * max2 * max3;
        int prod2 = min1 * min2 * max1;

        if((max1 * max2 * max3) >= (min1 * min2 * max1))
        {
            System.out.println(max1 + " " + max2 + " " + max3);
            return max1 * max2 * max3;
        }
        else
        {
            System.out.println(min1 + " " + min2 + " " + max1);
            return min1 * min2 * max1;
        }
    }

}
