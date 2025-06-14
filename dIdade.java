import java.util.Scanner; // Importa a classe Scanner para leitura de entrada do usuário

class CalculadoraDiferencaIdades {

    public static void main(String[] args) {
        // Método principal (ponto de entrada do programa)
        String nome1 = obterNome(1); // Obtém o nome da primeira pessoa
        int idade1 = obterIdade(nome1); // Obtém a idade da primeira pessoa

        String nome2 = obterNome(2); // Obtém o nome da segunda pessoa
        int idade2 = obterIdade(nome2); // Obtém a idade da segunda pessoa

        int diferenca = calcularDiferencaIdades(idade1, idade2); // Calcula a diferença
        imprimirResultado(nome1, idade1, nome2, idade2, diferenca); // Exibe o resultado
    }

    /**
     * Solicita e retorna o nome da pessoa.
     *
     * @param numeroPessoa Número da pessoa (1 ou 2) para personalizar a mensagem.
     * @return Nome da pessoa (String).
     */
    public static String obterNome(int numeroPessoa) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome da " + numeroPessoa + "ª pessoa: ");
        String nome = scanner.nextLine();
        return nome;
    }

    /**
     * Solicita e retorna a idade da pessoa.
     *
     * @param nome Nome da pessoa para personalizar a mensagem.
     * @return Idade (int).
     */
    public static int obterIdade(String nome) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade de " + nome + ": ");
        int idade = scanner.nextInt();
        return idade;
    }

    /**
     * Calcula a diferença entre as idades (valor absoluto).
     *
     * @param idade1 Idade da primeira pessoa.
     * @param idade2 Idade da segunda pessoa.
     * @return Diferença positiva entre as idades (int).
     */
    public static int calcularDiferencaIdades(int idade1, int idade2) {
        return Math.abs(idade1 - idade2); // Math.abs garante valor positivo
    }

    /**
     * Exibe o resultado formatado no console.
     *
     * @param nome1 Nome da primeira pessoa.
     * @param idade1 Idade da primeira pessoa.
     * @param nome2 Nome da segunda pessoa.
     * @param idade2 Idade da segunda pessoa.
     * @param diferenca Diferença calculada entre as idades.
     */
    public static void imprimirResultado(String nome1, int idade1, String nome2, int idade2, int diferenca) {
        System.out.printf("\n%s tem %d anos e %s tem %d anos. Diferença de idades: %d anos.",
                nome1, idade1, nome2, idade2, diferenca);
    }
}