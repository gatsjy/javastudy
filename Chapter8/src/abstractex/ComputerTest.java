package abstractex;

public class ComputerTest {

    // 추상 클래스는 주로 상속의 상위클래스로 사용됨
    // 추상 메서드 : 하위클래스가 구현해야 하는 메서드
    // 구현된 메서드 : 하위 클래스가 공통으로 사용하는 기능의 메서드 하위 클래스에 따라 재정의 할 수 있음
    public static void main(String[] args) {
        Computer computer = new DeskTop();
        computer.turnOff();
        computer.display();
        computer.typing();

        NoteBook myNote = new MyNoteBook();
        myNote.typing();
    }
}
