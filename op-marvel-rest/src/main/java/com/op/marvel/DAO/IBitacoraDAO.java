package com.op.marvel.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.op.marvel.entity.Bitacora;

public interface IBitacoraDAO extends JpaRepository<Bitacora, Integer> {
	
	List<Bitacora> findAllByOrderByIdBitDesc();

}
