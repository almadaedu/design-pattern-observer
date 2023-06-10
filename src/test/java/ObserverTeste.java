import Observer.SistemaNotificacoes;
import Observer.Usuario;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ObserverTeste {

    @Test
    public void testeNotificacaoUsuarios() {
        // Criando o sistema de notificações
        SistemaNotificacoes sistema = new SistemaNotificacoes();

        // Criando os usuários
        Usuario usuario1 = new Usuario("Eduardo");
        Usuario usuario2 = new Usuario("Zézin");

        // Registrando os usuários como observadores
        sistema.registrarObserver(usuario1);
        sistema.registrarObserver(usuario2);

        // Enviando uma notificação
        sistema.notificarObservers("Nova atualização disponível!");

        // Verificando se os usuários receberam a notificação corretamente
        assertEquals("Nova atualização disponível!", usuario1.getUltimaNotificacao());
        assertEquals("Nova atualização disponível!", usuario2.getUltimaNotificacao());

        // Removendo um dos usuários
        sistema.removerObserver(usuario2);

        // Enviando outra notificação
        sistema.notificarObservers("Promoção imperdível!");

        // Verificando se o usuário removido não recebeu a segunda notificação
        assertEquals("Promoção imperdível!", usuario1.getUltimaNotificacao());
    }
}
