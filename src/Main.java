import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Бир кунду англис тилинде жазыныз: ");
        String str = scanner.nextLine().toUpperCase();

        try {
            Days day = Days.valueOf(str);
            System.out.println(day);
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR: Кунду туура эмес жаздыныз");
        }

    }
}