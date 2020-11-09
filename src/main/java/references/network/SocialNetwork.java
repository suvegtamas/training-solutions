package references.network;

import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {
    List<Member> allMembers = new ArrayList<>();

    public void addMember(String name) {
        Member member = new Member(name);

        allMembers.add(member);

    }

    public void connect(String name, String otherName) {
      Member first = findByName(name);
      Member second = findByName(otherName);
      first.connectMember(second);
    }
    public Member findByName(String name) {
        for(Member member : allMembers) {
            if (member.getName().equals(name)) {
                return member;
            }
        }
        return null;
    }
    public List<String> bidirectionalConnections() {
        List<String> connections = new ArrayList<>();
        for (Member item : allMembers) {
            for (Member connectedMember : item.getConnections()) {
                if (connectedMember.getConnections().contains(item)) {
                    connections.add(item.getName() + " " + connectedMember.getName());
                }
            }
        }
        return connections;
    }
    @Override
    public String toString() {
        return allMembers.toString();
    }
}
