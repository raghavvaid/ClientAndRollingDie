/* A statistician is studying sequences of numbers obtained by repeatedly tossing a 6-sided die.
The statistician is particularly interested in runs of numbers.  A run occurs when 2 or more
consecutive tosses of the die produce the same value.  For example, in the following sequence of
die rolls, there are runs starting at positions 1,6,12,and 14.

Index:	0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15 16 17
Result: 1  5  5  4  3  1  2  2  2  6  1  3  3  5  5  5  5  5

The die is represented by the following class:
*/

public class RollingDie {

    public int toss()
    {
        return (int)(6 * Math.random()) + 1;
    }


    public int[] getRolls(int numTosses) {
        int[] tossA = new int[numTosses];
        for (int i = 0; i < numTosses; i++) {
            tossA[i] = toss();
        }
        return tossA;
    }

	/*Write the method getBestRun that takes as its parameter a array of integer values
	representing a series of die tosses.  The method returns the starting index in the array
	of a run of maximum size.  A run is defined as the repeated occurrence of the same value
	in 2 or more consecutive positions in the array.  If there are 2 runs of the same size
	it may return either index.  If there are no runs, the method returns -1.
	Precondition:  values.length > 0
	*/

    public int getBestRun(int[] values) {
        int currentRun = 0;
        int bestRun = 0;
        int currentCount = 0;
        int bestCount = 0;

        return 0;
    }


    public static void main(String[] args) {
        RollingDie nc = new RollingDie();

        for (int p = 0; p < 10; p++) {
            int[] tossArr = nc.getRolls(20);
            for (int i = 0; i < 20; i++)
                System.out.print(tossArr[i] + ",");
            System.out.println();

            int x = nc.getBestRun(tossArr);
            System.out.println(x);
        }
    }

}