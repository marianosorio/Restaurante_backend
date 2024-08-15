package hn.restaurante.restaurante.modelos;


import lombok.Data;

import java.security.Timestamp;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "tipoPlatillo")
public class TipoPlatillo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPlatillo;

    private String nombreTipo;
    private Timestamp fechaTipo;

    @OneToMany(mappedBy = "tipoPlatillo")
    private List<Platillo> platillos;
}
