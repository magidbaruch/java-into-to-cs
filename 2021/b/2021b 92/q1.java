public class q1 {
    public static int printExpr(int[]arr,int num)
    {
        return printExpr(arr,num,0,0," ");
    }

    private static int printExpr(int [] arr, int num, int i, int sum, String str)
    {
        if(i == arr.length)
        {
            if(sum == num)
            {
                System.out.println(str);
                return 1;
            }
            else
            {
                return 0;
            }
        }
        return printExpr(arr, num,i + 1,sum + arr[i], str + "+" + arr[i]) +
                printExpr(arr, num,i + 1,sum - arr[i], str + "-" + arr[i])+
                printExpr(arr, num,i + 1, sum, str);
    }
}
