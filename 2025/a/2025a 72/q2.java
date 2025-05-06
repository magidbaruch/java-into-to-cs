public class q2 {
    public static int howManyDivisors (int [] arr, int num){
        if (arr.length < num * 2 + 1){
            return -1;
        }
        int currentSum = 0, count = 0;
        for (int i = 0; i < num * 2 + 1; i++)
        {
            currentSum += arr[i];
        }
        if (currentSum % arr[(num * 2 + 1) / 2] == 0){
            count++;
        }
        for (int i = num * 2 + 1; i < arr.length; i++) {
            currentSum -= arr[i - (num * 2 + 1)];
            currentSum += arr[i];
            if (currentSum % arr[i - num] == 0){
                count++;
            }
        }
        return count;
    }
}
