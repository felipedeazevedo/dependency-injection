package org.example.service;

import org.example.Cliente;
import org.example.Produto;
import org.example.notificacao.Notificador;

public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        // TODO emite a nota fiscal aqui...

        this.notificador.notificar(cliente, "Nota fiscal do produto " +
                produto.getNome() + " foi emitida!");
    }
}
