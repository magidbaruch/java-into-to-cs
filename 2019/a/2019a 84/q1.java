public class q1 {

    public static boolean sumPower3(int num)
    {
        return sumPower3(num , 0 , 0);
    }


    static private boolean sumPower3(int num, int pow, int sum)
    {
        int thisPow = (int) Math.pow(3,pow);
        if (num == sum){
            return true;
        }

        if(thisPow > num)
            return false;

        boolean with = sumPower3(num, pow + 1, sum + thisPow);
        boolean skip = sumPower3(num, pow + 1, sum);
        return with || skip;
    }

}
