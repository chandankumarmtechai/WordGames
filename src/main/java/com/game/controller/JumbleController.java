package com.game.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.game.algorithm.CreatePuzzleJumble;
import com.game.model.Jumble;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
public class JumbleController {
	private CreatePuzzleJumble cpj;
	
	@RequestMapping("/puzzlesjumble")
	public List<Jumble> getPuzzles() throws IOException
	{
		cpj = new CreatePuzzleJumble();
		return cpj.createPuzzles();
	}

}
