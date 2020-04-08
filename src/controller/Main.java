
package controller;

import java.util.ArrayList;
import java.util.List;

import dao.PlayerDAO;
import dao.SkillDAO;
import model.Player;
import model.Skill;

public class Main{
	public static void main(String[] args) throws Exception {
		Skill skill=new Skill();
		PlayerDAO playerdao=new PlayerDAO();
		SkillDAO skilldao=new SkillDAO();
		
		System.out.println("List of all players and their skill");
		
		Player player=new Player();
		
		List<Player> list=new ArrayList<Player>();
		
		list=playerdao.getAllPlayers();

		for(int i=0;i<list.size();i++) {
			
			
		System.out.println(list.get(i).getPlayerld()+"  "+list.get(i).getName()+" "+list.get(i).getCountry()+" "+skilldao.getSkillBylD(list.get(i).getSkill().getSkillId()).getSkillName());
	}
}
}