package hn.unah.examen.carwash.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.carwash.modelos.Cliente;
import hn.unah.examen.carwash.repositorios.ClienteRepository;
import hn.unah.examen.carwash.servicios.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public Cliente crearCliente(Cliente cliente) {

        return this.clienteRepository.save(cliente);
    }

    @Override
    public List<Cliente> obtenerTodosClientes() {

        return this.clienteRepository.findAll();

    }

    @Override
    public Cliente obtenerClientePorId(int idCliente) {

        if (this.clienteRepository.existsById(idCliente)) {
            return this.clienteRepository.findById(idCliente).get();
        }

        return null;
    }

}
