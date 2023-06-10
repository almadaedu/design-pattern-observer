package Observer;

import java.util.ArrayList;
import java.util.List;

public class SistemaNotificacoes implements Assunto {
    private List<Observer> observers = new ArrayList<>();

    public void registrarObserver(Observer observer) {
        observers.add(observer);
    }

    public void removerObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notificarObservers(String mensagem) {
        for (Observer observer : observers) {
            observer.receberNotificacao(mensagem);
        }
    }
}