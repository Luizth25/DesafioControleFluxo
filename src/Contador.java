import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primero parâmetro");
        int primeiroParametro = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = terminal.nextInt();

        // Ele tenta chamar o contador passando os parâmetros que foram digitados
        try {
            // Se os parâmetro estiverem certo ele chama o método contador passando os
            // parâmetros
            contar(primeiroParametro, segundoParametro);
        }
        // Se ele não conseguir chamar o método ele pega a exception que foi disparada
        catch (ParametrosInvalidosException e) {
            // Mensagem caso a exception seja disparada
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }

    // Método com a logica da contagem.
    static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        // If que verifica se o primeiroParametro é maior que o segundoParametro
        if (primeiroParametro > segundoParametro) {
            // Se o primeiroParametro for maior que o SegundoParametro ele dispara a
            // exception
            throw new ParametrosInvalidosException();
        }
        // Faz a subtração dos parâmetros digitados
        int contagem = segundoParametro - primeiroParametro;

        for (int indice = 1; indice <= contagem; indice++) {
            // Exibi essa mensagem até que o índice seja igual ao numero da variável
            // contador
            System.out.println("Imprimindo o número " + indice);
        }
    }

}
