package com.practice.regform.dao;

import java.util.List;

import com.practice.regform.domain.RegForm;
import com.practice.regform.domain.RegForm2;

public interface RegFormDao {
	
	public void printRegForm();
	public List<RegForm> printRegDet();
	public List<RegForm2> pringRegUsngBean();
	public void saveDetails(RegForm reg);
	public RegForm getDetailsById(Long regid);

}
