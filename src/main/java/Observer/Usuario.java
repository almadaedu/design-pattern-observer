package Observer;
public class Usuario implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void receberNotificacao(String mensagem) {
        ultimaNotificacao = mensagem;
        System.out.println(nome + " recebeu a seguinte notificação: " + mensagem);
    }

    public String getUltimaNotificacao() {
        return ultimaNotificacao;
    }
}