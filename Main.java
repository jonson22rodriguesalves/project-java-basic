import java.time.OffsetDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);

        System.out.println("informe seu nome:");
            var name = scanner.next();

        System.out.println("informe o ano de nascimento:");
            var year = scanner.nextInt();
            var age = baseYear - year;

        System.out.printf("Olá %s você tem %s anos \n", name, age);

    }
}
