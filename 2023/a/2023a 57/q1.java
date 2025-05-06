public class q1 {
    public static int selectPrime(int num,int x)
    {
        return selectPrime(num,x,2,0,0);
    }

    private static int selectPrime(int num,int x,int prime,int count,int power)
    {
        if(num==1)
        {
            if(power==x)
            {
                System.out.println(prime);
                count++;
            }
            return count;
        }

        if(num%prime==0)
        {
            return selectPrime(num/prime,x,prime,count+1,power+1);
        }

        if(power==x)
        {
            System.out.println(prime);
            count++;
        }
        return selectPrime(num,x,nextPrime(prime),count,0);
    }




    public static int nextPrime(int nextPrime)
    {
        nextPrime++;
        while(!isPrime(nextPrime))
        {
            nextPrime++;
        }
        return nextPrime;
    }

    public static boolean isPrime(int number)
    {
        if(number<=1)
        {
            return false;
        }
        for(int i=2; i<=Math.sqrt(number);i++)
        {
            if(number%i==0)
            {
                return false;
            }
        }
        return true;
    }
}
