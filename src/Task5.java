import java.math.BigDecimal;
import java.util.Stack;

public class Task5 {
    static private  BigDecimal Ackermann(int m, int n){

        if(m ==0) {
            return BigDecimal.valueOf((n + 1));
        }
        else if( m >0 && n==0){
            return  Ackermann(m-1,1);
        }
        else if(m>0 && n>0){
            return Ackermann(m-1,(Ackermann(m,n-1)).intValue());
        }
        else return BigDecimal.valueOf(0);
    }

    static BigDecimal getSum() {
        int m = 0, n = 0;
        BigDecimal sum = new BigDecimal(0);
        for (int i = 0; i <= 6; i++) {
            sum = Ackermann(m, n).add(sum);
            m++;
            n++;
        }
            return sum.remainder(BigDecimal.valueOf(Math.pow(14, 8)));
        }

/*
    public static BigDecimal Ackermann(BigDecimal m, BigDecimal n){
        Stack<BigDecimal> s = new Stack<BigDecimal>();
        s.add(m);
        while(!s.isEmpty()){
            m=s.pop();
            if(m.compareTo(BigDecimal.ZERO)==0) { n =m.add(BigDecimal.valueOf(1)).add(n); }
            else if(n.compareTo(BigDecimal.ZERO)==0)
            {
                n = n.add(BigDecimal.valueOf(1).add(n));
                s.add(m.subtract(BigDecimal.valueOf(1)));
            }
            else{
                s.add(m.subtract(BigDecimal.valueOf(1)));
                s.add(m.add(BigDecimal.valueOf(1)));
                n.subtract(BigDecimal.valueOf(1));
            }
        }
        return n;
    }*/
}
