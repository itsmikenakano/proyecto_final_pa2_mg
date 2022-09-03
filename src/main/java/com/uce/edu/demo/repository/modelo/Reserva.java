package com.uce.edu.demo.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class Reserva {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rese_id_seq")
	@SequenceGenerator(name = "rese_id_seq", sequenceName = "rese_id_seq", allocationSize = 1)
	@Column(name = "rese_id")
	private Integer id;

	@Column(name = "rese_fecha_inicio")
	private LocalDateTime fechaInicio;

	@Column(name = "rese_fecha_fin")
	private LocalDateTime fechaFin;

	@Column(name = "rese_valor_subtotal")
	private BigDecimal subtotal;

	@Column(name = "rese_valor_iva")
	private BigDecimal valorIva;

	@Column(name = "rese_valor_total")
	private BigDecimal valorTotal;

	@ManyToOne
	@JoinColumn(name = "rese_cliente_id")
	private Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "rese_vehiculo_id")
	private Vehiculo vehiculo;

}
