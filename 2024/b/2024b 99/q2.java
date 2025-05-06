import java.util.Arrays;

public class q2 {
    public static int smallestDiffPair(int [] a, int[] b)
    {
        int i = 0, j = 0;
        int elementA = a[0], elementB = b[0];
        int minDiff = Math.abs(elementA - elementB);
        int currentDiff = Integer.MAX_VALUE;
        Arrays.sort(a);
        Arrays.sort(b);
        while ((i < a.length && j < b.length) && minDiff != 0)
        {
            currentDiff = Math.abs(a[i] - b[j]);
            if (currentDiff < minDiff)
            {
                minDiff = currentDiff;
                elementA = a[i];
                elementB = b[j];
            }
            if (a[i] < b[j])
                i++;
            else
                j++;

        }
        System.out.println(elementA + "---" + elementB);
        return minDiff;
    }

    public static int biggestDiffPair(int [] a, int[] b)
    {
        int minValueA = Integer.MAX_VALUE;
        int maxValueA = Integer.MIN_VALUE;
        int minValueB = Integer.MAX_VALUE;
        int maxValueB = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            if(a[i] < minValueA){
                minValueA = a[i];
            }
            if(a[i] > maxValueA){
                maxValueA = a[i];
            }
        }

        for (int i = 0; i < b.length; i++) {
            if(b[i] < minValueB){
                minValueB = b[i];
            }
            if(b[i] > maxValueB){
                maxValueB = b[i];
            }
        }
        if (Math.abs(maxValueA - minValueB) > Math.abs(maxValueB - minValueA)) {
            System.out.println(minValueB + "---" + maxValueA);
            return Math.abs(minValueB - maxValueA);
        }
        else {
            System.out.println(minValueA + "---" + maxValueB);
            return Math.abs(maxValueB - minValueB);
        }
    }
}
