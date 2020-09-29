package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class MemberHashSet {

    private HashSet<Member> hashset;

    public MemberHashSet(){
        hashset = new HashSet<Member>();
    }

    public void addMember(Member member){
        hashset.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<Member> ir =hashset.iterator();
        while(ir.hasNext()){
            Member member = ir.next();
            if(member.getMemberId() == memberId){
                hashset.remove(member);
                return true;
            }
        }
        System.out.println(memberId + "번호가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : hashset) {
            System.out.println(member);
        }
    }
}
