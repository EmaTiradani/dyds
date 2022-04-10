package dyds.act2.parte2;

import java.awt.*;
import java.util.List;

public class Club {
	
	private int id;
	private String name;
	private String stadiumName;
	private int foundingYear;
	private Image colours;
	private List<Player> firstDivisionTeam;
	private int currentSeasonWins;
	private int currentSeasonLosses;
	private int currentSeasonGoals;
	private int currentSeasonGoalsReceived;

	private long localRepoTimeStamp;
	
	public Club(int id, String name, String home, int year) {
		super();
		this.id = id;
		this.name = name;
		this.stadiumName = home;
		this.foundingYear = year;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHome() {
		return stadiumName;
	}
	public void setHome(String home) {
		this.stadiumName = home;
	}
	public int getFoundingYear() {
		return foundingYear;
	}
	public void setFoundingYear(int foundingYear) {
		this.foundingYear = foundingYear;
	}
	public Image getColours() {
		return colours;
	}
	public void setColours(Image colours) {
		this.colours = colours;
	}
	public List<Player> getFirstDivisionTeam() {
		return firstDivisionTeam;
	}
	public void setFirstDivisionTeam(List<Player> firstDivisionTeam) {
		this.firstDivisionTeam = firstDivisionTeam;
	}

	public void addMatchInfo(boolean win, int gf, int ga){
		if(win) currentSeasonWins++;
		else currentSeasonLosses++;
		currentSeasonGoalsReceived += ga;
		currentSeasonGoals += gf;
	}

	public long getLocalRepoTimeStamp() {
		return localRepoTimeStamp;
	}

	public void setLocalRepoTimeStamp(long localRepoTimeStamp) {
		this.localRepoTimeStamp = localRepoTimeStamp;
	}
}
