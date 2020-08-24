package br.com.testecdi.bean;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.testecdi.domain.Pessoa;
import lombok.Data;

@Named(value = "pessoaBean")
@SessionScoped
@Data
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = -7520922911940543207L;

	@Inject
	private Pessoa pessoaCadastro;

}
