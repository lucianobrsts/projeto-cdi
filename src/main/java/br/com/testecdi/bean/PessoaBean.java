package br.com.testecdi.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.testecdi.domain.Pessoa;
import br.com.testecdi.repository.PessoaRepository;
import br.com.testecdi.service.NegocioException;
import br.com.testecdi.util.FacesUtil;
import br.com.testecdi.util.Transactional;
import lombok.Data;

@Named(value = "pessoaBean")
@SessionScoped
@Data
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = -7520922911940543207L;

	@Inject
	private PessoaRepository pessoaRepository;

	@Inject
	private Pessoa pessoaCadastro;

	private List<Pessoa> listaPessoas;

	@Transactional
	public void salvar() throws NegocioException {
		System.out.println("--------------------------------------");
		System.out.println(pessoaCadastro.getCodigo());
		System.out.println(pessoaCadastro.getNome());
		System.out.println("--------------------------------------");
		
		this.pessoaRepository.salvar(pessoaCadastro);
		this.pessoaCadastro = new Pessoa();
		FacesUtil.adicionarMensagem(FacesMessage.SEVERITY_INFO, "Endereço salvo com sucesso!");
	}

	public void consultar() {
		this.listaPessoas = pessoaRepository.todos();
	}

}
