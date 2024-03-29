package hn.unah.examen.carwash.modelos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "vehiculo")
public class Vehiculo {

    @Id
    @Column(name = "idVehiculo")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVehiculo;

    private String marca;

    private int anio;

    private boolean disponible;

    /*
     * @Column(name = "idtipovehiculo")
     * private int idTipoVehiculo;
     */
    @ManyToOne
    @JoinColumn(name = "idtipovehiculo", referencedColumnName = "idTipoVehiculo")

    private TipoVehiculo tipoVehiculo;
}
