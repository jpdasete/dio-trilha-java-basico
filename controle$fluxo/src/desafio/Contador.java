package desafio;

import java.util.Scanner;

public class Contador {

	class ParametrosInvalidosException extends Exception {
	    public ParametrosInvalidosException(String mensagem) {
	        super(mensagem);
	    }
	}
	
	public static void main(String[] args) {
		  Scanner terminal = new Scanner(System.in);

	        System.out.println("Digite o primeiro parâmetro:");
	        int parametroUm = terminal.nextInt(); // Corrigido

	        System.out.println("Digite o segundo parâmetro:");
	        int parametroDois = terminal.nextInt(); // Corrigido

	        try {
	            // Chamando o método contendo a lógica de contagem
	            contar(parametroUm, parametroDois);
	        } catch (ParametrosInvalidosException exception) { // Corrigido
	            // Imprimir a mensagem de erro caso a exceção seja lançada
	            System.out.println("Erro: " + exception.getMessage());
	        } finally {
	            terminal.close(); // Fechar o scanner para evitar vazamento de recursos
	        }
	    }
	    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
	        // Validar se parametroUm é MAIOR que parametroDois e lançar a exceção
	        if (parametroUm >= parametroDois) {
	           //throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
	        }

	        int contagem = parametroDois - parametroUm;
	        // Realizar o for para imprimir os números com base na variável contagem
	        for (int i = 1; i <= contagem; i++) {
	            System.out.println("Imprimindo o número " + i);
	        }
	    }

}
