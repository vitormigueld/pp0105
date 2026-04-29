public class Main {
    static Intermediario montarCadeia(){
        Intermediario auth = new AutoInter();
        Intermediario permissao = new PermissaoInter();
        Intermediario validacao = new ValidacaoInter();
        Intermediario log = new LogInter();
        Intermediario controller = new ControllerInter();

        auth.setProximo(permissao);
        permissao.setProximo(validacao);
        validacao.setProximo(log);
        log.setProximo(controller);
        return auth;
    }
    public static void main(String[] args) {
        System.out.println("=== Cenário 1: Requisição válida ===");
        Intermediario cadeia1 = montarCadeia();
        cadeia1.processar(new Requisicao("admin", "valido", "ADMIN", true));

        System.out.println("\n=== Cenário 2: Token inválido ===");
        Intermediario cadeia2 = montarCadeia();
        cadeia2.processar(new Requisicao("user", "invalido", "ADMIN", true));

        System.out.println("\n=== Cenário 3: Sem permissão ===");
        Intermediario cadeia3 = montarCadeia();
        cadeia3.processar(new Requisicao("user", "valido", "USER", true));

        System.out.println("\n=== Cenário 4: Dados inválidos ===");
        Intermediario cadeia4 = montarCadeia();
        cadeia4.processar(new Requisicao("admin", "valido", "ADMIN", false));
    }
}