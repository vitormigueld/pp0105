public class ControllerInter extends Intermediario{
    public boolean processar(Requisicao req) {
        System.out.println("CONTROLLER: Requisição processada com sucesso");
        return true;
    }
}
