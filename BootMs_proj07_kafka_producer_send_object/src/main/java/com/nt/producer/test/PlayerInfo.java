package com.nt.producer.test;

public class PlayerInfo {

	private String playerName;
	private Integer jersyNo;
	private String teamName;
	public PlayerInfo(String playerName, Integer jersyNo, String teamName) {
		super();
		this.playerName = playerName;
		this.jersyNo = jersyNo;
		this.teamName = teamName;
	}
	@Override
	public String toString() {
		return "PlayerInfo [playerName=" + playerName + ", jersyNo=" + jersyNo + ", teamName=" + teamName + "]";
	}
	
	
	
}
