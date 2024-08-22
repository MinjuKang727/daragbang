 package camp.sparta.generic;

 import java.util.ArrayList;
 import java.util.List;

 public class Step4 {
     public static void main(String[] args) {

         //////////////// 읽어 봅시다 //////////////////////////
         /*
           읽기
           - Number 읽을 수 있습니다.
           - Integer 읽을 수 없습니다. num2가 List<Double> 을 가리킬 수 있습니다.
           - Double 읽을 수 없습니다. num3가 List<Integer> 을 가리킬 수 있습니다.
           쓰기
           - Integer 추가할 수 없습니다. num1,2,3 이 List<Double> 을 가리킬 수 있습니다.
           - Double 추가할 수 없습니다. num1,2,3 이 List<Integer> 을 가리킬 수 있습니다.
           - Number 추가할 수 없습니다. num1,2,3 이 List<Integer> 을 가리킬 수 있습니다.

           - List<? extends T> 에는 어떤 값도 추가할 수 없습니다. 왜냐면 실제로 어떤 종류의 리스트를
           가리키고 있는지 보장할 수 없기 때문 입니다.
          */
         List<? extends Number> num1 = new ArrayList<Number>();
         List<? extends Number> num2 = new ArrayList<Integer>();
         List<? extends Number> num3 = new ArrayList<Double>();

         /*
           읽기
           - Integer 를 보장할 수 없습니다. num4 는 List<Number> 또는 List<Object> 를 가리킬 수 있습니다.
           - Number 를 보장할 수 없습니다. num5 가 List<Object> 를 가리킬 수 있습니다.

           쓰기
           - Integer 를 추가할 수 있습니다.
           - Double 추가할 수 없습니다. ArrayList<Integer> 를 가리킬 수 있습니다.
           - 같은 이유로 Number, Object 역시 추가할 수 없습니다.
          */
         List<? super Integer> num4 = new ArrayList<Integer>();
         List<? super Integer> num5 = new ArrayList<Number>();
         List<? super Integer> num6 = new ArrayList<Object>();

         ///////////////////////////////////////////////////////////

         List<Ramen> checkList = new ArrayList<>();
         List<CupRamen> ramenList = new ArrayList<>();
         ramenList.add(new Wangdduggung("왕뚜껑", 1000, "컵", "큰뚜껑"));
         ramenList.add(new Yukgaejang("육개방사발면", 1000, "컵"));

         Warehouse<Ramen> warehouse = new Warehouse<>();
         warehouse.store(checkList, ramenList);

         for (Ramen e : checkList) {
             System.out.println(e);
         }

     }
 }

 class Warehouse<T> {

     void store(List<T> checkList, List<? extends T> storeList) {
         for (T each : storeList) {
             checkList.add(each);
         }
     }

 }


 class Ramen {
     String name;
     int price;

     Ramen(String name, int price) {
         this.name = name;
         this.price = price;
     }

 }

 class CupRamen extends Ramen {
     String cup;

     CupRamen(String name, int price, String cup) {
         super(name, price);
         this.cup = cup;
     }

     public String toString() {
         return String.format("이름 : %s, 가격 : %d, 컵 : %s", name, price, cup);
     }
 }

 class BagRamen extends Ramen {
     String bag;

     BagRamen(String name, int price, String bag) {
         super(name, price);
         this.bag = bag;
     }

     public String toString() {
         return String.format("이름 : %s, 가격 : %d, 포장지 : %s", name, price, bag);
     }
 }

 class Wangdduggung extends CupRamen {

     String lid;

     Wangdduggung(String name, int price, String cup, String lid) {
         super(name, price, cup);
     }
 }

 class Yukgaejang extends CupRamen {

     Yukgaejang(String name, int price, String cup) {
         super(name, price, cup);
     }
 }

 class ShinRamen extends BagRamen {

     ShinRamen(String name, int price, String bag) {
         super(name, price, bag);
     }
 }

 class JinRamen extends BagRamen {

     JinRamen(String name, int price, String bag) {
         super(name, price, bag);
     }
 }