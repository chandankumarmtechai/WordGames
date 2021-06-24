package com.game.algorithm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.game.model.Jumble;

public class CreatePuzzleJumbleTest {
	CreatePuzzleJumble cpj;
	
	@Test
	public void test1() throws IOException
	{
		cpj = new CreatePuzzleJumble();
		List<Jumble> list = cpj.createPuzzles();
		for (Jumble j : list) 
		 {
			System.out.println(j.getWord());
			System.out.println(j.getDesc());
			System.out.println(j.getPword());
		 }
		assertTrue(true);
	}
}
