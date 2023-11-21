package hn.unah.examen.carwash.modelos;

import java.util.Date;

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
@Table(name = " cliente")
public class Cliente {
    @Id
    @Column(name = "codigocliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigoCliente;

    private String nombre;

    private String apellido;

    @Column(name = "fechaingreso")
    private Date fechaIngreso;

    /*
     * @Column(name = "idtipocliente")
     * private int idTipoCliente;
     */

    @ManyToOne
    @JoinColumn(name = "idtipocliente", referencedColumnName = "idTipoCliente")
    private TipoCliente tipoCliente;

}
