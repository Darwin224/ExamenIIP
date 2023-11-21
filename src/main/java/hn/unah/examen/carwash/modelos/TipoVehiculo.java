package hn.unah.examen.carwash.modelos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tipovehiculo")
public class TipoVehiculo {

    @Id
    @Column(name = "idtipovehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoVehiculo;

    private String descripcion;

    @Column(name = "precioxhora")
    private double precioXhora;

    @OneToMany(mappedBy = "tipoVehiculo")
    private List<Vehiculo> vehiculo;

}
