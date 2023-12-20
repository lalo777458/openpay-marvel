package com.op.marvel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op.marvel.service.IMarvelService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/characters/")
public class MarvelController {

	@Autowired
	private IMarvelService iMarvelService;

	@GetMapping
	public ResponseEntity<?> getCharacters() {
		return iMarvelService.getCharacters();
	}
	
	@GetMapping("{characterId}")
	public ResponseEntity<?> getCharacterById(@PathVariable(value = "characterId") Integer characterId){
		return iMarvelService.getCharacterById(characterId);
		
	}
	

}
