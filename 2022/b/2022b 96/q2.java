public class q2 {

    public static int kAlmostSearch(int [] a, int num) {
        int low = 0, high = a.length - 1, mid, leftIndex, rightIndex;
        while (low <= high)
        {
            mid = (low + high) / 2;
            if (a[mid] == 0)
            {
                leftIndex = mid - 1;
                rightIndex = mid + 1;
                while (leftIndex >= low && rightIndex <= high)
                {
                    if (a[leftIndex] != 0) {
                        mid = leftIndex;
                        break;
                    }
                    if (a[leftIndex] != 0) {
                        mid = leftIndex;
                        break;
                    }

                    rightIndex++;
                    leftIndex--;
                }

            }

            if (a[mid] == num)
                return mid;
            else if (a[mid] < num)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

}
