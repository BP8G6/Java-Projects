package com.bellinfo.batch2.day7;

public class StringBuildeBUff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str ="BALA";
		//str.concat("KRISHNA");
		System.out.println(str.concat("KRISHNA"));
		
		StringBuilder sb = new StringBuilder();
		//sb.append("BALA");
		System.out.println(sb.append("BALA"));
		
		StringBuffer sbuf = new StringBuffer();
		//sbuf.append("KRISHNA");
		System.out.println(sbuf.append("KRISHNA"));
	}

}
