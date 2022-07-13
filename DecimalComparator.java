public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){
     int a = (int)(1000 * firstNumber);
     int b = (int)(1000 * secondNumber);

     if (a==b){
         return true;
     }
     else {
         return false;
     }
    }
}
