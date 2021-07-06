package com.game.algorithm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import com.game.model.Jumble;

public class CreatePuzzleJumble {
	private List<Jumble> jmles;
	
	public String permutate(String word)
	{
		Set<Integer> set = new HashSet();
		String result = "";
		Random rand = new Random();
		int s = word.length();
		while(set.size() != s)
		{
			int i = rand.nextInt(s);
			if(! set.contains(i))
			{
				result = result + word.charAt(i);
				set.add(i);
			}
		}
		return result;
	}
	
	public List<Jumble> createPuzzles() throws IOException
	{
		jmles = new ArrayList<>();
		File file = new File("/home/chandan/CHANDAN/projects/WordGames/src/main/resources/jumble.puzzles");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while ((st = br.readLine()) != null)
		{
			String[] words = st.split("#", 2);
			System.out.println(words[0] + " " + words[1]);
			Jumble j = new Jumble();
			j.setDesc(words[1].toUpperCase());
			j.setWord(words[0].toUpperCase());
			j.setPword(permutate(words[0]).toUpperCase());
			
			jmles.add(j);
		}
		return jmles;
	}

}
