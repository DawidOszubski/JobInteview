public class Task8 {



     static void firstNumberWith500Divisors() {
        long number =1, i=2;
        int divisors =0;
        boolean isDone = false;
        while(!isDone){
           divisors= countDivisors(number);
           if(divisors>=500){
               isDone=true;
           }else
           {
               number+=i;
               i++;
           }
        }
         System.out.println("Task8 = "+number);
    }

    static int countDivisors(long number){
        int divisors =0;
        for(int i=1; i<=Math.sqrt(number);i++){ //we're checking only half of the number because divisors comes with pairs
            if(number%i==0){
                if(number/i==i) divisors++;
                else divisors+=2;
            }
        }
        return divisors;
    }
}
