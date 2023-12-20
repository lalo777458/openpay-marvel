package com.op.marvel.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.op.marvel.service.IBitacoraService;
import com.op.marvel.service.IMarvelCharacterService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/openpay")
public class OpenPayMarvelController {
	

	@Autowired
	private IMarvelCharacterService iMarvelCharacterService;
	
	@Autowired
	private IBitacoraService iBitacoraService;
	
	@GetMapping
	public ResponseEntity<?> getCharacters() {
		return iMarvelCharacterService.getCharacters();
	}
	
	@GetMapping("{characterId}")
	public ResponseEntity<?> getCharacterById(@PathVariable(value = "characterId") Integer characterId){
		return iMarvelCharacterService.getCharacterById(characterId);
		
	}
	
	@GetMapping("/bitacora")
	public List<BitacoraDto> getBitacora(){
		return iBitacoraService.getBitacora();
		
	}
	
}
