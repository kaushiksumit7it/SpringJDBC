package comdb.SpringBootUsingJdbc.controller;
import comdb.SpringBootUsingJdbc.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import comdb.SpringBootUsingJdbc.service.PlayerService;

@Controller
@RequestMapping("/")
@ComponentScan("comdb.SpringBootUsingJdbc")
public class PlayerController {

	@Autowired
	PlayerService  ps;
	
	@GetMapping("pAdd")
	public String NewPlayer()
	{
		return "AddNewPlayer";
	}
		
	@PostMapping("addplayer")
	public String NewPlayer(@RequestParam String txtPname,
			@RequestParam String ddlgame,
			@RequestParam String txtCountry,
			Model m)	
	{
		System.out.println(txtPname);
		Player p = new Player(0, txtPname, ddlgame, txtCountry);
		String res = ps.AddNewPlayer(p);
		if(res.equals("Success"))
		{
			m.addAttribute("info", "Row Added....");
		}
		else
		{
			m.addAttribute("info", "Row Not Added....");
		}
		return "AddNewPlayer";
	}
	
	/*
	@PostMapping("addplayer")
	public String NewPlayer(@ModelAttribute  Player plr,
			Model m)	
	{		
		String res = ps.AddNewPlayer(plr);
		if(res.equals("Success"))
		{
			m.addAttribute("info", "Row Added....");
		}
		else
		{
			m.addAttribute("info", "Row Not Added....");
		}
		return "AddNewPlayer";
	}
	*/
}
