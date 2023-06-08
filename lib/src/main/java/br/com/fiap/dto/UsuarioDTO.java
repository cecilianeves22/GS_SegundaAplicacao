package br.com.fiap.dto;

import br.com.fiap.entity.UsuarioEntity;

public class UsuarioDTO {
	
	private int id;
	private String nomeEmpresa; 
	private String senha; 
	private Long cnpj;
	
	public UsuarioDTO(UsuarioEntity entity) {
		this.id = entity.getId();
		this.nomeEmpresa = entity.getNomeEmpresa();
		this.senha = entity.getNomeEmpresa();
		this.cnpj = entity.getCnpj();
	}

	public UsuarioDTO(int id, String nomeEmpresa, String senha,  Long cnpj) {
		this.id = id;
		this.nomeEmpresa = nomeEmpresa;
		this.senha = senha;
		this.cnpj = cnpj;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	public Long getCnpj() {
		return cnpj;
	}

	public void setCnpj(Long cnpj) {
		this.cnpj = cnpj;
	}
	
	
	
	

}
