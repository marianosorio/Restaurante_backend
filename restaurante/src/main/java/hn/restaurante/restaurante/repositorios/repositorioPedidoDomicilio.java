package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.PedidoDomicilio;

public interface repositorioPedidoDomicilio extends JpaRepository<PedidoDomicilio, Integer> {
}

