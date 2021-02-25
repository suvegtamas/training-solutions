package exam03gyakorlat;

public class CdvCheck {

    public boolean check(String s) {
        if (s.length() != 10 || !isNumber(s)) {
            throw new IllegalArgumentException("Not a tax number");
        }
        int sum = 0;
        for (int i = 0; i <  9; i++) {
            try {
                Integer.parseInt(Character.toString(s.charAt(i)));
            } catch (NumberFormatException nfe) {
                throw new IllegalArgumentException("Not ...");
            }
            int digit = s.charAt(i) - '0';

            sum += digit * (i + 1);
        }
        int lastDigit = s.charAt(9) - '0';
        System.out.println(s.charAt(9) - '0');

        return sum % 11 == lastDigit;
    }

    private boolean isNumber(String s) {
        try {
            Long.parseLong(s);
            return true;
        } catch(NumberFormatException nfe) {
            return false;
        }
    }

    public static void main(String[] args) {
        CdvCheck cdvCheck = new CdvCheck();
        cdvCheck.check("8365670003");

    }
}
