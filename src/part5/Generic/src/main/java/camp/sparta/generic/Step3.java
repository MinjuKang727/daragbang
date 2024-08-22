 package camp.sparta.generic;

 import java.util.Arrays;
 import java.util.Collection;
 import java.util.List;

 public class Step3 {

     public static void main(String[] args) {
         List<Integer> list = Arrays.asList(1,2,3);
         Common common = new Common();
         common.print(list);

         List<Double> list2 = Arrays.asList(1.0, 2.0, 3.0);
         common.print(list2);
     }
 }

 class Common {
     void print(Collection<? extends Number> c) {
         for (Number e : c) {
             System.out.println(e);
         }
     }
 }
