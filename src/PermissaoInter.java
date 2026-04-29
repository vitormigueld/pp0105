public class PermissaoInter extends Intermediario{
    public boolean processar(Requisicao req) {
        if (!req.permissao.equals("ADMIN")) {
            System.out.println("PERMISSÃO: Acesso negado");
            return false;
        }
        return proximo == null || proximo.processar(req);
    }
}
