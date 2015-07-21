package com.teamf.cricket.domain;

import java.io.Serializable;

public class CricketMetrics implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5714981302242255305L;
	private String playerType;
	private String playerState;
	private Long count;
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	public String getPlayerState() {
		return playerState;
	}
	public void setPlayerState(String playerState) {
		this.playerState = playerState;
	}
	public Long getCount() {
		return count;
	}
	public void setCount(Long count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "CricketMetrics [playerType=" + playerType + ", playerState="
				+ playerState + ", count=" + count + "]";
	}
	
	
	
	
	

}
