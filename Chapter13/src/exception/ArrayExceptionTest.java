package exception;

public class ArrayExceptionTest {

    public static void main(String[] args) {

        int[] arr = new int[5];

        try {
            // 배열이 하나 부족하기 때문에 ArrayIndexOutOfBoundsException 이 떨어진다.
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("예외처리");
        }
        System.out.println("프로그램 종료");
    }
}
