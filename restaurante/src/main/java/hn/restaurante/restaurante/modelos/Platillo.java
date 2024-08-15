package hn.restaurante.restaurante.modelos;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Data
@Entity
@Table(name = "platillos")
public class Platillo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlatillo;

    private String nombre;
    private String descripcion;
    private double precio;

    @ManyToOne
    @JoinColumn(name = "idTipoPlatillo")
    private TipoPlatillo tipoPlatillo;

    @OneToMany(mappedBy = "platillo")
    private List<PlatilloIngrediente> platilloIngredientes;

    @OneToMany(mappedBy = "platillo")
    private List<OrdenesPlatillos> ordenesPlatillos;
}
