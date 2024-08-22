 package camp.sparta.generic;

 public class Step2 {

     public static void main(String[] args) {
         NotBoundGeneric<Double> ex = new NotBoundGeneric<>();
         ex.sum(1.0);
         ex.sum(2.0);
         ex.sum(3.0);

     }
 }

 class NotBoundGeneric<T extends Number> {
     double sum;

     public double sum(T e) {
         sum = sum + (Double) e;

         System.out.println("합한 값 : " + sum);
         return sum;
     }

 }

