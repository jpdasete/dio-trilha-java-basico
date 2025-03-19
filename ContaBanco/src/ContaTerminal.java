import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia, nome_cliente;
        Double saldo;

        System.out.println("Digite seu nome : ");
        nome_cliente = scanner.next();
        System.out.print("Digite seu número : ");
        numero = scanner.nextInt();
        System.out.print("Digite sua agência : ");
        agencia = scanner.next();
        System.out.println("Digite seu saldo : ");
        saldo = scanner.nextDouble();
        System.out.println("Nome : " + nome_cliente + " Número : " + numero + " Agência : " + agencia + " Saldo : " + saldo);
    }
}
