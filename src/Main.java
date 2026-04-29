import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Conta> contas = new ArrayList<>();

        int numeroConta = contas.size();

        System.out.println("Criar conta:");
        System.out.println("---------------");
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Informe o nome do titular da conta: ");
        String titularConta = sc.nextLine();

        System.out.println("Realizar um depósito inicial S/N? ");
        char respostaDeposito = sc.nextLine().toUpperCase().charAt(0);

        if (respostaDeposito == 'S') {
            System.out.println("Digite o valor a ser depositado: ");
            double valorDeposito = sc.nextDouble();
            sc.nextLine();
            Conta contaNova = new Conta(numeroConta, titularConta, valorDeposito);
            contas.add(contaNova);
        } else {
            System.out.println("Como não houve depósito no momento de criação da conta, o saldo inicial será: 0 ");
            Conta contanova = new Conta(numeroConta, titularConta);
            contas.add(contanova);
        }

        /*int totalContas = conta.size(); //Descontinuado por enquanto, possivel uso para contas com permissão//
        String estatus = (totalContas == 1) ? "Estatus da conta:" : "Estatus das contas:";

        for(Conta informacao: ){
            System.out.println(estatus);
            System.out.println(informacao.toString());
        }   */

        /*while(opcao != 4) {
            if (contas.size() > 1){
                System.out.println("Digite o numero da conta:");
                indice = sc.nextInt();
            }
            else{
                indice = 0;
            } */
        //Integer indice = null;
        int opcao = 0;
        Conta contaAtiva = contas.stream().filter(x -> x.getNumeroConta() == numeroConta).findFirst().orElse(null);

        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm");

        if (contaAtiva != null) {
            while (opcao != 4) {
                System.out.println("Escolha uma opção:");
                System.out.println("1 - Estatus da Conta:");
                System.out.println("2 - Depositar:");
                System.out.println("3 - Sacar:");
                System.out.println("4 - Sair:");
                opcao = sc.nextInt();
                switch (opcao) {
                    case 1:
                        System.out.println(contaAtiva.toString());
                        break;
                    case 2:
                        System.out.println("Digite o valor a ser depositado: ");
                        contaAtiva.deposito(sc.nextDouble());
                        System.out.println("Data/Hora de deposito: " + date.format(formatter));
                        System.out.printf("Saldo atual: R$%.2f %n", contaAtiva.getSaldo());
                        break;
                    case 3:
                        System.out.println("Digite o valor a ser sacado: ");
                        contaAtiva.saque(sc.nextDouble());
                        System.out.println("Data/Hora de saque: " + date.format(formatter));
                        System.out.printf("Saldo atual: R$%.2f %n", contaAtiva.getSaldo());
                        break;
                }
            }
        } else {
            System.out.println("Erro critico, conta não encontrada.");
        }
        System.out.println("Até logo!");
        sc.close();
    }
}
