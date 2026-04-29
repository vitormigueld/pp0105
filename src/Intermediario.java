abstract class Intermediario {
    protected Intermediario proximo;
    public void setProximo(Intermediario proximo) {
        this.proximo = proximo;
    }
    public abstract boolean processar(Requisicao req);
}
