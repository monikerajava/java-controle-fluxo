import java.util.Scanner;

import ParametrosInvalidosException.ParametrosInvalidosException;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro");
        if (!terminal.hasNextInt()) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
            return;
        }
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro");
        if (!terminal.hasNextInt()) {
            System.out.println("Erro: Entrada inválida. Por favor, digite um número inteiro.");
            return;
        }
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException exception) {
            // Imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        } finally {
            terminal.close(); // Fechar o scanner
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // Realizar o for para imprimir os números com base na variável contagem
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
