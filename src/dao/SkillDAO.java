
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Skill;
import utility.ConnectionManager;

public class SkillDAO{
	public Skill getSkillBylD(Long id) throws Exception {
		
		ConnectionManager cm=new ConnectionManager();
		Connection con=cm.getConnection();
		Skill skill=null;
		String sql="SELECT name FROM SKILL where id="+id;
		
		Statement stmt=con.createStatement();
		
		ResultSet rs=stmt.executeQuery(sql);
		
		while(rs.next()) {
			
			skill=new Skill();
			skill.setSkillName(rs.getString("name"));
		}
	//System.out.println(skill.getSkillName());
		con.close();
		rs.close();
		stmt.close();
		return skill;
	}
	
}
