package projeto.software.pedido;

public class PedidoFinalizado extends PedidoStatus {

    private PedidoFinalizado() {
    }

    private static PedidoFinalizado instance = new PedidoFinalizado();

    public static PedidoFinalizado getInstance() {
        return instance;
    }

    @Override
    public boolean reabrir(Pedido pedido) {
        pedido.setStatus(PedidoReaberto.getInstance());
        return true;
    }
}
