package com.cg.beans;

import java.time.LocalDateTime;

public class Account {
public Account(){
	
}

public String getCustomer_name() {
	return customer_name;
}
public void setCustomer_name(String customer_name) {
	this.customer_name = customer_name;
}
public String getMobile_no() {
	return mobile_no;
}
public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}
public String getEmail_id() {
	return email_id;
}
public void setEmail_id(String email_id) {
	this.email_id = email_id;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}

public Account(String customer_name, String mobile_no, String email_id,
		double balance,LocalDateTime date) {
	super();
	this.customer_name = customer_name;
	this.mobile_no = mobile_no;
	this.email_id = email_id;
	this.balance = balance;
	this.date=date;
}
private String customer_name;
private String mobile_no;
private String email_id;
private double balance;
LocalDateTime date;
public LocalDateTime getDate() {
	return date;
}
public void setDate(LocalDateTime date) {
	this.date = date;
}
}