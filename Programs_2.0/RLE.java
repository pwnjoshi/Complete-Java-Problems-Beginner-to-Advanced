import java.util.Scanner;

public class RLE {

    public static String compress(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuffer result = new StringBuffer();
        int count = 1;

        for (int i = 1; i <= input.length(); i++) {
            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                result.append(input.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }

        return result.toString();
    }

    public static String decompress(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuffer result = new StringBuffer();
        int i = 0;

        while (i < input.length()) {
            char ch = input.charAt(i);

            if (ch < 'A' || ch > 'Z') {
                throw new IllegalArgumentException("Invalid format: expected letter at position " + i);
            }

            i++;

            if (i >= input.length() || !Character.isDigit(input.charAt(i))) {
                throw new IllegalArgumentException("Invalid format: expected count after letter at position " + (i - 1));
            }

            int count = 0;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }

            for (int k = 0; k < count; k++) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input;
        if (args.length > 0) {
            input = args[0];
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter uppercase string (A-Z): ");
            input = sc.nextLine();
        }

        String compressed = compress(input);
        System.out.println("Compressed: " + compressed);

        try {
            String decompressed = decompress(compressed);
            System.out.println("Decompressed: " + decompressed);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}