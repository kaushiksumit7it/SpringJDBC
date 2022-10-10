package comdb.SpringBootUsingJdbc.service;
import java.util.List;
import comdb.SpringBootUsingJdbc.entity.*;

public interface PlayerService {
	public String AddNewPlayer(Player plr);
	public List<Player> AllPlayers();
}
