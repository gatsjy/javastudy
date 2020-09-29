package collection;

public class MemberHashSetTest {

    public static void main(String[] args) {
        MemberHashSet manager = new MemberHashSet();

        Member memberLee = new Member(100, "Lee");
        Member memberkim = new Member(200, "Kim");
        Member memberpark = new Member(300, "Park");
        Member memberpark2 = new Member(300, "Park2");

        manager.addMember(memberLee);
        manager.addMember(memberkim);
        manager.addMember(memberpark);

        manager.showAllMember();

        manager.removeMember(100);

        manager.showAllMember();
    }
}
