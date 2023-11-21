package hn.unah.examen.carwash.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.examen.carwash.modelos.Vehiculo;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Integer> {

}
