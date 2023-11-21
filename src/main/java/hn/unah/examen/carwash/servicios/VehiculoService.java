package hn.unah.examen.carwash.servicios;

import java.util.List;

import hn.unah.examen.carwash.modelos.Vehiculo;

public interface VehiculoService {
    public Vehiculo crearVehiculo(Vehiculo vehiculo);

    public List<Vehiculo> obtenerTodosVehiculos();

    public Vehiculo obteVehiculoId(int idVehiculo);
}
