package treeset;

import collection.Member;

public class MemberTreeSetTest {

    public static void main(String[] args) {
        MemberTreeSet manager = new MemberTreeSet();

        collection.Member memberLee = new collection.Member(100, "Lee");
        collection.Member memberkim = new collection.Member(200, "Kim");
        collection.Member memberpark = new collection.Member(300, "Park");
        collection.Member memberpark2 = new Member(300, "Park2");

        manager.addMember(memberLee);
        manager.addMember(memberkim);
        manager.addMember(memberpark);

        manager.showAllMember();

        manager.removeMember(100);

        manager.showAllMember();
    }
}
