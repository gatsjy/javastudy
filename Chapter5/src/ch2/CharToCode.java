package ch2;

/**
 * @author Gatsjy
 * @since 2021-03-23
 * realize dreams myself
 * Blog : https://blog.naver.com/gkswndks123
 * Github : https://github.com/gatsjy
 */
public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A';
        int code = (int)ch;

        System.out.printf("%c=%d(%#X)%n",ch,code,code);

        char hch = '가';
        System.out.printf("%c=%d(%#X)%n",hch,(int)hch,(int)hch);
    }
}
