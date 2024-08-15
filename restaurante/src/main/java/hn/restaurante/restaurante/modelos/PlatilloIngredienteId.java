package hn.restaurante.restaurante.modelos;

import java.io.Serializable;
import lombok.Data;

@Data
public class PlatilloIngredienteId implements Serializable {
    private int ingrediente;
    private int platillo;
}
