package hn.unah.examen.carwash.servicios;

import java.util.List;

import hn.unah.examen.carwash.modelos.Cliente;

public interface ClienteService {

    public Cliente crearCliente(Cliente cliente);

    public Cliente obtenerClientePorId(int idCliente);

    public List<Cliente> obtenerTodosClientes();
}
