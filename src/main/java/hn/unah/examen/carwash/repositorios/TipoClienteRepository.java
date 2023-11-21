package hn.unah.examen.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.carwash.modelos.TipoCliente;

public interface TipoClienteRepository extends JpaRepository<TipoCliente, Integer> {
    
}
