import java.util.Arrays;

public class Task4 {
    static public String run() {
        for (int i = 1; ; i++) {
            if (i > Integer.MAX_VALUE / 6) //dividing by 6 because it's our max value in the task
                throw new ArithmeticException("Overflow");
            if (multiplesHaveSameDigits(i))
                return Integer.toString(i);
        }
    }


    private static boolean multiplesHaveSameDigits(int x) { //comparing number iwht its new values x2,x3.. till x6
        for (int i = 2; i <= 6; i++) {
            if (!Arrays.equals(toSortedDigits(x), toSortedDigits(i * x)))
                return false;
        }
        return true;
    }


    private static char[] toSortedDigits(int x) { //inserting numbers into arrays and sroting them so we can easily check for similarities
        char[] result = Integer.toString(x).toCharArray();
        Arrays.sort(result);
        return result;
    }


}
