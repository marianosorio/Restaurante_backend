package hn.restaurante.restaurante.modelos;

import lombok.Data;
import java.sql.Timestamp;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "pedidoProveedor")
public class PedidoProveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPedidoProveedor;

    @ManyToOne
    @JoinColumn(name = "idProveedor")
    private Proveedor proveedor;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    private double total;
    private Timestamp fechaPedido;

    @OneToMany(mappedBy = "pedidoProveedor")
    private List<PedidoProveedorIngrediente> pedidoProveedorIngredientes;
}

