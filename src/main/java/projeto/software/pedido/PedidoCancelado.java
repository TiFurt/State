package projeto.software.pedido;

public class PedidoCancelado extends PedidoStatus {

    private PedidoCancelado() {
    }

    private static PedidoCancelado instance = new PedidoCancelado();

    public static PedidoCancelado getInstance() {
        return instance;
    }

    @Override
    public boolean retornar(Pedido pedido) {
        pedido.setStatus(PedidoRetornado.getInstance());
        return true;
    }
}
