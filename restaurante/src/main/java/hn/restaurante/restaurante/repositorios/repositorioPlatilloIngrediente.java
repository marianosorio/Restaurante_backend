package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.PlatilloIngrediente;
import hn.restaurante.restaurante.modelos.PlatilloIngredienteId;

public interface repositorioPlatilloIngrediente extends JpaRepository<PlatilloIngrediente, PlatilloIngredienteId> {
}

