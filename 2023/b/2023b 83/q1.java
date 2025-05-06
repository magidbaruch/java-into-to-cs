public class q1 {

    public static String minimalSt(String str1, String str2)
    {
        if (str1.length() == 0)
            return str2;
        if (str2.length() == 0)
            return str1;
        if (str1.charAt(0) == str2.charAt(0))
            return str1.charAt(0) + minimalSt(str1.substring(1), str2.substring(1));
        String s1 = str1.charAt(0) + minimalSt(str1.substring(1), str2);
        String s2 = str2.charAt(0) + minimalSt(str1, str2.substring(1));
        return s1.length() < s2.length() ? s1 : s2;
    }

}
