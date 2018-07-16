package com.cg.dao;

import java.util.HashMap;

import com.cg.beans.Account;
import com.cg.db.AccountDB;
import com.cg.exception.AccountException;


public class AccountDaoImpl implements AccountDao{
	static HashMap<String, Account> accountEntry=AccountDB.getAccountDb();
	@Override
	public String createAccount(Account account) throws AccountException {
		accountEntry.put(account.getMobile_no(), account);
		return account.getMobile_no();
	}

	@Override
	public double showBalance(String mobileNo) throws AccountException {
Account acc=accountEntry.get(mobileNo);
if(acc==null){
	throw new AccountException("the mobile number is not there in the data base");

}
		return acc.getBalance();
	}

	@Override
	public Account deposit(String mobileNo) throws AccountException {
		Account acc=accountEntry.get(mobileNo);
		if(acc==null){
			throw new AccountException("the mobile number is not there in the data base");

		}
		return acc;
	}

	@Override
	public Account withdraw(String mobileNo) throws AccountException {
		Account acc=accountEntry.get(mobileNo);
		if(acc==null){
			throw new AccountException("the mobile number is not there in the data base");
		}
		return acc;
	}

	@Override
	public Account printTransactionDetails(String mobileNo)
			throws AccountException {
		Account acc=accountEntry.get(mobileNo);
		if(acc==null){
			throw new AccountException("the mobile number is not there in the data base");

		}
		return acc;
	}

/*	@Override
	public boolean fundTransfer(String sourceMobileNo, String destMobileNo,
			double transferAmount) throws AccountException {
		Account acc1=accountEntry.get(sourceMobileNo);
		Account acc2=accountEntry.get(destMobileNo);
		if(acc1==null){
			throw new AccountException("the mobile number is not there in the data base");
		}
		else if(acc2==null)
		{
			throw new AccountException("the mobile number is not there in the data base");
		}
		else
		{
		return true;
		}
	}*/


}
