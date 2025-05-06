public class q1 {
    public static int count(int sum)
    {
        return count(sum, 1);
    }
    public static int count(int sum, int i)
    {
        if (i == sum || sum == 0)
            return 1;
        if (sum < i)
            return 0;
        return count(sum - i, i + 1) + count(sum , i + 1);
    }

}
