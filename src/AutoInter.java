public class AutoInter extends Intermediario{
    public boolean processar(Requisicao req) {
        if (!req.token.equals("valido")) {
            System.out.println("AUTH: Token inválido → acesso negado");
            return false;
        }
        return proximo == null || proximo.processar(req);
    }
}
