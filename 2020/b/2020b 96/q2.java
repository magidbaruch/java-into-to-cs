public class q2 {

    public static int minimalPositive (Range[] rangeA){
        int left = 0, right = rangeA.length -1, midd = rangeA.length /2 ;
        int minPositive = -1;
        Range r;

        while (left <= right){

            midd = (right - left + 1) / 2 ;

            if (rangeA[left].getSmall() > 0)
                return rangeA[left].getSmall();

            if(rangeA[right].getBig() < 1)
                return minPositive;

            r = rangeA[midd];
            if(r.getSmall() < 1 && r.getBig() >= 1)
                return 1;

            if(r.getSmall() > 0){
                minPositive = r.getSmall();
                right = midd -1;
            }

            else if (r.getBig() < 1)
                left = midd + 1;
        }
        return minPositive;

    }
}
