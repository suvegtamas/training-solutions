package stringtype.registration;

public class UserValidator {
    private String username;
    private String email;
    private String password1;
    private String password2;

    public boolean isValidUsername(String username) {
        return !"".equals(username);
    }
    public boolean isValidPassword(String password1, String password2) {
        return password1.length() >= 8 || password1.equals(password2);
    }
    public boolean isValidEmail(String email) {
        int kukac = email.indexOf("@");
        String domain = email.substring(kukac + 1);
        int dot = domain.indexOf(".");
        return kukac > 0 && dot > 0 && dot < domain.length() - 1;

    }
}
