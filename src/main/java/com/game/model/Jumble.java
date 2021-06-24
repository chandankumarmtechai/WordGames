package com.game.model;

public class Jumble {

	private String word;
	private String pword;
	private String desc;
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Jumble()
	{
		
	}
	public Jumble(String word, String pword, String desc) {
		super();
		this.word = word;
		this.pword = pword;
		this.desc = desc;
	}
	
}
