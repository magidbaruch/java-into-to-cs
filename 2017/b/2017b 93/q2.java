public class q2 {

    public static int findNum(Range rangeA [], int num) {
        int high = rangeA.length - 1;
        int low = 0;
        int mid;
        int center, radius;
        while (low <= high) {
            mid = (high + low) / 2;
            center = rangeA[mid].getCenter();
            radius = rangeA[mid].getRadius();

            if (num >= center - radius && num <= center + radius)
                return mid;
            else if (num > radius + center)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }
}
