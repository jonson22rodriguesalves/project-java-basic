package figuras;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

class AreaQuadrado {

    public static void main(String[] args) {
        // Método principal (ponto de entrada do programa)
        double lado = obterLadoDoQuadrado(); // Chama o método para obter o lado
        double area = calcularArea(lado); // Calcula a área com o lado fornecido
        imprimirResultado(area); // Exibe o resultado no console
    }

    /**
     * Solicita e retorna o valor do lado do quadrado digitado pelo usuário.
     *
     * @return Valor do lado (double) inserido pelo usuário.
     */
    public static double obterLadoDoQuadrado() {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para ler a entrada
        System.out.print("Digite o lado do quadrado: "); // Solicita a entrada do usuário
        double lado = scanner.nextDouble(); // Lê o valor digitado como double
        scanner.close(); // Fecha o scanner para evitar vazamento de recursos
        return lado; // Retorna o valor do lado
    }

    /**
     * Calcula a área de um quadrado com base no lado fornecido.
     * Fórmula: área = lado * lado
     *
     * @param lado Medida do lado do quadrado.
     * @return Área calculada (double).
     */
    public static double calcularArea(double lado) {
        return lado * lado; // Retorna o resultado da multiplicação (área)
    }

    /**
     * Exibe o resultado da área no console.
     *
     * @param area Valor da área a ser impresso.
     */
    public static void imprimirResultado(double area) {
        System.out.println("A área do quadrado é: " + area); // Formata e imprime o resultado
    }
}