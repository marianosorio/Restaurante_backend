package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.Proveedor;

public interface repositorioProveedor extends JpaRepository<Proveedor, Integer> {
}

