package com.practice.regform.service;

import java.util.List;

import com.practice.regform.dao.RegFormDao;
import com.practice.regform.domain.RegForm;
import com.practice.regform.domain.RegForm2;


public class RegFormServiceImpl implements RegFormService {

	private RegFormDao regformdao;
	
	
	
	public void setRegformdao(RegFormDao regformdao) {
		this.regformdao = regformdao;
	}


	@Override
	public void printRegForm() {
		
		regformdao.printRegForm();		
	}


	@Override
	public List<RegForm> printRegDet() {
		return regformdao.printRegDet();
	}


	@Override
	public List<RegForm2> pringRegUsngBean() {
		// TODO Auto-generated method stub
		return regformdao.pringRegUsngBean();
	}


	@Override
	public void saveDetails(RegForm reg) {
		// TODO Auto-generated method stub
		regformdao.saveDetails(reg);
		
	}


	@Override
	public RegForm getDetailsById(Long regid) {
		// TODO Auto-generated method stub
		return regformdao.getDetailsById(regid);
	}


	

}
