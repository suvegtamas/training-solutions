package exam03gyakorlat;

import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail) {
       mails.add(mail);
    }

    public List<Mail> getMails() {
        return mails;
    }

    public List<Mail> findByCriteria(String s) {
        List<Mail> result = new ArrayList<>();
        for(Mail m : mails) {
            byPrefixFromAndNameOrEmail(s, result, m);
            byPrefixToAndName(s, result, m);
        }
        return result;
    }

    private void byPrefixToAndName(String s, List<Mail> result, Mail m) {
        for(Contact c : m.getTo()) {
            if (s.contains("to") && s.contains(c.getName())) {
                result.add(m);
            }
        }
    }

    private void byPrefixFromAndNameOrEmail(String s, List<Mail> result, Mail m) {
        if(s.contains("from") && s.contains(m.getFrom().getEmail()) || s.contains(m.getFrom().getEmail())) {
            result.add(m);
        } else {
            bySubjectAndMessage(s,result,m);
        }
    }

    private void bySubjectAndMessage(String s, List<Mail> result, Mail m) {
        if(m.getSubject().contains(s) || m.getMessage().contains(s)) {
            result.add(m);
        }
    }
}
