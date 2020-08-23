package br.com.testecdi.bean;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class PessoaBean implements Serializable {

	private static final long serialVersionUID = -7520922911940543207L;

}
