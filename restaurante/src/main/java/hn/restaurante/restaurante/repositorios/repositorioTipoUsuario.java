package hn.restaurante.restaurante.repositorios;


import org.springframework.data.jpa.repository.JpaRepository;

import hn.restaurante.restaurante.modelos.TipoUsuario;

public interface repositorioTipoUsuario extends JpaRepository<TipoUsuario, Integer> {
}
