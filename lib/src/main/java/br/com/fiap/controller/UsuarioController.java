package br.com.fiap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.dto.UsuarioDTO;
import br.com.fiap.service.UsuarioService;

@RestController
public class UsuarioController {
	
	@Autowired
	private UsuarioService compradorService; 
	
	@GetMapping("/getUsuario")
	ResponseEntity<List<UsuarioDTO>> all() {
		return ResponseEntity.ok(compradorService.getAllComprador());
	}
	
	@GetMapping("/comprador/{id}")
	ResponseEntity<List<UsuarioDTO>> getCompradorId(@PathVariable Long id) {
		return ResponseEntity.ok(compradorService.getAllCompradorID(id));
	}
	
	
	
	@PostMapping("/usuario")
	public ResponseEntity<UsuarioDTO> newComprador(@RequestBody UsuarioDTO newComprador) {
		compradorService.saveComprador(newComprador);
		return ResponseEntity.ok(newComprador);
	}
    
	
	@PutMapping("/comprador/{id}")
	public ResponseEntity<UsuarioDTO> replaceComprador(@RequestBody UsuarioDTO newComprador, @PathVariable Long id) {
		UsuarioDTO compradorUpdated = compradorService.updateComprador(newComprador,id);
		return ResponseEntity.ofNullable(compradorUpdated);
	}
	
	@DeleteMapping("/comprador/{id}")
	public ResponseEntity<UsuarioDTO> deleteComprador(@PathVariable Long id) {
		return ResponseEntity.ofNullable(compradorService.deleteComprador(id));
	}

}
