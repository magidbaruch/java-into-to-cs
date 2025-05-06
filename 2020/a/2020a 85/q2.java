public class q2 {

    public static int stricklyIncreasing(int[]a)
    {
        int count = 0;
        int sum = 0;
        for(int i = 0; i < a.length - 1; i++)
        {
            if(a[i + 1] > a[i])
            {
                count++;
                sum += count;
            }
            else
            {
                count = 0;
            }
        }
        return sum;
    }
}
