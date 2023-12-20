package com.op.marvel.entity;


import java.io.Serializable;
import java.util.Date;

import com.op.marvel.dto.BitacoraDto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;

@Entity
@Table(name = "bitacora")
public class Bitacora implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_bit")
	private Integer idBit;
	
	private String servicio;
	
	@Column(name = "fecha_reg")
	private Date fechaReg;
	
	@PrePersist
	public void prepersist() {
		this.fechaReg = new Date();
	}

	public Bitacora() {
		super();
	}
	
	public Bitacora(String servicio) {
		super();
		this.servicio = servicio;
	}
	
	public Bitacora(BitacoraDto obj) {
		super();
		this.idBit = obj.getIdBit();
		this.servicio = obj.getServicio();
		this.fechaReg = obj.getFechaReg();
	}

	public Integer getIdBit() {
		return idBit;
	}

	public void setIdBit(Integer idBit) {
		this.idBit = idBit;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public Date getFechaReg() {
		return fechaReg;
	}

	public void setFechaReg(Date fechaReg) {
		this.fechaReg = fechaReg;
	}
	
	
	
	
}
