package covid;

public class Validators {


    public boolean isNameEmpty(String name) {
        return name.isBlank() || name == null;
    }

    public  boolean isZipCodeEmpty(String zip) {
        return zip.isBlank() || zip == null;
    }

    public boolean isAgeCorrect(int age) {
        return age > 10 && age < 150;
    }

    public  boolean validateEmailAddress(String email) {
        return email.length() >= 3 || email.contains("@");
    }

    public  boolean validateTaj(String taj) {
        int sum = 0;
        for(int i =1; i <= 8; i++) {
            int cursor = taj.charAt(i - 1) - '0';
            if(i  % 2 == 0) {
                sum+= cursor * 7;
            } else {
                sum+= cursor * 3;
            }
        }
        int lastDigit = taj.charAt(8) - '0';
        return sum % 10 == lastDigit;
    }
    public boolean checkAllDataInputs(Citizen citizen) {
        return !isNameEmpty(citizen.getName())
                && !isZipCodeEmpty(citizen.getZipCode())
                && isAgeCorrect(citizen.getAge())
                && validateEmailAddress(citizen.getEmail())
                && validateTaj(citizen.getTaj());
    }

}
