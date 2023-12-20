package com.op.marvel.service.impl;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.op.marvel.service.IMarvelService;

@Service
public class MarvelServiceImpl implements IMarvelService {

	@Autowired
	private RestTemplate restTemplate;

	@Value("${apikey.value.open.pay.marvel}")
	private String apikey;

	@Value("${hash.value.open.pay.marvel}")
	private String hash;

	@Value("${url.marvel}")
	private String urlMarvel;

	@Override
	public ResponseEntity<?> getCharacters() {
		URI uri = UriComponentsBuilder.fromUriString(urlMarvel)
				.queryParam("ts", "1")
				.queryParam("apikey", apikey)
				.queryParam("hash", hash).build().toUri();

		String json = restTemplate.getForObject(uri, String.class);
		Gson gson = new Gson();
		Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>() {
		}.getType());

//	    Assert.assertEquals(character.getName(), map.get("data"));
//		System.out.println(map.get("data"));
		
		return new ResponseEntity<>(map.get("data"), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<?> getCharacterById(Integer id) {
		URI uri = UriComponentsBuilder.fromUriString(urlMarvel + "/" + id.toString())
				.queryParam("ts", "1")
				.queryParam("apikey", apikey)
				.queryParam("hash", hash)
				.build().toUri();

		String json = restTemplate.getForObject(uri, String.class);
		Gson gson = new Gson();
		Map<String, Object> map = gson.fromJson(json, new TypeToken<Map<String, Object>>() {
		}.getType());
		return new ResponseEntity<>(map.get("data"), HttpStatus.OK);

	}

}
