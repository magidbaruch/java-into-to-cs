public class q1 {
    public static int countEqualDiff(int [] arr)
    {
        return countEqualDiff(arr, 0, 0, 0, 0, "", "");
    }

    private static int countEqualDiff(int [] arr, int i, int set1, int set2, int length, String elementsOfSet1, String elementsOfSet2)
    {
        if(i == arr.length) {
            if (Math.abs(set1 - set2) == Math.abs(arr.length - length - length)) {
                System.out.println(elementsOfSet1 + "\t  sum = " + set1 + " count = " + length);
                System.out.println(elementsOfSet2 + "\t  sum = " + set2 + " count = " + (arr.length - length));
                System.out.println();
                return 1;
            } else return 0;
        }
        return countEqualDiff(arr, i + 1, set1 + arr[i], set2, length + 1, elementsOfSet1 + arr[i] + " ", elementsOfSet2) +
                countEqualDiff(arr, i + 1, set1, set2 + arr[i], length, elementsOfSet1, elementsOfSet2 + arr[i] + " ");
    }
}
