public class q1 {
    public static int calc(int num, int result, int maxOp)
    {
        return calc(num, num, result, maxOp, "" + num );
    }

    private static int calc(int num, int sum, int result, int maxOp, String str)
    {
        if (maxOp < 0)
            return 0;
        if (sum == result) {
            System.out.println(str + " = " + result);
            return 1;
        }
        return calc(num, sum + num, result, maxOp - 1, str + " + " + num) +
                calc(num, sum - num, result, maxOp - 1, str + " - " + num) +
                calc(num, sum * num, result, maxOp - 1, str + " * " + num) +
                calc(num, sum / num, result, maxOp - 1, str + " / " + num);

    }

}
