package br.com.alura.mvc.mudi.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Oferta {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private BigDecimal valor;
	
	private LocalDate dataDaEntrega;
	
	private String comentario;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Pedido pedido;

}
