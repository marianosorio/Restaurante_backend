package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.Reservacion;

public interface repositorioReservacion extends JpaRepository<Reservacion, Integer> {
}

