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

}
