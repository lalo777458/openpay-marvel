package com.op.marvel.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.op.marvel.DAO.IBitacoraDAO;
import com.op.marvel.dto.BitacoraDto;
import com.op.marvel.service.IBitacoraService;

@Service
public class BitacoraServiceImpl implements IBitacoraService{
	
	@Autowired
	private IBitacoraDAO iBitacoraDAO;

	@Override
	public List<BitacoraDto> getBitacora() {
		return iBitacoraDAO.findAllByOrderByIdBitDesc().stream().map(BitacoraDto::new).collect(Collectors.toList());
	}

}
