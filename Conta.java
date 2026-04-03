 public class Conta {
        private int numeroConta;
        private String nomeTitular;
        private double saldo;

        public Conta(int numeroConta, String nomeTitular){
            this.numeroConta = numeroConta;
            this.nomeTitular = nomeTitular;
        }

        public Conta(int numeroConta, String nomeTitular, double depositoInicial){
            this.numeroConta = numeroConta;
            this.nomeTitular = nomeTitular;
            deposito(depositoInicial);
        }

        public int getNumeroConta() {
            return numeroConta;
        }

        public String getNomeTitular() {
            return nomeTitular;
        }

        public void setNomeTitular(String nomeTitular) {
            this.nomeTitular = nomeTitular;
        }

        public double getSaldo() {
            return saldo;
        }

        public double deposito(double valorDeposito){
            return saldo += valorDeposito;
        }
        public double saque(double valorSaque){
            return saldo -= valorSaque + 5.00;
        }

        public String toString() {
            return String.format("Numero da conta: %d, nome do titular: %s, saldo atual: R$ %.2f %n" , numeroConta, nomeTitular, saldo);
        }
}

