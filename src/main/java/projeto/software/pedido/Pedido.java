package projeto.software.pedido;

public class Pedido {
    private PedidoStatus status;

    public Pedido(PedidoStatus status) {
        this.status = status;
    }

    public void setStatus(PedidoStatus status) {
        this.status = status;
    }

    public boolean aprovar() {
        return this.status.aprovar(this);
    }

    public boolean cancelar() {
        return this.status.cancelar(this);
    }

    public boolean reabrir() {
        return this.status.reabrir(this);
    }

    public boolean analisar() {
        return this.status.analisar(this);
    }

    public boolean retornar() {
        return this.status.retornar(this);
    }

    public boolean suspender() {
        return this.status.suspender(this);
    }

    public boolean finalizar() {
        return this.status.finalizar(this);
    }
}
