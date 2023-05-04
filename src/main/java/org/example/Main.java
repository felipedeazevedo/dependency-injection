package org.example;

import org.example.notificacao.Notificador;
import org.example.notificacao.NotificadorEmail;
import org.example.notificacao.NotificadorSMS;
import org.example.service.AtivacaoClienteService;

public class Main {

    public static void main(String[] args) {
        Cliente joao = new Cliente("João", "joao@xyz.com", "61911111111");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "61922222222");

        Notificador notificador = new NotificadorSMS();

        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificador);
        ativacaoClienteService.ativar(joao);
        ativacaoClienteService.ativar(maria);
    }
}