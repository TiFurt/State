package projeto.software.pedido;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void pedidoAprovadoNaoPodeSerAprovado() {
        Pedido pedido = new Pedido(PedidoAprovado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    void pedidoAprovadoPodeSerCancelado() {
        Pedido pedido = new Pedido(PedidoAprovado.getInstance());
        assertTrue(pedido.cancelar());
    }

    @Test
    void pedidoAprovadoNaoPodeSerReaberto() {
        Pedido pedido = new Pedido(PedidoAprovado.getInstance());
        assertFalse(pedido.reabrir());
    }

    @Test
    void pedidoAprovadoPodeSerAnalizado() {
        Pedido pedido = new Pedido(PedidoAprovado.getInstance());
        assertTrue(pedido.analisar());
    }

    @Test
    void pedidoAprovadoPodeSerRetornado() {
        Pedido pedido = new Pedido(PedidoAprovado.getInstance());
        assertTrue(pedido.retornar());
    }

    @Test
    void pedidoAprovadoPodeSerSuspenso() {
        Pedido pedido = new Pedido(PedidoAprovado.getInstance());
        assertTrue(pedido.suspender());
    }

    @Test
    void pedidoAprovadoPodeSerFinalizado() {
        Pedido pedido = new Pedido(PedidoAprovado.getInstance());
        assertTrue(pedido.finalizar());
    }

    @Test
    void pedidoCanceladoNaoPodeSerAprovado() {
        Pedido pedido = new Pedido(PedidoCancelado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    void pedidoCanceladoNaoPodeSerCancelado() {
        Pedido pedido = new Pedido(PedidoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    void pedidoCanceladoNaoPodeSerReaberto() {
        Pedido pedido = new Pedido(PedidoCancelado.getInstance());
        assertFalse(pedido.reabrir());
    }

    @Test
    void pedidoCanceladoNaoPodeSerAnalizado() {
        Pedido pedido = new Pedido(PedidoCancelado.getInstance());
        assertFalse(pedido.analisar());
    }

    @Test
    void pedidoCanceladoPodeSerRetornado() {
        Pedido pedido = new Pedido(PedidoCancelado.getInstance());
        assertTrue(pedido.retornar());
    }

    @Test
    void pedidoCanceladoNaoPodeSerSuspenso() {
        Pedido pedido = new Pedido(PedidoCancelado.getInstance());
        assertFalse(pedido.suspender());
    }

    @Test
    void pedidoCanceladoNaoPodeSerFinalizado() {
        Pedido pedido = new Pedido(PedidoCancelado.getInstance());
        assertFalse(pedido.finalizar());
    }

    @Test
    void pedidoReabertoPodeSerAprovado() {
        Pedido pedido = new Pedido(PedidoReaberto.getInstance());
        assertTrue(pedido.aprovar());
    }

    @Test
    void pedidoReabertoNaoPodeSerCancelado() {
        Pedido pedido = new Pedido(PedidoReaberto.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    void pedidoReabertoNaoPodeSerReaberto() {
        Pedido pedido = new Pedido(PedidoReaberto.getInstance());
        assertFalse(pedido.reabrir());
    }

    @Test
    void pedidoReabertoPodeSerAnalizado() {
        Pedido pedido = new Pedido(PedidoReaberto.getInstance());
        assertTrue(pedido.analisar());
    }

    @Test
    void pedidoReabertoNaoPodeSerRetornado() {
        Pedido pedido = new Pedido(PedidoReaberto.getInstance());
        assertFalse(pedido.retornar());
    }

    @Test
    void pedidoReabertoPodeSerSuspenso() {
        Pedido pedido = new Pedido(PedidoReaberto.getInstance());
        assertTrue(pedido.suspender());
    }

    @Test
    void pedidoReabertoPodeSerFinalizado() {
        Pedido pedido = new Pedido(PedidoReaberto.getInstance());
        assertTrue(pedido.finalizar());
    }

    @Test
    void pedidoEmAnalisePodeSerAprovado() {
        Pedido pedido = new Pedido(PedidoEmAnalise.getInstance());
        assertTrue(pedido.aprovar());
    }

    @Test
    void pedidoEmAnalisePodeSerCancelado() {
        Pedido pedido = new Pedido(PedidoEmAnalise.getInstance());
        assertTrue(pedido.cancelar());
    }

    @Test
    void pedidoEmAnaliseNaoPodeSerReaberto() {
        Pedido pedido = new Pedido(PedidoEmAnalise.getInstance());
        assertFalse(pedido.reabrir());
    }

    @Test
    void pedidoEmAnaliseNaoPodeSerAnalizado() {
        Pedido pedido = new Pedido(PedidoEmAnalise.getInstance());
        assertFalse(pedido.analisar());
    }

    @Test
    void pedidoEmAnalisePodeSerRetornado() {
        Pedido pedido = new Pedido(PedidoEmAnalise.getInstance());
        assertTrue(pedido.retornar());
    }

    @Test
    void pedidoEmAnalisePodeSerSuspenso() {
        Pedido pedido = new Pedido(PedidoEmAnalise.getInstance());
        assertTrue(pedido.suspender());
    }

    @Test
    void pedidoEmAnalisePodeSerFinalizado() {
        Pedido pedido = new Pedido(PedidoEmAnalise.getInstance());
        assertTrue(pedido.finalizar());
    }

    @Test
    void pedidoRetornadoNaoPodeSerAprovado() {
        Pedido pedido = new Pedido(PedidoRetornado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    void pedidoRetornadoNaoPodeSerCancelado() {
        Pedido pedido = new Pedido(PedidoRetornado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    void pedidoRetornadoNaoPodeSerReaberto() {
        Pedido pedido = new Pedido(PedidoRetornado.getInstance());
        assertFalse(pedido.reabrir());
    }

    @Test
    void pedidoRetornadoPodeSerAnalizado() {
        Pedido pedido = new Pedido(PedidoRetornado.getInstance());
        assertTrue(pedido.analisar());
    }

    @Test
    void pedidoRetornadoNaoPodeSerRetornado() {
        Pedido pedido = new Pedido(PedidoRetornado.getInstance());
        assertFalse(pedido.retornar());
    }

    @Test
    void pedidoRetornadoPodeSerSuspenso() {
        Pedido pedido = new Pedido(PedidoRetornado.getInstance());
        assertTrue(pedido.suspender());
    }

    @Test
    void pedidoRetornadoPodeSerFinalizado() {
        Pedido pedido = new Pedido(PedidoRetornado.getInstance());
        assertTrue(pedido.finalizar());
    }

    @Test
    void pedidoSuspensoNaoPodeSerAprovado() {
        Pedido pedido = new Pedido(PedidoSuspenso.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    void pedidoSuspensoNaoPodeSerCancelado() {
        Pedido pedido = new Pedido(PedidoSuspenso.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    void pedidoSuspensoPodeSerReaberto() {
        Pedido pedido = new Pedido(PedidoSuspenso.getInstance());
        assertTrue(pedido.reabrir());
    }

    @Test
    void pedidoSuspensoNaoPodeSerAnalizado() {
        Pedido pedido = new Pedido(PedidoSuspenso.getInstance());
        assertFalse(pedido.analisar());
    }

    @Test
    void pedidoSuspensoPodeSerRetornado() {
        Pedido pedido = new Pedido(PedidoSuspenso.getInstance());
        assertTrue(pedido.retornar());
    }

    @Test
    void pedidoSuspensoNaoPodeSerSuspenso() {
        Pedido pedido = new Pedido(PedidoSuspenso.getInstance());
        assertFalse(pedido.suspender());
    }

    @Test
    void pedidoSuspensoPodeSerFinalizado() {
        Pedido pedido = new Pedido(PedidoSuspenso.getInstance());
        assertTrue(pedido.finalizar());
    }

    @Test
    void pedidoFinalizadoNaoPodeSerAprovado() {
        Pedido pedido = new Pedido(PedidoFinalizado.getInstance());
        assertFalse(pedido.aprovar());
    }

    @Test
    void pedidoFinalizadoNaoPodeSerCancelado() {
        Pedido pedido = new Pedido(PedidoFinalizado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    void pedidoFinalizadoPodeSerReaberto() {
        Pedido pedido = new Pedido(PedidoFinalizado.getInstance());
        assertTrue(pedido.reabrir());
    }

    @Test
    void pedidoFinalizadoNaoPodeSerAnalizado() {
        Pedido pedido = new Pedido(PedidoFinalizado.getInstance());
        assertFalse(pedido.analisar());
    }

    @Test
    void pedidoFinalizadoNaoPodeSerRetornado() {
        Pedido pedido = new Pedido(PedidoFinalizado.getInstance());
        assertFalse(pedido.retornar());
    }

    @Test
    void pedidoFinalizadoNaoPodeSerSuspenso() {
        Pedido pedido = new Pedido(PedidoFinalizado.getInstance());
        assertFalse(pedido.suspender());
    }

    @Test
    void pedidoFinalizadoNaoPodeSerFinalizado() {
        Pedido pedido = new Pedido(PedidoFinalizado.getInstance());
        assertFalse(pedido.finalizar());
    }
}