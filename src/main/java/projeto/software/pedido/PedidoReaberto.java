package projeto.software.pedido;

public class PedidoReaberto extends PedidoStatus {

    private PedidoReaberto() {
    }

    private static PedidoReaberto instance = new PedidoReaberto();

    public static PedidoReaberto getInstance() {
        return instance;
    }

    @Override
    public boolean aprovar(Pedido pedido) {
        pedido.setStatus(PedidoAprovado.getInstance());
        return true;
    }

    @Override
    public boolean analisar(Pedido pedido) {
        pedido.setStatus(PedidoEmAnalise.getInstance());
        return true;
    }

    @Override
    public boolean suspender(Pedido pedido) {
        pedido.setStatus(PedidoSuspenso.getInstance());
        return true;
    }

    @Override
    public boolean finalizar(Pedido pedido) {
        pedido.setStatus(PedidoFinalizado.getInstance());
        return true;
    }
}
