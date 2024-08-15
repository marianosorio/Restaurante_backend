package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.Orden;

public interface repositorioOrden extends JpaRepository<Orden, Integer> {
}

