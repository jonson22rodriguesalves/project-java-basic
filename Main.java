import java.time.OffsetDateTime; // Importa a classe para obter o ano atual com fuso horário
import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

public class Main {

    /**
     * Método principal (ponto de entrada do programa).
     * Calcula a idade do usuário com base no ano de nascimento e imprime uma saudação.
     *
     * @param args Argumentos da linha de comando (não utilizado neste exemplo).
     */
    public static void main(String[] args) {

        // Obtém o ano atual usando OffsetDateTime (considera fuso horário)
        var baseYear = OffsetDateTime.now().getYear();

        // Cria um objeto Scanner para ler entradas do usuário
        var scanner = new Scanner(System.in);

        // Solicita e armazena o nome do usuário
        System.out.println("informe seu nome:");
        var name = scanner.next();

        // Solicita e armazena o ano de nascimento do usuário
        System.out.println("informe o ano de nascimento:");
        var year = scanner.nextInt();

        // Calcula a idade subtraindo o ano de nascimento do ano atual
        var age = baseYear - year;

        // Exibe a mensagem formatada com nome e idade
        System.out.printf("Olá %s você tem %s anos \n", name, age);

    }
}
