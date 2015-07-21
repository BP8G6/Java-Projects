package com.teamf.cricket.domain;

import java.io.Serializable;

public class PlayerStats implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3840980789464048978L;
	private Long id;
	private int no_mathches;
	private int no_runs;
	private int no_wickets;
	private int ecomnomy;
	private float average;
	private float strikerate;
	
	
	
	
	public PlayerStats() {
		super();
	}


	public PlayerStats(int no_mathches, int no_runs, int no_wickets,
			int ecomnomy, float average, float strikerate) {
		super();
		this.no_mathches = no_mathches;
		this.no_runs = no_runs;
		this.no_wickets = no_wickets;
		this.ecomnomy = ecomnomy;
		this.average = average;
		this.strikerate = strikerate;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNo_mathches() {
		return no_mathches;
	}
	public void setNo_mathches(int no_mathches) {
		this.no_mathches = no_mathches;
	}
	public int getNo_runs() {
		return no_runs;
	}
	public void setNo_runs(int no_runs) {
		this.no_runs = no_runs;
	}
	public int getNo_wickets() {
		return no_wickets;
	}
	public void setNo_wickets(int no_wickets) {
		this.no_wickets = no_wickets;
	}
	public int getEcomnomy() {
		return ecomnomy;
	}
	public void setEcomnomy(int ecomnomy) {
		this.ecomnomy = ecomnomy;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage(float average) {
		this.average = average;
	}
	public float getStrikerate() {
		return strikerate;
	}
	public void setStrikerate(float strikerate) {
		this.strikerate = strikerate;
	}
	
	@Override
	public String toString() {
		return "PlayerStats [id=" + id + ", no_mathches=" + no_mathches
				+ ", no_runs=" + no_runs + ", no_wickets=" + no_wickets
				+ ", ecomnomy=" + ecomnomy + ", average=" + average
				+ ", strikerate=" + strikerate + "]";
	}
	
	
	
	
}
