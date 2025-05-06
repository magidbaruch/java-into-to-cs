public class q1 {
    public static boolean isJump(String str1,String str2,int step)
    {
        if(str1.length()<str2.length())
        {
            return false;
        }
        return isJump(str1, str2,step,0);
    }

    private static boolean isJump(String str1,String str2,int step,int maxStep)
    {
        if(str2.equals(" "))
        {
            return true;
        }
        if(str1.equals(" "))
        {
            return false;
        }
        if(maxStep == 0 && str1.charAt(0) != str2.charAt(0))
        {
            return false;
        }
        if(maxStep == 0 && str1.charAt(0) == str2.charAt(0))
        {
            return isJump(str1.substring(1), str2.substring(1), step, step - 1);
        }
        return isJump(str1.substring(1), str2, step, maxStep - 1);
    }

    public static int strStep(String str1, String str2) {
        return strStep(str1, str2, 1);
    }

    private static int strStep(String str1, String str2, int step)
    {
        if (step > (str1.length() - str2.length() - 1))
        {
            return -1;
        }

        if (isJump(str1, str2, step))
        {
            return step;
        }
        return strStep(str1, str2, step + 1);
    }
}
