package com.totalshakes.totalshakesmicroservices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TotalShakeMicroservicesApplicationPagamentosAPITests {

    @Autowired
    PedidoController pedidoController;

    @Test
    void contextLoads() {
    }

    @Test
    void testSavePedidoProperly() throws PedidoJaCadastradoException {
        PedidoDTO pedidoDTO = new PedidoDTO();
        List<ItemPedidoDTO> itens = new ArrayList<>();

        pedidoDTO.setId(1L);
        pedidoDTO.setItensDTO(itens);

        ResponseEntity pedidoSalvo = pedidoController.savePedido(pedidoDTO);

        assertEquals(HttpStatus.CREATED, pedidoSalvo.getStatusCode());
    }

}
