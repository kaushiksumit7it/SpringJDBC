package comdb.SpringBootUsingJdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import comdb.SpringBootUsingJdbc.entity.Player;

@Service
public class PlayerServiceImpl implements PlayerService {

	@Autowired
	JdbcTemplate jt;
	
	public String AddNewPlayer(Player plr) {		
		String Query = "Insert into Player(plrname, gametype, country) values(?, ?,?)";
		int r = jt.update(Query, new Object[] {plr.getPlrname(), plr.getGametype(), plr.getCountry()});
		if(r>=1)
			return "Success";
		else
			return "Error";		
	}

	public List<Player> AllPlayers() {
		 String sql = "SELECT * FROM Player";
	     List<Player> plr = jt.query(sql, new BeanPropertyRowMapper(Player.class));
	     return plr;			
	}
}
