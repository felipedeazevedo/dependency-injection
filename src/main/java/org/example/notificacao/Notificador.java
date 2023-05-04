package org.example.notificacao;

import org.example.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}
