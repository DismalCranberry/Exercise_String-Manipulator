import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("End")) {
                break;
            }

            if (command.startsWith("Translate")) {
                String[] parts = command.split(" ");
                char oldChar = parts[1].charAt(0);
                String replacement = parts[2];
                str = str.replace(oldChar, replacement.charAt(0));
                System.out.println(str);

            } else if (command.startsWith("Includes")) {
                String[] parts = command.split(" ");
                String substring = parts[1];
                boolean includes = str.contains(substring);
                if (includes) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.startsWith("Start")) {
                String[] parts = command.split(" ");
                String substring = parts[1];
                boolean startsWith = str.startsWith(substring);
                if (startsWith) {
                    System.out.println("True");
                } else {
                    System.out.println("False");
                }

            } else if (command.equals("Lowercase")) {
                str = str.toLowerCase();
                System.out.println(str);

            } else if (command.startsWith("FindIndex")) {
                String[] parts = command.split(" ");
                char searchChar = parts[1].charAt(0);
                int index = str.lastIndexOf(searchChar);
                System.out.println(index);

            } else if (command.startsWith("Remove")) {
                String[] parts = command.split(" ");
                int startIndex = Integer.parseInt(parts[1]);
                int count = Integer.parseInt(parts[2]);
                str = new StringBuilder(str).delete(startIndex, startIndex + count).toString();
                System.out.println(str);
            }
        }

        scanner.close();
    }
}
