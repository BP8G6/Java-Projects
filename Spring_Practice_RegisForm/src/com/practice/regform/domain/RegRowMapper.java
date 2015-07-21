package com.practice.regform.domain;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



public class RegRowMapper implements RowMapper {

	@Override
	public RegForm mapRow(ResultSet arg0, int arg1) throws SQLException {
		
		RegForm n = new RegForm();
		n.setID(arg0.getInt(1));
		n.setFName(arg0.getString(2));
		n.setLName(arg0.getString(3));
		n.setGender(arg0.getString(4));
		n.setPhno(arg0.getString(5));
		n.setEmail(arg0.getString(6));
		n.setAddr(arg0.getString(7));
		n.setCity(arg0.getString(8));
		n.setState(arg0.getString(9));
		n.setPin(arg0.getInt(10));
				
		return n;
	}

}
