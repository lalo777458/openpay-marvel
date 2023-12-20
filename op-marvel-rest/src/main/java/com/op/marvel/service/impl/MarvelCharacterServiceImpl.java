package com.op.marvel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.op.marvel.DAO.IBitacoraDAO;
import com.op.marvel.entity.Bitacora;
import com.op.marvel.service.IMarvelCharacterService;

@Service
public class MarvelCharacterServiceImpl implements IMarvelCharacterService {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private IBitacoraDAO iBitacoraDAO;

	@Override
	public ResponseEntity<?> getCharacters() {
		ResponseEntity<?> response = restTemplate.getForEntity("http://localhost:8081/characters/", Object.class);
		iBitacoraDAO.save(new Bitacora("Consulta de Servicio general"));
		return response;
	}

	@Override
	public ResponseEntity<?> getCharacterById(Integer id) {

		String url = "http://localhost:8081/characters/" + id;
		ResponseEntity<?> response = restTemplate.exchange(url, HttpMethod.GET, null, Object.class);
		iBitacoraDAO.save(new Bitacora("Consulta de servicio por id: " + id));
		return response;
	}

}
