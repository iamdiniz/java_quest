import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // Força uso do ponto como separador decimal

        System.out.println("Bem vindo ao Banco Bradesco! Abaixo insira" +
                    " suas informações para criação de sua conta.");

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Por favor, digite o número da Agência ! : ");
        String numero_da_agencia = sc.nextLine();

        System.out.print("Número da conta: ");
        int numero_da_conta = sc.nextInt();

        System.out.print("Deposite sua entrada: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em " +
                    "nosso banco, sua agência é %S, conta %d e seu saldo %.2f" +
                    " já está disponível para saque", nome, numero_da_agencia,
                    numero_da_conta, saldo);
        
        sc.close();

    }
}
