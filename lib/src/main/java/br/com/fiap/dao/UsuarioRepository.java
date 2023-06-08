package br.com.fiap.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.fiap.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long>{

	
}
