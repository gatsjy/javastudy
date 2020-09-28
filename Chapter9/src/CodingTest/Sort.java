package CodingTest;

public interface Sort {

    void ascending();
    void descending();
    default void descrition(){
        System.out.println("숫자를 정렬하는 알고리즘입니다.");
    };
}
