package com.practice.regform.dao;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.practice.regform.domain.RegForm;
import com.practice.regform.domain.RegForm2;
import com.practice.regform.domain.RegRowMapper;


public class RegFormDaoImpl implements RegFormDao {
	
	private JdbcTemplate jdbcTemplate;	
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	public void printRegForm() {
		
		//System.out.println("balakrishna");
		List<Map<String,Object>> data=jdbcTemplate.queryForList("Select * From ponnam_student");
		//System.out.println("balakrishna");
		for(Map<String,Object>row : data)
			for(Map.Entry<String, Object>entry :row.entrySet()){
			
			System.out.println(entry.getKey()+ "  >>>>>> "+entry.getValue());
			}
		
		
	}
	
public List<RegForm> printRegDet() {
		
		List<RegForm> reg = jdbcTemplate.query("Select * From ponnam_student",new RegRowMapper());		
		return reg;

}


public List<RegForm2> pringRegUsngBean() {
	
	//List<RegForm2> reg = jdbcTemplate.query("Select * From ponnam_student",new BeanPropertyRowMapper<RegForm2>(RegForm2.class));
	List<RegForm2> reg = jdbcTemplate.query("Select * From ponnam_student",new BeanPropertyRowMapper<RegForm2>(RegForm2.class));
	System.out.println(reg);
	return reg;
}

public void saveDetails(RegForm reg) {
	
	String insertSQl="Insert Into ponnam_student(std_id,std_fname,std_lname,std_gender,std_phno,std_email,std_address,std_city,std_state,std_pin)"+ 
	"Values(?,?,?,?,?,?,?,?,?,?)";
	
	jdbcTemplate.update(insertSQl,new Object[]{reg.getID(),reg.getFName(),reg.getLName(),reg.getGender(),reg.getPhno(),reg.getEmail(),reg.getAddr(),reg.getCity(),reg.getState(),reg.getPin()});
}

public RegForm getDetailsById(Long regid)
{
	RegForm reg = jdbcTemplate.queryForObject("Select * From ponnam_student Where std_id=?", new Object[] {regid},new RegRowMapper());		
	
	return reg;
}


}
