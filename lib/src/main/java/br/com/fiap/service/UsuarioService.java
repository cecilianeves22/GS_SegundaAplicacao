package br.com.fiap.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.fiap.dao.UsuarioRepository;
import br.com.fiap.dto.UsuarioDTO;
import br.com.fiap.entity.UsuarioEntity;


@Service
public class UsuarioService {

private UsuarioRepository compradorRepository;
	
	public UsuarioDTO saveComprador(UsuarioDTO comprador) {
		UsuarioEntity compradorEntity = new UsuarioEntity(comprador);
		compradorRepository.save(compradorEntity);
		return comprador;
	}

	public List<UsuarioDTO> getAllComprador() {
		return compradorRepository.findAll().stream().map(entity -> new UsuarioDTO(entity)).toList();
	}
	
	public UsuarioDTO findById(Long id) {
		 Optional<UsuarioEntity> compradorEntity = compradorRepository.findById(id);
		 if(compradorEntity.isPresent()) {
			 return new UsuarioDTO(compradorEntity.get());
		 } 
		 return null;
	}
	
	public UsuarioDTO updateComprador(UsuarioDTO newComprador, Long id) {
		Optional<UsuarioEntity> compradorEntityOptional = compradorRepository.findById(id);
		if(compradorEntityOptional.isPresent()) {
			UsuarioEntity compradorEntity = compradorEntityOptional.get();
			compradorEntity.setId(newComprador.getId());
			compradorEntity.setNomeEmpresa(newComprador.getNomeEmpresa());
			compradorEntity.setSenha(newComprador.getSenha());
			compradorEntity.setCnpj(newComprador.getCnpj());
			return newComprador;
		}
		return null;
		
	}
	
	public UsuarioDTO deleteComprador(Long id) {
		Optional<UsuarioEntity> compradorEntityOptional = compradorRepository.findById(id);
		if(compradorEntityOptional.isPresent()) {
			UsuarioEntity compradorEntity = compradorEntityOptional.get();
			compradorRepository.delete(compradorEntity);
			return new UsuarioDTO(compradorEntity);
		}
		return null;
	}

	public List<UsuarioDTO> getAllCompradorID(Long id) {
		return compradorRepository.findAll().stream().map(entity -> new UsuarioDTO(entity)).toList();
	}
}
