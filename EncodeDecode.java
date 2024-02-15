import java.util.*;

public class EncodeDecode {
    // Encodes a list of strings to a single string.
    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();
        for (String str : strs) {
            encoded.append(str.length()).append('/').append(str);
        }
        return encoded.toString();
    }

    // Decodes a single string to a list of strings.
    public List<String> decode(String s) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while (i < s.length()) {
            int delimiterIndex = s.indexOf('/', i);
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            i = delimiterIndex + 1;
            decoded.add(s.substring(i, i + length));
            i += length;
        }
        return decoded;
    }

    public static void main(String[] args) {
        EncodeDecode codec = new EncodeDecode();
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.println("Enter the number of strings:");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline character
        List<String> input = new ArrayList<>();
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            input.add(scanner.nextLine());
        }

        // Encoding
        String encoded = codec.encode(input);
        System.out.println("Encoded String: " + encoded);

        // Decoding
        List<String> decoded = codec.decode(encoded);
        System.out.println("Decoded Strings:");
        for (String str : decoded) {
            System.out.println(str);
        }
    }
}
