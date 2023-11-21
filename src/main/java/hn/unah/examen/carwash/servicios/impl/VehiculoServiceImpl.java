package hn.unah.examen.carwash.servicios.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen.carwash.modelos.Vehiculo;
import hn.unah.examen.carwash.repositorios.VehiculoRepository;
import hn.unah.examen.carwash.servicios.VehiculoService;
@Service
public class VehiculoServiceImpl implements VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    @Override
    public Vehiculo crearVehiculo(Vehiculo vehiculo) {

        return this.vehiculoRepository.save(vehiculo);

    }

    @Override
    public List<Vehiculo> obtenerTodosVehiculos() {
        return this.vehiculoRepository.findAll();
    }

    @Override
    public Vehiculo obteVehiculoId(int idVehiculo) {

        if (this.vehiculoRepository.existsById(idVehiculo)) {

            return this.vehiculoRepository.findById(idVehiculo).get();
        }

        return null;
    }

}
