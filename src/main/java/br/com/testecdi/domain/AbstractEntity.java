package br.com.testecdi.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class AbstractEntity implements Serializable {

	private static final long serialVersionUID = -7143167724944850962L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;

}
