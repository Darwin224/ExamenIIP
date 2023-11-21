package hn.unah.examen.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.carwash.modelos.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Integer>{
    

}
