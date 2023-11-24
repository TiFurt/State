package projeto.software.pedido;

public class PedidoEmAnalise extends PedidoStatus {

    private PedidoEmAnalise() {
    }

    private static PedidoEmAnalise instance = new PedidoEmAnalise();

    public static PedidoEmAnalise getInstance() {
        return instance;
    }

    @Override
    public boolean aprovar(Pedido pedido) {
        pedido.setStatus(PedidoAprovado.getInstance());
        return true;
    }

    @Override
    public boolean cancelar(Pedido pedido) {
        pedido.setStatus(PedidoCancelado.getInstance());
        return true;
    }

    @Override
    public boolean suspender(Pedido pedido) {
        pedido.setStatus(PedidoSuspenso.getInstance());
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
