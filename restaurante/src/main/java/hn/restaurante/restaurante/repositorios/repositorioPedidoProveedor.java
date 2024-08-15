package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.PedidoProveedor;

public interface repositorioPedidoProveedor extends JpaRepository<PedidoProveedor, Integer> {
}

