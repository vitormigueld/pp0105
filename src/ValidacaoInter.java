public class ValidacaoInter extends Intermediario{
    public boolean processar(Requisicao req) {
        if (!req.dadosValidos) {
            System.out.println("VALIDAÇÃO: Dados inválidos");
            return false;
        }
        return proximo == null || proximo.processar(req);
    }
}
