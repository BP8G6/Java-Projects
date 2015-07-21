package com.teamf.cricket.dao;

import java.util.List;

import com.teamf.cricket.domain.CarouselNews;
import com.teamf.cricket.domain.Committee;
import com.teamf.cricket.domain.CricketMetrics;
import com.teamf.cricket.domain.PlayerStats;
import com.teamf.cricket.domain.Players;

public interface CricketDao {

	public List<Players> getAllPlayers();
	public List<Players> getPlayerByType(String str);
	public List<Players> getPlayerByState(String str);
	public List<Players> searchPlayerByQuery(String query);
	
	public List<Players> getPlayerById(Long id);
	
	public void updatePlayerStats(Long id,PlayerStats playerstats);//after clicking update button redirects to update page by player id
	public void saveUpdatedStats(Players playerstats);//to save the stats of existing player 
	public void addPlayerDetails(Players player);// to add player
	public void addCommitteeDetails(Committee committee);
	public List<CricketMetrics> getCricketMetricByType();
	public String getChartDataByType();
	public String getChartDataByState();
	public List<CarouselNews> getCarouselNews();
	public List<PlayerStats> getPlayerStatsById(Long id);
}
