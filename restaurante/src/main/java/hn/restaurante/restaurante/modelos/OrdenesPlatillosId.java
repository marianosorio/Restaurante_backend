package hn.restaurante.restaurante.modelos;

import java.io.Serializable;
import lombok.Data;

@Data
public class OrdenesPlatillosId implements Serializable {
    private int orden;
    private int platillo;
}

