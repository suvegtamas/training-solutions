package week03d04;

import week03d02.Phone;

public class PhoneParser {

    public Phone parsePhone(String phoneNum) {
        String prefix = phoneNum.substring(0, 2);
        String number = phoneNum.substring(3);
        Phone phone = new Phone(prefix, number);
        return phone;


    }

    public static void main(String[] args) {
        PhoneParser parser = new PhoneParser();
        Phone phone = parser.parsePhone("12-1234567");
        System.out.println(phone.getPrefix());
        System.out.println(phone.getNumber());
        System.out.println(phone);
    }
}
