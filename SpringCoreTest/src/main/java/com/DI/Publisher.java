package com.DI;

import java.util.List;

public class Publisher 
{
	private int pid;
	private String pname;
	private String pcity;
	private List<String> phone;
	
	
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPcity() {
		return pcity;
	}
	public void setPcity(String pcity) {
		this.pcity = pcity;
	}
	@Override
	public String toString() {
		return "Publisher [pid=" + pid + ", pname=" + pname + ", pcity=" + pcity + ", phone=" + phone + "]";
	}
	
	
	
}
