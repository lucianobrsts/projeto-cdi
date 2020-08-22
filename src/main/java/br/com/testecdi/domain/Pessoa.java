package br.com.testecdi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Pessoa extends AbstractEntity {

	private static final long serialVersionUID = 3860885131403764281L;

	@NotEmpty(message = "O preenchimento do campo nome é obrigatório.")
	@Size(min = 5, max = 50, message = "Tamanho inválido para o campo nome (5 - 50")
	@Column(name = "nome", nullable = false)
	private String nome;

}
