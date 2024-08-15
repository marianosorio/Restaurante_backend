package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.Platillo;

public interface repositorioPlatillo extends JpaRepository<Platillo, Integer> {
}

