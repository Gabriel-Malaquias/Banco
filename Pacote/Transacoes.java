import java.util.Scanner;
import java.util.Random;
public class Transacoes implements Interface{
    private Usuario usuario;
    private float saldo;
    private Scanner scanner;

    public Transacoes(Scanner scanner){
        this.scanner = scanner;
    }

    public Transacoes(){
        this.saldo = 0;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public void Depositar() {
        System.out.println("--------------");
        System.out.print("Informe o valor de depósito: R$ ");
        float valor = scanner.nextFloat();
        this.saldo += valor;
        System.out.println("R$ " + valor + " depositado na conta" + "\nSaldo disponível: R$ " + this.saldo);

    }

    @Override
    public void Sacar() {
       System.out.println("--------------");
       System.out.print("Informe o valor de saque: R$ ");
       float valor = scanner.nextFloat();
       this.saldo -= valor;
       System.out.println("R$ " + valor + " sacado da conta" + "\nSaldo disponível:  R$ " + this.saldo);
    }

    @Override
    public void Transferir() {
        System.out.println("--------------");
        System.out.print("Valor da transferência R$: ");
        float valor = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("Pix do destinatário: ");
        String pix_destinatario = scanner.nextLine();

        System.out.print("Confirme sua senha: ");
        int senha = scanner.nextInt();

        if (this.saldo >= valor && senha == this.getUsuario().getSenha()) {
            System.out.println("Transferência realizada com sucesso para a chave pix " + pix_destinatario);
            this.saldo -= valor;
        } else {
            System.out.println("Erro, senha incorreta ou saldo insuficiente");
        }
    }


    @Override
    public void Emprestimo() {
        Random ran = new Random();
        int[] vetor = {0,1,2,3,4};

        int aleatorio = ran.nextInt(vetor.length);
        switch (aleatorio) {
            case 0:
                System.out.println("Empréstimo Negado");
                break;
            case 1:
                System.out.println("Empréstimo liberado no valor de R$ 2000");
                this.saldo += 2000;
                break;
            case 2:
                System.out.println("Empréstimo liberado no valor de R$ 4000");
                this.saldo += 4000;
                break;
            case 3:
                System.out.println("Empréstimo liberado no valor de R$ 8000");
                this.saldo += 8000;
                break;
            case 4:
                System.out.println("Empréstimo liberado no valor de R$ 10000");
                this.saldo += 10000;
                break;
        }
    }

}