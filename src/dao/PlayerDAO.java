package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Player;
import model.Skill;
import utility.ConnectionManager;

public class PlayerDAO{
	public List< Player > getAllPlayers() throws Exception{
		List<Player> list=new ArrayList<Player>();
		ConnectionManager cm=new ConnectionManager();
		Connection con=cm.getConnection();
		Player player=null;
		Skill skill=null;
		String sql="SELECT * FROM PLAYER";
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			player=new Player();
			skill=new Skill();
			  player.setPlayerld(rs.getLong("id"));
		      player.setName(rs.getString("name"));
		      player.setCountry(rs.getString("country"));
		      skill.setSkillId(rs.getLong("skill_id"));
		      player.setSkill(skill);
			list.add(player);
		}
		
		con.close();
		rs.close();
		stmt.close();
		return list;
	}
}
