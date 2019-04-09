package es.codeurjc.ais.tictactoe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
public class StatisticController {	
	
	@RequestMapping("/stats")
	public static String stats(Model modelo) {
		System.out.println("pene");
		
		
		return "stats.html";
	}
}


