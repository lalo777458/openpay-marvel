package com.op.marvel.service;

import org.springframework.http.ResponseEntity;

public interface IMarvelCharacterService {
	
	public ResponseEntity<?> getCharacters();
	public ResponseEntity<?> getCharacterById(Integer id);

}
