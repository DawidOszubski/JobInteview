public class Task1 {
   private static int sumOfTheSquares(int firstNumber, int lastNumber) {
        int sum = 0;
        if(firstNumber>0 && (lastNumber>firstNumber)) {
            for (int i = firstNumber; i <= lastNumber; i++) {
                sum += Math.pow(i, 2);
            }
        }else return 0;
        return sum;
    }

   private static int squareOfTheSum(int firstNumber, int lastNumber) {
        int sum = 0;
        if(firstNumber>0 && (lastNumber>firstNumber)) {
            for (int i = firstNumber; i <= lastNumber; i++) {
                sum += i;
            }
        }
        else return  0;
        return (int) Math.pow(sum, 2);
    }

    static void getDifference(int firstNumber, int lastNumber){
        System.out.print("Task1 = ");
        System.out.println(Task1.squareOfTheSum(firstNumber,lastNumber)-Task1.sumOfTheSquares(firstNumber,lastNumber));
    }
}