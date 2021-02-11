package week04d01;

public class NameChanger {
    private String fullName;

    public NameChanger(String fullName) {
        if ( fullName == null || "".equals(fullName)) {
            throw new IllegalArgumentException("Invalid Name:" + fullName);
        }
        this.fullName = fullName.toString() ;
    }
    public String changeFirstName(String firstName) {

        String[] separateNames = fullName.split(" ");
        String familyName = separateNames[0];
        String oldFirstName = separateNames[1];
        return fullName.replace(oldFirstName, firstName);



    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return getFullName();
    }
}
