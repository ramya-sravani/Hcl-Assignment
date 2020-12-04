package com.bankapp.model.service;

import java.util.List;
import java.util.Random;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bankapp.model.dao.Account;
import com.bankapp.model.dao.AccountDao;
import com.bankapp.model.dao.AccountStatus;
import com.bankapp.model.dao.TransactionEntry;
import com.bankapp.model.dao.TransactionEntryDao;
import com.bankapp.model.dao.TxType;
import com.bankapp.model.dao.User;
import com.bankapp.model.service.aspects.Loggable;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService{

	private AccountDao accountDao;
	public TransactionEntryDao transactionEntryDao;
	
	@Autowired
	public AccountServiceImpl(AccountDao accountDao, TransactionEntryDao transactionEntryDao) {
		this.accountDao = accountDao;
		this.transactionEntryDao = transactionEntryDao;
	}

	@Override
	public List<Account> getAllAccounts() {
		return accountDao.getAllAccounts();
	}

	@Loggable
	@Override
	public void deposit(int accountId, double amount) {
		Account account = accountDao.getAccountById(accountId);
		account.setBalance(account.getBalance() + amount);
		accountDao.updateAccount(account);
		account.setTransactionEntry(transactionEntryDao.getTransactionsById(accountId));
		
		TransactionEntry entry = new TransactionEntry("Deposited to " + accountId , amount, TxType.DEPOSIT);
		account.getTransactionEntry().add(entry);
		accountDao.updateAccount(account);
		
//		transactionEntryService.addTransaction("deposit to " + accountId , amount, TxType.DEPOSIT);
//		account.setTransactionEntry(Arrays.asList(transactionEntryDao.addTransaction("deposit to " + accountId , amount, TxType.WITHDRAW)));
		
	}

	@Loggable
	@Override
	public void withdraw(int accountId, double amount) {
		Account account = accountDao.getAccountById(accountId);
		account.setBalance(account.getBalance() - amount);
		accountDao.updateAccount(account);
		
		TransactionEntry entry = new TransactionEntry("Withdraw from " + accountId , amount, TxType.WITHDRAW);
		account.getTransactionEntry().add(entry);
		accountDao.updateAccount(account);
	}
	
	@Loggable
	@Override
	public void transfer(int fromAccountId, int toAccountId, double amount) {
		Account fromAccount = accountDao.getAccountById(fromAccountId);
		Account toAccount = accountDao.getAccountById(toAccountId);
		
		fromAccount.setBalance(fromAccount.getBalance() - amount);
		toAccount.setBalance(toAccount.getBalance() + amount);
		accountDao.updateAccount(fromAccount);
		accountDao.updateAccount(toAccount);
		
		TransactionEntry entryFrom = new TransactionEntry("Transferred from account " + fromAccountId + " to account " + toAccountId , amount, TxType.TRANSFER);
		TransactionEntry entryTo = new TransactionEntry("Credited to your account with account number " + toAccountId + " from account number " + fromAccountId , amount, TxType.TRANSFER);
		
		fromAccount.getTransactionEntry().add(entryFrom);
		toAccount.getTransactionEntry().add(entryTo);
		accountDao.updateAccount(fromAccount);
		accountDao.updateAccount(toAccount);
		
	}

	@Override
	public Account updateAccount(Account account) {
		Account accountToBeUpdated = accountDao.getAccountById(account.getAccountId());
		accountToBeUpdated.setEmail(account.getEmail());
		accountToBeUpdated.setPhone(account.getPhone());
		accountToBeUpdated.setAddress(account.getAddress());
		accountDao.updateAccount(accountToBeUpdated);
		
		return accountToBeUpdated;
	}

	@Override
	public Account deleteAccount(int accountId) {
		return accountDao.deleteAccount(accountId);
	}

	@Override
	public Account getAccountById(int accountId) {
		return accountDao.getAccountById(accountId);
	}
	

	@Override
	public Account addAccount(Account account) {
		String accountNumber = "HCL" + "976543" + accountDao.getAllAccounts().size();
		account.setAccountNumber(accountNumber);
		account.setAccountStatus(AccountStatus.Activate);
		System.out.println(account + "--------------------service");
		return accountDao.addAccount(account);
	}

	@Override
	public boolean isCustomerExist(String username) {
		boolean isValidUser = false;
		List<Account> accounts = accountDao.getAllAccounts();
		for(Account account : accounts) {
			if(account.getName().equals(username)) {
				isValidUser = true;
			}
		}
		return isValidUser;
	}

	@Override
	public Account getAccount(String username) {
		return accountDao.getAccount(username);
	}

	
}