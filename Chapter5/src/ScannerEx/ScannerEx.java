package ScannerEx;

import java.util.Scanner;

/**
 * @author Gatsjy
 * @since 2021-03-22
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("두자리 정수를 하나 입력해주세요.");
        String input = scanner.nextLine();
        int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환

        System.out.println("입력내용 : "+input);
        System.out.println("num = " + num);
    }
}
