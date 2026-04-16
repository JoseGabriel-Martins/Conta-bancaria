import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe quantas contas serão criadas: ");
        int n = sc.nextInt();
        sc.nextLine();
        Conta[] vect = new Conta[n];

        for (int i = 0; i < vect.length; i++) {
            int numeroConta = i;
            System.out.println("Numero da conta: " + i);
            System.out.println("Informe o nome do titular da conta: ");
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

        int totalContas = vect.length;
        String estatus = (totalContas == 1) ? "Estatus da conta:" : "Estatus das contas:";

        for(Conta informacao: vect){
            System.out.println(estatus);
            System.out.println(informacao.toString());
        }

        int opcao = 0;
        int indice = 0;

        while(opcao != 4) {
            if (vect.length > 1){
                System.out.println("Digite o numero da conta:");
                indice = sc.nextInt();
            }
            else{
                indice = 0;
            }
            System.out.println("Escolha uma opção:");
            System.out.println("-1 Estatus da Conta:");
            System.out.println("-2 Depositar:");
            System.out.println("-3 Sacar:");
            System.out.println("-4 Sair:");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(vect[indice].toString());
                    break;
                case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    vect[indice].deposito(sc.nextDouble());
                    System.out.printf("Saldo atual: R$%s %n", vect[indice].getSaldo());
                    break;
                case 3:
                    System.out.println("Digite o valor a ser sacado: ");
                    vect[indice].saque(sc.nextDouble());
                    System.out.printf("Saldo atual: R$%s %n", vect[indice].getSaldo());
                    break;
            }
        }
        sc.close();
    }
}