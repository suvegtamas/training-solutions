package lambdaintro;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class SocialNetwork {
    private List<Member> members;

    public SocialNetwork(List<Member> members) {
        this.members = members;
    }
    public List<Member> findMembersBy(Predicate<Member> member) {
        List<Member> result = new ArrayList<>();
        for(Member m : members) {
            if(member.test(m)) {
                result.add(m);
            }
        }
        return result;
    }
   public void applyToSelectedMembers(Predicate<Member> predicate, Consumer<Member> consumer) {
        for(Member m : members) {
            if(predicate.test(m)) {
                consumer.accept(m);
            }
        }
    }
    public List<String> transformMembers(Function<Member,String> function) {
        List<String> result = new ArrayList<>();
        for(Member m : members) {
            result.add(function.apply(m));
        }
        return result;
    }
}
