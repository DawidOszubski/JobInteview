public class Task6 {

   static void sum() {
        int sum=0;
        for (int i = 0; i < 1000; i++) {
                if(i%3==0 || i%5==0){
                    sum+=i;
                }
        }
        System.out.println("Task6 = "+sum);
    }
}
