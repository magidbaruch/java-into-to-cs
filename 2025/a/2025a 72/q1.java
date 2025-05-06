public class q1 {
    public static int maxFactor(int num) {
        return maxFactor(num, num - 2);
    }
    private static int maxFactor(int num, int base) {
        if (base == 1)
            return 0;

        String biggestFactor = isFactor(num, base, 0, "");
        if (biggestFactor.length() > 0)
        {
        System.out.println(biggestFactor);
        return base;
        }
        return maxFactor(num, base - 1);
    }

    private static String isFactor(int num, int base, int pow, String currentFactor) {
        if (num == 0) {
            return currentFactor;
        }
        if (num < 0 || num - Math.pow(base, pow) < 0)
            return "";
        String op1 =  isFactor(num - (int)(Math.pow(base, pow)), base, pow + 1, currentFactor + (int)Math.pow(base, pow) + "\t");
        String op2 = isFactor(num, base, pow + 1, currentFactor);
        if (op1.length() > op2.length()) {
            return op1;
        }
        return op2;
    }
}
