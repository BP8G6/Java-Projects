package com.teamf.cricket.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;







import com.teamf.cricket.domain.Committee;
import com.teamf.cricket.domain.PlayerStats;
import com.teamf.cricket.domain.Players;
import com.teamf.cricket.service.CricketService;

@Controller
public class CricketController {
	
	@Autowired
	private CricketService cricketservice;
	
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public ModelAndView getWelcomePage()
	{
		
		ModelAndView mav = new ModelAndView("index");		
		mav.addObject("carouselnews", cricketservice.getCarouselNews());
			
		return mav;
		
	}
	
	@RequestMapping(value="/dashboard", method=RequestMethod.GET)
	public ModelAndView getDashBoard()
	{
		ModelAndView mav = new ModelAndView("dashboard");
		mav.addObject("getchartbytype", cricketservice.getChartDataByType());
		mav.addObject("getchartbystate", cricketservice.getChartDataByState());
		mav.addObject("allplayers",cricketservice.getAllPlayers());
		
		return mav;
	}
	
	
	@RequestMapping(value="/search", method=RequestMethod.POST)
	public ModelAndView getSearchResults(@RequestParam("query")String query)
	{
		ModelAndView mav = new ModelAndView("dashboard");

		mav.addObject("getchartbytype", cricketservice.getChartDataByType());
		mav.addObject("getchartbystate", cricketservice.getChartDataByState());
		mav.addObject("allplayers",cricketservice.searchPlayerByQuery(query));
		
		return mav;
	}
	
	
	
	
	//For Geting Player Detailed Information 
	@RequestMapping(value="/playerinfo",method=RequestMethod.GET)
	public ModelAndView getNewsPage(@RequestParam("id")Long id)
	{
		ModelAndView mav = new ModelAndView("playerinformation");
		Players p=new Players();
		PlayerStats h=new PlayerStats();
		 p = cricketservice.getPlayerById(id).get(0);		
		mav.addObject("playerinfodet",p);		
		h=cricketservice.getPlayerStatsById(id).get(0);
		mav.addObject("playerstatsinfodet",h);
		 //System.out.println(h);
		
		return mav;
	}
	
	@RequestMapping(value="/updateStats",method=RequestMethod.GET)
	public ModelAndView updateStats(@RequestParam("id")Long id){		
		ModelAndView mav = new ModelAndView("updateplayerstats");
		PlayerStats playstats=new PlayerStats();
		mav.addObject("playstats",playstats);
		mav.addObject("updateplayerinfo",cricketservice.getPlayerById(id).get(0));
	
		return mav;
	}
	
	
	//TODO
	@RequestMapping(value="/updateStats",method=RequestMethod.POST)
	public ModelAndView updatePlayerStats(@RequestParam("id")Long id,@ModelAttribute("playstats")PlayerStats playstats){
		//
		
		System.out.println(playstats);
		ModelAndView mav = new ModelAndView("playerinformation");
		Players p=new Players();
		PlayerStats h=new PlayerStats();
		 p = cricketservice.getPlayerById(id).get(0);		
		mav.addObject("playerinfodet",p);		
		h=cricketservice.getPlayerStatsById(id).get(0);
		mav.addObject("playerstatsinfodet",h);		
		
		cricketservice.updatePlayerStats(id, playstats);
		System.out.println(id);
		return mav;
	}
	
	
	@RequestMapping(value="/addCommittee",method=RequestMethod.GET)
	public ModelAndView getPlayerStatstoUpdate(){
		ModelAndView mav = new ModelAndView("addcommittee");
		Committee committee = new Committee();
		mav.addObject(committee);
		
		List<String> degtype = new ArrayList<String>();
		degtype.add("vice president");
		degtype.add("president");
		degtype.add("Honorary Secretary");
		degtype.add("Honorary Treasurer");		
		mav.addObject("degtypes", degtype);
		System.out.println("hey");
		return mav;
	}
	
	
	
	@RequestMapping(value="/addCommittee",method=RequestMethod.POST)
	public ModelAndView saveCommitteeDetails(@ModelAttribute("committee")Committee committee){		
		cricketservice.addCommitteeDetails(committee);
		ModelAndView mav = new ModelAndView("index");
		
		return mav;
	}
	
	@RequestMapping(value="/addPlayer",method=RequestMethod.GET)
	public ModelAndView getPlayerdetToSave()
	{
		ModelAndView mav = new ModelAndView("addplayers");
		Players play = new Players();
		mav.addObject("play",play);
		
		
		List<String> playertype = new ArrayList<String>();
		playertype.add("Bowler");
		playertype.add("Batsman");
		playertype.add("Wicket Keeper");
		playertype.add("Allrounder");		
		mav.addObject("playertypes", playertype);
		
		List<String> statetype = new ArrayList<String>();
		statetype.add("Andhra Pradesh");
		statetype.add("Telangana");
		statetype.add("Delhi");
		statetype.add("Karnataka");
		statetype.add("Tamilnadu");	
		statetype.add("Mumbai");	
		statetype.add("Kolkata");
		statetype.add("Madhya Pradesh");	
		mav.addObject("statetypes", statetype);	
		
		mav.addObject("allplayers",cricketservice.getAllPlayers());
		
		return mav;
	}
		
	
	@RequestMapping(value="/addPlayer",method=RequestMethod.POST)
	public ModelAndView savePlayerDetails(@ModelAttribute("play")Players play){		
		System.out.println(play);
		cricketservice.addPlayerDetails(play);
		//cricketservice.saveUpdatedStats(play);
		ModelAndView mav = new ModelAndView("index");
		
		return mav;
	}
	
	
	
	
	
	
	
	
	
	
	
	@RequestMapping(value="/playersbytype",method=RequestMethod.GET)
	public ModelAndView getPlayersByTypeByChartClick(@RequestParam("type")String type){
		
		ModelAndView mav = new ModelAndView("dashboard");
		mav.addObject("getchartbytype", cricketservice.getChartDataByType());
		mav.addObject("getchartbystate", cricketservice.getChartDataByState());		
		mav.addObject("allplayers",cricketservice.getPlayerByType(type));
		
		
		return mav;
	}
	
	@RequestMapping(value="/playersbystate",method=RequestMethod.GET)
	public ModelAndView getPlayersByStateByChartClick(@RequestParam("state")String state){
		
		ModelAndView mav = new ModelAndView("dashboard");
		mav.addObject("getchartbytype", cricketservice.getChartDataByType());
		mav.addObject("getchartbystate", cricketservice.getChartDataByState());	
		mav.addObject("allplayers",cricketservice.getPlayerByState(state));
		
		
		
		return mav;
	}
	

}
