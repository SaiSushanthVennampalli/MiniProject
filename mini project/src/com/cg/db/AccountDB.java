package com.cg.db;

import java.time.LocalDateTime;
import java.util.HashMap;

import com.cg.beans.Account;

public class AccountDB {
private static HashMap<String, Account> accountDb=new HashMap<String, Account>();

public static HashMap<String, Account> getAccountDb() {
	return accountDb;
}
static{
	accountDb.put("9999999999",new Account("9999999999","Ramesh","ramesh@gmail.com",1000,LocalDateTime.now()));
	accountDb.put("8888888888",new Account("8888888888","Ram","ram@gmail.com",3000,LocalDateTime.now()));
	accountDb.put("7777777777",new Account("7777777777","Suresh","suresh@gmail.com",5000,LocalDateTime.now()));
	accountDb.put("6666666666",new Account("6666666666","Harish","harish@gmail.com",10000,LocalDateTime.now()));
	accountDb.put("5555555555",new Account("5555555555","mary","mary@gmail.com",20000,LocalDateTime.now()));
}
}
