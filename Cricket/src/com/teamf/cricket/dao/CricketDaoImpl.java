package com.teamf.cricket.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;







import com.teamf.cricket.domain.CarouselNews;
import com.teamf.cricket.domain.Committee;
import com.teamf.cricket.domain.CricketMetrics;
import com.teamf.cricket.domain.PlayerStats;
import com.teamf.cricket.domain.Players;

@Repository
public class CricketDaoImpl implements CricketDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Players> getAllPlayers() {		
		
		return jdbcTemplate.query("Select * From Players", new BeanPropertyRowMapper<Players>(Players.class));
		
		//System.out.println(jdbcTemplate.query("Select * From Players", new BeanPropertyRowMapper<Players>(Players.class)));
		
	}

	@Override
	public List<Players> getPlayerByType(String str) {
		
		//System.out.println(jdbcTemplate.query("Select * From Players Where type= ?",new Object[]{str}, new BeanPropertyRowMapper<Players>(Players.class)));
		return jdbcTemplate.query("Select * From Players Where type= ?",new Object[]{str}, new BeanPropertyRowMapper<Players>(Players.class));
		
	}

	@Override
	public List<Players> getPlayerByState(String str) {
		
		//System.out.println(jdbcTemplate.query("Select * From Players Where state= ?",new Object[]{str}, new BeanPropertyRowMapper<Players>(Players.class)));
		return jdbcTemplate.query("Select * From Players Where state= ?",new Object[]{str}, new BeanPropertyRowMapper<Players>(Players.class));
				
	}

	@Override
	public List<Players> searchPlayerByQuery(String query) {
		
		String str="Select * From Players Where upper(fname) Like upper('%"+query+"%')";
		return jdbcTemplate.query(str,new BeanPropertyRowMapper<Players>(Players.class));
	}

	@Override
	public List<Players> getPlayerById(Long id) {
		//System.out.println(jdbcTemplate.query("Select * From Players Where id= ?",new Object[]{id}, new BeanPropertyRowMapper<Players>(Players.class)));
		return jdbcTemplate.query("Select * From Players Where id= ?",new Object[]{id}, new BeanPropertyRowMapper<Players>(Players.class));
				
	}

	@Override
	public void updatePlayerStats(Long id, PlayerStats playerstats) {
		// TODO Auto-generated method stub		
		
		jdbcTemplate.update("update player_stats set no_mathches=?,no_runs=?,no_wickets=?,ecomnomy=?,average=?,strike_rate=? where id="+id,new Object[]{playerstats.getNo_mathches(),playerstats.getNo_runs(),playerstats.getNo_wickets(),playerstats.getEcomnomy(),playerstats.getAverage(),playerstats.getStrikerate()});
		
	}

	@Override
	public void saveUpdatedStats(Players playerstats) {

		String insertSQl="Insert Into player_stats(id,no_mathches,no_runs,no_wickets,ecomnomy,average,strike_rate)"+ 
				"Values(?,?,?,?,?,?,?)";
		jdbcTemplate.update(insertSQl,new Object[]{playerstats.getId(),0,0,0,0,0,0});
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public void addPlayerDetails(Players player) {
		// TODO Auto-generated method stub
		
		String insertSQl="Insert Into players(fname,lname,dob,type,state,year_of_joining,height,description,status,imageurl)"+ 
				"Values(?,?,?,?,?,?,?,?,?,?)";
		
								
		jdbcTemplate.update(insertSQl,new Object[]{player.getFname(),player.getLname(),player.getDob(),player.getType(),player.getState(),player.getYear_of_joining(),player.getHeight(),player.getDescription(),player.getStatus(),player.getImageurl()});
		int krish=jdbcTemplate.queryForInt("select id from players where id=(select max(id) from players)");
		String str="Insert Into player_stats(id,no_mathches,no_runs,no_wickets,ecomnomy,average,strike_rate)"+ 
		"Values(?,?,?,?,?,?,?)";
		
jdbcTemplate.update(str,new Object[]{krish,0,0,0,0,0,0});
			
		
		
	}
	@Override
	public List<CarouselNews> getCarouselNews() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select * from images", new BeanPropertyRowMapper<CarouselNews>(CarouselNews.class));
	}

	@Override
	public void addCommitteeDetails(Committee committee) {
		
		String insertSQl="Insert Into committee(cfname,clname,cdesignation,cdoj,cdescription) Values(?,?,?,?,?)";
		System.out.println(committee);
								
				jdbcTemplate.update(insertSQl,new Object[]{committee.getCfname(),committee.getClname(),committee.getCdesignation(),committee.getCdoj(),committee.getCdescription()});
				
		
	}
	
	public List<CricketMetrics> getCricketMetricByType()
	{
		return jdbcTemplate.query("Select type AS \"playerType\", count(*) AS \"Count\" from players group by type", new BeanPropertyRowMapper<CricketMetrics>(CricketMetrics.class));
		
	}
	
	public List<CricketMetrics> getCricketMetricByState()
	{
		return jdbcTemplate.query("Select state AS \"playerState\", count(*) AS \"Count\" from players group by state", new BeanPropertyRowMapper<CricketMetrics>(CricketMetrics.class));
		
	}

	@Override
	public String getChartDataByType() {
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(CricketMetrics cm: getCricketMetricByType())
		{
			sb.append("{  y:"+cm.getCount()+", label:\""+cm.getPlayerType()+ "\" },");
			
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public String getChartDataByState() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(CricketMetrics cm: getCricketMetricByState())
		{
			sb.append("{  y:"+cm.getCount()+", label:\""+cm.getPlayerState()+ "\" },");
			
		}
		sb.append("]");
		return sb.toString();
	}

	@Override
	public List<PlayerStats> getPlayerStatsById(Long id) {
		// TODO Auto-generated method stub
		 return jdbcTemplate.query("Select * From Player_stats Where id= ?",new Object[]{id}, new BeanPropertyRowMapper<PlayerStats>(PlayerStats.class));
		
	}
}
