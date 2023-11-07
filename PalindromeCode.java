import java.util.*;

class PalindromeCode {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the new sentence to check the palindrome word");
        String sentence = in.nextLine();
        String word = "", new_word = "";
        sentence = sentence + ' ';

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                for (int j = word.length() - 1; j >= 0; j--) {
                    new_word += word.charAt(i);
                }
                if (new_word == word) {
                    System.out.println(word + " is a palindrome word");
                }
                word = "";
                new_word = "";
            }
        }
    }

}