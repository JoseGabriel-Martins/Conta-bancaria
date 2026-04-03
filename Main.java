import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantas contas serão criadas: ");
        int n = sc.nextInt();
        Conta[] vect = new Conta[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Essa é a conta na posição: " + i);
            System.out.println("Informe o numero da conta: ");
            int numeroConta = sc.nextInt();

            System.out.println("Informe o nome do titular da conta: ");
            sc.nextLine();
            String titularConta = sc.nextLine();

            System.out.println("Realizar um depósito inicial S/N? ");
            char respostaDeposito = sc.nextLine().toUpperCase().charAt(0);


            if (respostaDeposito == 'S') {
                System.out.println("Digite o valor a ser depositado: ");
                double valorDeposito = sc.nextDouble();
                vect[i] = new Conta(numeroConta, titularConta, valorDeposito);
                sc.nextLine();
            } else {
                System.out.println("Como não houve depósito no momento de criação da conta, o saldo inicial será: 0 ");
                vect[i] = new Conta(numeroConta, titularConta);
            }
        }



        System.out.println("Account data:");
        System.out.printf("Account: %d, Holder: %s, Balance: R$: %.2f %n" , numeroConta, titularConta, conta.getSaldo());

        System.out.println("Digite o valor a ser depositado: ");
        conta.deposito(sc.nextDouble());
        System.out.printf("Saldo: %s %n", conta.getSaldo());

        System.out.println("Digite o valor a ser sacado: ");
        conta.saque(sc.nextDouble());
        System.out.printf("Saldo após saque: %s %n", conta.getSaldo());

        System.out.println("Informações atuais da conta:");
        System.out.println(conta.toString());

        sc.close();
    }
}