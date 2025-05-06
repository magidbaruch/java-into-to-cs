public class q1 {
    public static int lcs (String st1, String st2, String st3)
    {
        if (0 == st1.length() || 0 == st2.length() || 0 == st3.length())
            return 0;
        if (st1.charAt(0) == st2.charAt(0) && st1.charAt(0) == st3.charAt(0))
            return 1 + lcs (st1.substring(1), st2.substring(1), st3.substring(1));
        return Math.max(lcs(st1.substring(1), st2, st3),
               Math.max(lcs(st1, st2.substring(1), st3),
                        lcs(st1, st2, st3.substring(1))));

    }
}
