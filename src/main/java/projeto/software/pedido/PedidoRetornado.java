package projeto.software.pedido;

public class PedidoRetornado extends PedidoStatus {

    private PedidoRetornado() {
    }

    private static PedidoRetornado instance = new PedidoRetornado();

    public static PedidoRetornado getInstance() {
        return instance;
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
