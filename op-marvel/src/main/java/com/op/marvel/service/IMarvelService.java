package com.op.marvel.service;

import org.springframework.http.ResponseEntity;

public interface IMarvelService {

	public ResponseEntity<?> getCharacters();

	public ResponseEntity<?> getCharacterById(Integer id);

}
