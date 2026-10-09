
public class Palindrome {
    public static void main(String[] args) {
        String word = args.length > 0 ? args[0] : "madam";
        String reversed = new StringBuilder(word).reverse().toString();

        if (word.equalsIgnoreCase(reversed)) {
            System.out.println(word + " is palindrome");
        } else {
            System.out.println(word + " is not palindrome");
        }
    }
}
