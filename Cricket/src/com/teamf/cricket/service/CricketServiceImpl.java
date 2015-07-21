package com.teamf.cricket.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teamf.cricket.dao.CricketDao;
import com.teamf.cricket.domain.CarouselNews;
import com.teamf.cricket.domain.Committee;
import com.teamf.cricket.domain.CricketMetrics;
import com.teamf.cricket.domain.PlayerStats;
import com.teamf.cricket.domain.Players;

@Service
public class CricketServiceImpl implements CricketService {

	@Autowired
	private CricketDao cricketdao;

	@Override
	public List<Players> getAllPlayers() {		
		return cricketdao.getAllPlayers();
		
	}

	@Override
	public List<Players> getPlayerByType(String str) {
		
		return cricketdao.getPlayerByType(str);
	}

	@Override
	public List<Players> getPlayerByState(String str) {
		
		return cricketdao.getPlayerByState(str);
	}

	@Override
	public List<Players> searchPlayerByQuery(String query) {
		// TODO Auto-generated method stub
		return cricketdao.searchPlayerByQuery(query);
	}

	@Override
	public List<Players> getPlayerById(Long id) {
		// TODO Auto-generated method stub
		return cricketdao.getPlayerById(id);
	}

	@Override
	public void updatePlayerStats(Long id,PlayerStats playerstats) {
		// TODO Auto-generated method stub
		cricketdao.updatePlayerStats(id,playerstats);
	}

	@Override
	public void saveUpdatedStats(Players playerstats) {
		// TODO Auto-generated method stub
		cricketdao.saveUpdatedStats(playerstats);
	}

	@Override
	public void addPlayerDetails(Players player) {
		// TODO Auto-generated method stub
		cricketdao.addPlayerDetails(player);
	}

	@Override
	public void addCommitteeDetails(Committee committee) {
		// TODO Auto-generated method stub
	cricketdao.addCommitteeDetails(committee);	
	}
	
	public List<CricketMetrics> getCricketMetricByType(){
		
		return cricketdao.getCricketMetricByType();
	}

	@Override
	public String getChartDataByType() {
		// TODO Auto-generated method stub
		return cricketdao.getChartDataByType();
	}

	@Override
	public String getChartDataByState() {
		// TODO Auto-generated method stub
		return cricketdao.getChartDataByState();
	}

	@Override
	public List<PlayerStats> getPlayerStatsById(Long id) {
		// TODO Auto-generated method stub
		return cricketdao.getPlayerStatsById(id);
	}
	 @Override
	public List<CarouselNews> getCarouselNews() {
		// TODO Auto-generated method stub
		return cricketdao.getCarouselNews();
	}
	}

