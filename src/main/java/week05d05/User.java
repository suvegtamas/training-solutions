package week05d05;

public class User {
    private String firstName;
    private String lastName;
    private String email;

    public User(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        isValidEmail(email);
        this.email = email;
    }

    public String getFullName1() {
        return firstName + " " + lastName;
    }

    public String getFullName2() {
        StringBuilder sb = new StringBuilder();
        sb.append(firstName);
        sb.append(" ");
        sb.append(lastName);
        return sb.toString();
    }

    public String getFullName3() {
        String fullName = firstName.concat(" ").concat(lastName);
        return fullName;
    }

    public void isValidEmail(String email) {
        if(!email.contains("@") || !email.contains(("."))) {
            throw new IllegalArgumentException("Invalid email.");
        }
    }


}
