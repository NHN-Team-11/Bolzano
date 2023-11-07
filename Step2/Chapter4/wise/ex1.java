package exercise4;

public class ex1 {

    public static void printCapitalized(String input) {
        String[] words = input.split(" ");

        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.printf(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");
            }
        }
    }

    public static void main(String[] args) {
        printCapitalized("Now is the time to act!");
    }
}
