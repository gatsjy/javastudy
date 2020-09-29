package treeset;

import collection.Member;

import java.util.HashSet;
import java.util.Iterator;

public class MemberTreeSet {

    private HashSet<collection.Member> hashset;

    public MemberTreeSet(){
        hashset = new HashSet<collection.Member>();
    }

    public void addMember(collection.Member member){
        hashset.add(member);
    }

    public boolean removeMember(int memberId){
        Iterator<collection.Member> ir =hashset.iterator();
        while(ir.hasNext()){
            collection.Member member = ir.next();
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
