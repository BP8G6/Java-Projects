package com.teamf.cricket.domain;

import java.io.Serializable;

public class Committee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6418241225091766056L;
	private Long cid;
	private String cfname;
	private String clname;
	private String cdesignation;
	private String cdoj;
	private String cdescription;
	
	public Committee(Long cid, String cfname, String clname,
			String cdesignation, String cdoj, String cdescription) {
		super();
		this.cid = cid;
		this.cfname = cfname;
		this.clname = clname;
		this.cdesignation = cdesignation;
		this.cdoj = cdoj;
		this.cdescription = cdescription;
	}

	public Committee() {
		super();
	}

	public Long getCid() {
		return cid;
	}

	public void setCid(Long cid) {
		this.cid = cid;
	}

	public String getCfname() {
		return cfname;
	}

	public void setCfname(String cfname) {
		this.cfname = cfname;
	}

	public String getClname() {
		return clname;
	}

	public void setClname(String clname) {
		this.clname = clname;
	}

	public String getCdesignation() {
		return cdesignation;
	}

	public void setCdesignation(String cdesignation) {
		this.cdesignation = cdesignation;
	}

	public String getCdoj() {
		return cdoj;
	}

	public void setCdoj(String cdoj) {
		this.cdoj = cdoj;
	}

	public String getCdescription() {
		return cdescription;
	}

	public void setCdescription(String cdescription) {
		this.cdescription = cdescription;
	}

	@Override
	public String toString() {
		return "Committee [cid=" + cid + ", cfname=" + cfname + ", clname="
				+ clname + ", cdesignation=" + cdesignation + ", cdoj=" + cdoj
				+ ", cdescription=" + cdescription + "]";
	}
	
	
	
	
	
	
}
