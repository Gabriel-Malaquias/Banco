public class Conta {
    private Usuario usuario;
    private Transacoes transacoes;

    public Conta(Usuario usuario, Transacoes transacoes){
        this.usuario = usuario;
        this.transacoes = transacoes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Transacoes getTransacoes() {
        return transacoes;
    }

    public void setTransacoes(Transacoes transacoes) {
        this.transacoes = transacoes;
    }
    
}
