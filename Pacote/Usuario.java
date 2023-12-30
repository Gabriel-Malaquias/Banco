import java.util.Scanner;
public class Usuario extends Pessoa {
    private String usuario;
    private int senha;
    private Scanner scanner;

    public Usuario(String nome, String cpf, int idade, String genero, Scanner scanner) {
        super(nome, cpf, idade, genero);
        this.scanner = scanner;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void Cadastrar(){
        System.out.print("Crie sua senha: ");
        int senha_cadastro = scanner.nextInt();
        scanner.nextLine();
        this.setUsuario(this.getCpf());
        this.setSenha(senha_cadastro);
    }

    public void Logar(){
        System.out.print("Usuário: ");
        String usuario_login = scanner.nextLine();
        System.out.print("Senha: ");
        int senha_login = scanner.nextInt();

        while (!usuario_login.equals(this.getCpf()) || senha_login != this.senha){
            System.out.println("Erro, dados incorretos. Tente novamente");
            
            System.out.print("Usuário: ");
            usuario_login = scanner.nextLine(); 
            scanner.nextLine();
            System.out.print("Senha: ");
            senha_login = scanner.nextInt();
            scanner.nextLine();
        }
        
        System.out.println("Login realizado com sucesso !");
    }

    public String toString(){
        System.out.println("--------------");
        return "Dados de Login:" + "\nUsuário: " + this.usuario + "\nSenha: " + this.senha + 
        "\nOBS: Anote seus dados !"; 
    }
    
}
