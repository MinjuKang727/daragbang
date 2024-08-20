package camp.sparta.exception;

public class Step4 {
    public static void main(String[] args) {

        int index = 4;
        try {
            Step4 step4 = new Step4();
            System.out.println("결과 : " + step4.getElement(index));
        } catch (IncorrectIndexException e) {
            System.out.println(e.getMessage());
        }

    }

    public int getElement(int index) throws IncorrectIndexException {
        int[] list = {1, 2, 3};

        try {
            int n = list[index];
            return n;
        } catch (IndexOutOfBoundsException e) {
            throw new IncorrectIndexException(index, list.length);
        }
    }
}


