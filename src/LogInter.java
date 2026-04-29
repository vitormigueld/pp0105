public class LogInter extends Intermediario{
    public boolean processar(Requisicao req) {
        System.out.println("LOG: Requisição processada");
        return proximo == null || proximo.processar(req);
    }
}
