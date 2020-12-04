package com.bankapp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bankapp.model.dao.TransactionEntry;
import com.bankapp.model.service.AccountService;
import com.bankapp.model.service.TransactionEntryService;

@Controller
public class CustomerController {
	private TransactionEntryService transactionEntryService;
	
	@Autowired
	public CustomerController(TransactionEntryService transactionEntryService) {
		this.transactionEntryService = transactionEntryService;
	}
	
	@GetMapping("customerhome")
	public String customerHome() {
		return "customerhome";
	}
	
	@GetMapping("transactionhistory")
	public ModelAndView getTransactionHistoryByCustomer(HttpServletRequest request, ModelAndView mv) {
		int accountId = Integer.parseInt(request.getParameter("id"));
		System.out.println("transaction id--------------------------------------------- "+ accountId);
		List<TransactionEntry> transactionHistory = transactionEntryService.getTransactionsById(accountId);
		mv.setViewName("transactionhistory");
		mv.addObject("transactionHistory", transactionHistory);
		return mv;
	}
}