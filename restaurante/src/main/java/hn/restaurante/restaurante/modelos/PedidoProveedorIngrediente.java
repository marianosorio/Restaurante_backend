package hn.restaurante.restaurante.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pedidoProveedor_ingredientes")
@IdClass(PedidoProveedorIngredienteId.class)

public class PedidoProveedorIngrediente {
    @Id
    @ManyToOne
    @JoinColumn(name = "idPedidoProveedor")
    private PedidoProveedor pedidoProveedor;

    @Id
    @ManyToOne
    @JoinColumn(name = "idIngrediente")
    private Ingrediente ingrediente;

    private double cantidadComprada;
}

