package stringbuilder;

public class Palindrome {
    public boolean isPalindrome(String word) {
        if (word == null) {
            throw new IllegalArgumentException("Text must not be null!");
        }
        word = word.trim();

        StringBuilder isPal = new StringBuilder(word);
        return word.equalsIgnoreCase(isPal.reverse().toString());
    }
}
