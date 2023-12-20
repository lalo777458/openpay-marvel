package com.op.marvel.dto;

import java.io.Serializable;
import java.util.Date;

import com.op.marvel.entity.Bitacora;

public class BitacoraDto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer idBit;

	private String servicio;

	private Date fechaReg;

	public BitacoraDto() {
		super();
	}

	public BitacoraDto(Bitacora obj) {
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
