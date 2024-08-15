package hn.restaurante.restaurante.modelos;

import lombok.Data;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "facturas")

public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idFactura;

    @OneToOne
    @JoinColumn(name = "idOrden")
    private Orden orden;

    private double isv;
    private double total;
    private Timestamp fechaEntrega;
}

