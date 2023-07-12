package com.gamesSuper.gslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gamesSuper.gslist.dto.GameDTO;
import com.gamesSuper.gslist.dto.GameMinDTO;
import com.gamesSuper.gslist.services.GameService;

@RestController
@RequestMapping(value = "/games") // configurando o caminho que sera acessado na API
public class GameController {

	@Autowired
	private GameService gameService;

	@GetMapping(value = "/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
	}

	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
}
