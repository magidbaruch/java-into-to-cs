public class q2 {

    public static boolean findAverege(int[]a, double x)
    {
        int start = 0, end = a.length - 1, sum = 0;
        double length = a.length;

        for (int i = 0; i < length; i++)
        {
            sum += a[i];
        }
        while (start <= end)
        {
            if ((sum / length) == x)
            {
                System.out.println (start + " --- " + end);
                return true;
            }
            else if ((sum / length) > x)
            {
                sum -= a[end];
                end--;
            }
            else if ((sum / length) < x)
            {
                sum -= a[start];
                start++;
            }
            length--;
        }
        return false;
    }
    
}
