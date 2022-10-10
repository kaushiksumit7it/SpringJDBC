package comdb.SpringBootUsingJdbc.entity;
/*
 * Create table Player(pid int auto_increment primary key, 
		 plrname varchar(20), 
		 gametype varchar(10), 
		 country varchar(20));
 */
public class Player {

	private int pid;
	private String plrname;
	private String gametype;
	private String country;
		
	public Player() {
		super();
	}
	
	public Player(int pid, String plrname, String gametype, String country) {
		super();
		this.pid = pid;
		this.plrname = plrname;
		this.gametype = gametype;
		this.country = country;
	}
		
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPlrname() {
		return plrname;
	}
	public void setPlrname(String plrname) {
		this.plrname = plrname;
	}
	public String getGametype() {
		return gametype;
	}
	public void setGametype(String gametype) {
		this.gametype = gametype;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
