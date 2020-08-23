package br.com.testecdi.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.omnifaces.util.Messages;

import br.com.testecdi.domain.Pessoa;
import br.com.testecdi.service.PessoaService;

@Named
@RequestScoped
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = -7520922911940543207L;

	@Inject
	private PessoaService pessoaService;

	public void salvar(Pessoa pessoa) {
		pessoaService.salvar(pessoa);

		Messages.addGlobalInfo("Pessoa salva com sucesso.");
	}

}
