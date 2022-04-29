public class Task9 {

 static void checkForLychrelNumber(){ //counting how many lychrel number is in first 100000
     long num=10;
     int count =0;
        while(num<10000){
            if(isLychrel(num)){
                count++;
            }
            else {
                num++;
            }
        }
     System.out.println("Task9 = "+ count);
 }

 private static long reverse(long num){ //reversing our number
     long reverseNum=0;
     while( num != 0 )
     {
         reverseNum = reverseNum * 10;
         reverseNum = reverseNum + num%10;
         num = num/10;
     }
     return reverseNum;
 }
 private static boolean isPalindromic(long num){ //checking if our nubmer is palindormic
     return num==reverse(num);
 }

 private static boolean isLychrel(long num){ //we iterate 50 times throw our and check if it is a Lychrel number
     for(int i=0;i<=50;i++){
         num += reverse(num);
         if(isPalindromic(num)){
             return false;
         }
     }
     return true;
 }
}
