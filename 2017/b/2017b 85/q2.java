public class q2 {

    public static void printClosest(int[]a, int[]b, int x){
        int i = 0;
        int j = b.length - 1;
        int a1 = a[i];
        int b1 = b[j];
        while (j >= 0 && i < a.length)
        {
            if (Math.abs(x - (a1 + b1)) > Math.abs(x - (a[i] + b[j])))
            {
                a1 = a[i];
                b1 = b[j];
            }

            if (a[i] + b[j] < x)
                i++;
            else
                j--;
        }
        System.out.println(a1 + " and " + b1);
    }

}
