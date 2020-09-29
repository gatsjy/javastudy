package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        set.add("이순신");
        set.add("김유신");
        set.add("강감찬");
        set.add("이순신");

        // 중복을 허용하지 않는다.
        System.out.println(set);

        Iterator<String> ir = set.iterator();

        while(ir.hasNext()){
            String str = ir.next();
            System.out.println(str);
        }
    }
}
