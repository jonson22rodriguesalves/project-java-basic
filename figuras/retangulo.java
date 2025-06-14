package figuras;

import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

class AreaRetangulo {

    /**
     * Método principal (ponto de entrada do programa).
     * Solicita base e altura, calcula a área do retângulo e exibe o resultado.
     */
    public static void main(String[] args) {
        double base = obterMedida("Digite a base do retângulo: "); // Obtém a base
        double altura = obterMedida("Digite a altura do retângulo: "); // Obtém a altura
        double area = calcularArea(base, altura); // Calcula a área
        imprimirResultado(base, altura, area); // Exibe o resultado
    }

    /**
     * Solicita e retorna uma medida (base ou altura) digitada pelo usuário.
     *
     * @param mensagem Instrução exibida para o usuário (ex: "Digite a base...").
     * @return Valor double da medida inserida.
     */
    public static double obterMedida(String mensagem) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(mensagem); // Exibe a mensagem personalizada
        double medida = scanner.nextDouble(); // Lê o valor digitado
        return medida;
        // O scanner não é fechado aqui para evitar erro ao reutilizá-lo no mesmo programa
    }

    /**
     * Calcula a área de um retângulo usando a fórmula: área = base * altura.
     *
     * @param base Medida da base do retângulo.
     * @param altura Medida da altura do retângulo.
     * @return Área calculada (double).
     */
    public static double calcularArea(double base, double altura) {
        return base * altura; // Aplicação direta da fórmula
    }

    /**
     * Exibe o resultado formatado no console.
     *
     * @param base Base usada no cálculo.
     * @param altura Altura usada no cálculo.
     * @param area Área calculada.
     */
    public static void imprimirResultado(double base, double altura, double area) {
        //System.out.printf("\nResultado: Retângulo de base %.2f e altura %.2f tem área = %.2f", base, altura, area);
        System.out.printf("\nResultado: Retângulo de base %.2f e altura %.2f tem área = %.2f metros quadrados",
                base, altura, area);
    }
}