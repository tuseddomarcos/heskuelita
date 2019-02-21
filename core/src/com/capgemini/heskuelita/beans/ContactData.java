package com.capgemini.heskuelita.beans;

public class ContactData {
	
	private String phone;
	private String addr_st;
	private String addr_num;
	private String addr_zipc;
	
	
public ContactData(String pPhone, String pAddr_st, String pAddr_num, String pAddr_zipc) {

		
		this.phone=pPhone;
		this.addr_st=pAddr_st;
		this.addr_num=pAddr_num;	
		this.addr_zipc=pAddr_zipc;
	
		
	}


public String getPhone() {
	return phone;
}


public void setPhone(String phone) {
	this.phone = phone;
}


public String getAddr_st() {
	return addr_st;
}


public void setAddr_st(String addr_st) {
	this.addr_st = addr_st;
}


public String getAddr_num() {
	return addr_num;
}


public void setAddr_num(String addr_num) {
	this.addr_num = addr_num;
}


public String getAddr_zipc() {
	return addr_zipc;
}


public void setAddr_zipc(String addr_zipc) {
	this.addr_zipc = addr_zipc;
}



}
