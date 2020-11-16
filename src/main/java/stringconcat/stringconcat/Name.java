package stringconcat.stringconcat;

public class Name {
    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this(familyName, middleName, givenName);
        this.title = title;
    }
    public boolean isEmpty(String s) {
        return s == null || s.isEmpty();
    }
    public Name(String familyName, String middleName, String givenName) {
        if (isEmpty(familyName) || isEmpty(givenName)) {
            throw new IllegalArgumentException("Family name and given name must not be empty!");
        }
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
    }
    public String concatNameWesternStyle() {

        String fullName;

        if(title != null) {
            fullName = title.getTitle();
            fullName = fullName.concat(givenName);

        } else {
            fullName = givenName;
        }
        fullName = fullName.concat(" ");
        if ( middleName != null && " ".equals(middleName)) {
            fullName = fullName.concat(middleName);
            fullName = fullName.concat(" ");
        }
        fullName = fullName.concat(familyName);
        return fullName;
    }

    public String concatNameHungarianStyle() {

        String fullName;

        if (title != null) {
            fullName = title.getTitle();
            fullName += familyName;
        } else {
            fullName += familyName;
        }
        fullName += " ";
        if(middleName != null && !" ".equals(middleName)) {
            fullName += middleName;
            fullName += " ";
        }
        fullName += givenName;
        return fullName;
    }
}
