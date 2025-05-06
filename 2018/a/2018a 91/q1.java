public class q1 {

    public static int cheapestRoute(int[] stations)
    {
        return cheapestRoute(stations, 0, 0);
    }

    private static int cheapestRoute(int[] stations, int i, int sum) {
        if (i > stations.length - 1)
            return Integer.MAX_VALUE;

        if (i == stations.length - 1)
            return sum + stations[i];

        return Math.min(cheapestRoute(stations, i + 1, sum + stations[i]),
                        cheapestRoute(stations, i + 2, sum + stations[i]));
    }
}
