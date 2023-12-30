import java.util.Scanner;

public class Instancia {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        Usuario usuario[] = new Usuario[4];
        usuario[0] = new Usuario("Terisvaldo", "000.111.222-65", 60, "Masculino", scanner);
        usuario[0].Cadastrar();
        usuario[0].Logar();

        usuario[1] = new Usuario("Fernanda", "555.777.111-02", 25, "Feminino", scanner);
        usuario[1].Cadastrar();
        usuario[1].Logar();

        usuario[2] = new Usuario("Henrique", "888.000.333-45", 30, "Masculino", scanner);
        usuario[2].Cadastrar();
        usuario[2].Logar();

        usuario[3] = new Usuario("Luana", "666.555.444-78", 29, "Masculino", scanner);
        usuario[3].Cadastrar();
        usuario[3].Logar();

        Transacoes transacoes[] = new Transacoes[4];
        transacoes[0] = new Transacoes(scanner);
        transacoes[0].setUsuario(usuario[0]);
        transacoes[0].Depositar();
        transacoes[0].Sacar();

        transacoes[1] = new Transacoes(scanner);
        transacoes[1].setUsuario(usuario[1]);
        transacoes[1].Depositar();
        transacoes[1].Transferir();

        transacoes[2] = new Transacoes(scanner);
        transacoes[2].setUsuario(usuario[2]);
        transacoes[2].Emprestimo();
        transacoes[2].Transferir();

        transacoes[3] = new Transacoes(scanner);
        transacoes[3].setUsuario(usuario[3]);
        transacoes[3].Emprestimo();
        transacoes[3].Sacar();

        Conta conta[] = new Conta[4];
        conta[0] = new Conta(usuario[0], transacoes[0]);

        conta[1] = new Conta(usuario[1], transacoes[1]);

        conta[2] = new Conta(usuario[2], transacoes[2]);

        conta[3] = new Conta(usuario[3], transacoes[3]);
    }
}
