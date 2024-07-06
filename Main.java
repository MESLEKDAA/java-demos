import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // takes a String and replaces the letter 'a' with a star and returns again.

        System.out.println(aToStar("merhaba"));
        System.out.println(faToStar("merhaba"));

    }

    public static String aToStar(String message) {

        char[] arr = message.toCharArray();

        for (int i = 0; i < message.length(); i++) {
            if (arr[i] == 'a')
                arr[i] = '*';
        }

        String str = "";

        for (int i = 0; i < arr.length; i++) {
            str += arr[i];
        }

        return str;

    }

    public static String faToStar(String message) {
        return message.chars()  // Stream of int representing character codes
                .mapToObj(c -> (char) c)  // Convert int to Character
                .map(c -> c == 'a' ? '*' : c)  // Replace 'a' with '*'
                .map(String::valueOf)  // Convert Character to String
                .collect(Collectors.joining());  // Join all parts into a single String
    }

}