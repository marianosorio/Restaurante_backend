package hn.restaurante.restaurante.modelos;

import java.io.Serializable;
import lombok.Data;

@Data
public class PedidoProveedorIngredienteId implements Serializable {
    private int pedidoProveedor;
    private int ingrediente;
}

