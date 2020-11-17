package stringbuilder;

public class NameBuilder {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;


    public boolean isEmpty(String s) {
        return s == null || "".equals(s.trim());
    }

    public String concatNameWesternStyle(String familyName, String middleName, String givenName, Title title) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        StringBuilder name = new StringBuilder("");

        if( title != null) {
            name.append(title.getTitleType()).append(" ").append(givenName);
        } else {
            name.append(givenName);
        }
        name.append(" ");
        if (middleName != null && !"".equals(middleName)) {
            name.append(middleName).append(" ");

        }
        name.append(familyName);
        return name.toString();

    }
    public String concatNameHungarianStyle(String familyName, String middleName, String givenName, Title title) {
        if ( isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");

        }
        StringBuilder name = new StringBuilder("");

        if (title != null) {
            name.append(title.getTitleType()).append(" ").append(familyName);
        } else {
            name.append(familyName);
        }
        name.append(" ");
        if(middleName != null && !"".equals(middleName)) {
            name.append(middleName).append(" ");
        }
        name.append(givenName);
        return name.toString();
    }

    public String insertTitle(String name, Title title, String where) {
        StringBuilder ins = new StringBuilder(name);
        int index = ins.indexOf(where);
        ins.insert(index + 1, (title.getTitleType() + " "));
        return ins.toString();
    }
    public String deleteNamePart(String name, String delete) {

        StringBuilder del = new StringBuilder(name);
        int index = name.indexOf(delete);
        del.delete(index, index + delete.length());
        return del.toString();


    }


}
