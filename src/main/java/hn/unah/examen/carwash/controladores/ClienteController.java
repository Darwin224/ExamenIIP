package hn.unah.examen.carwash.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen.carwash.modelos.Cliente;
import hn.unah.examen.carwash.servicios.impl.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

    @Autowired
    private ClienteServiceImpl clienteServiceImpl;

    @PostMapping("/crearCliente")
    public String crearCliente(@RequestBody Cliente cliente) {

        return "El cliente es:" + this.clienteServiceImpl.crearCliente(cliente);

    }
}
