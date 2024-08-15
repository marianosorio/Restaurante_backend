package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.Factura;

public interface repositorioFactura extends JpaRepository<Factura, Integer> {
}

