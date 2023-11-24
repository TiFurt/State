package projeto.software.pedido;

public abstract class PedidoStatus {
    public boolean aprovar(Pedido pedido) {
        return false;
    }

    public boolean cancelar(Pedido pedido) {
        return false;
    }

    public boolean reabrir(Pedido pedido) {
        return false;
    }

    public boolean analisar(Pedido pedido) {
        return false;
    }

    public boolean retornar(Pedido pedido) {
        return false;
    }

    public boolean suspender(Pedido pedido) {
        return false;
    }

    public boolean finalizar(Pedido pedido) {
        return false;
    }
}
