import java.util.Arrays;

public class RollingDie {

    public int toss(){
        return (int)(6 * Math.random()) + 1;
    }

    public int[] getRolls(int numTosses) {
        int[] tossA = new int[numTosses];
        for (int i = 0; i < numTosses; i++) {
            tossA[i] = toss();
        }
        return tossA;
    }

    public int getBestRun(int[] values) {
        int currentRun = 0;
        int bestRun = 0;
        int currentCount = 0;
        int bestCount = 0;

        for (int n = 1; n < values.length; n++) {

            if (values[n] == values[n - 1])
            { currentCount++; }
            else {
                if (currentCount > bestCount) {
                    bestCount = currentCount;
                    bestRun = currentRun;
                }
                currentCount = 0;
                currentRun = n;
            }
        }
        if (currentCount > bestCount) {bestRun = currentRun;}
        if (bestCount == 0) return -1;
        return bestRun;
    }


    public static void main(String[] args) {
        RollingDie nc = new RollingDie();

        for (int p = 0; p < 10; p++) {
            int[] tossArr = nc.getRolls(20);
            for (int i = 0; i < 20; i++)
                System.out.print(tossArr[i] + ",");
            System.out.println();


            int n = nc.getBestRun(tossArr);
            System.out.println(n);
        }
        int y[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(Arrays.toString(y));
        int x = nc.getBestRun(y);
        System.out.println(x);
    }

}