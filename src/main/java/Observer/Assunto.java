package Observer;
interface Assunto {
    void registrarObserver(Observer observer);
    void removerObserver(Observer observer);
    void notificarObservers(String mensagem);
}