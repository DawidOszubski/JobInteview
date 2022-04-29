import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Task2 {


    private static String format(BigDecimal x, int scale) {
        NumberFormat formatter = new DecimalFormat("0.0e0");
        formatter.setRoundingMode(RoundingMode.HALF_UP);
        formatter.setMinimumFractionDigits(scale);
        return formatter.format(x);
    }



    static void run(){
         BigInteger startPoint = new BigInteger("1");
        BigInteger xTimes = new BigInteger("10");
        BigDecimal sum = new BigDecimal("0");
    while(!(xTimes.compareTo(startPoint)==0)){
       sum = countDn(startPoint.intValue()).add(sum);
       startPoint.add(BigInteger.valueOf(1));
    }
         System.out.println(format(sum,12));
    }

 private static BigDecimal countDn(int n){

     return BigDecimal.valueOf(n/findSumOfn(n));

 }
   private static int findSumOfn(int n)
    {
        return String.valueOf(n)
                .chars()
                .map(Character::getNumericValue)
                .sum();
    }

}
