package projeto.software.pedido;

public class PedidoSuspenso extends PedidoStatus {

    private PedidoSuspenso() {
    }

    private static PedidoSuspenso instance = new PedidoSuspenso();

    public static PedidoSuspenso getInstance() {
        return instance;
    }

    @Override
    public boolean reabrir(Pedido pedido) {
        pedido.setStatus(PedidoReaberto.getInstance());
        return true;
    }

    @Override
    public boolean retornar(Pedido pedido) {
        pedido.setStatus(PedidoRetornado.getInstance());
        return true;
    }

    @Override
    public boolean finalizar(Pedido pedido) {
        pedido.setStatus(PedidoFinalizado.getInstance());
        return true;
    }
}
