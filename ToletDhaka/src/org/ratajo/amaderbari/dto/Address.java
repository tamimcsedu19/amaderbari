package org.ratajo.amaderbari.dto;

import java.util.List;


public abstract class Address {
	List<addressInfo> addrses;
}

interface addressInfo
{
	String getType();
	String getInfo();
}


class sector implements addressInfo
{
	String sec;
	sector()
	{
		this.sec = "7";
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return sec;
	}
	
}

class city implements addressInfo
{
	String mohollaName;
	city()
	{
		this.mohollaName = "new Polton";
	}
	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return mohollaName;
	}
	
}