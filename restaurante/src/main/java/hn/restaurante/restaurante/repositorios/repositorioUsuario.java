package hn.restaurante.restaurante.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.Usuario;

public interface repositorioUsuario extends JpaRepository<Usuario, Integer> {
}

