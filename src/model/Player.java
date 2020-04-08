
package model;


public class Player{
	long playerld;
	String name; 
	String country; 
	Skill skill;
	public long getPlayerld() {
		return playerld;
	}
	public void setPlayerld(long playerld) {
		this.playerld = playerld;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Skill getSkill() {
		return skill;
	}
	public void setSkill(Skill skill) {
		this.skill = skill;
	}
}
