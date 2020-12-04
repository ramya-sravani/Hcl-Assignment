package com.bankapp.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bankapp.model.dao.Account;
import com.bankapp.model.service.AccountService;
import com.bankapp.web.formbeans.LoginBean;

@Controller
public class CustomerLoginController {
	private AccountService accountService;
	
	@Autowired
	public CustomerLoginController(AccountService accountService) {
		this.accountService = accountService;
	}

	
	@GetMapping("customerlogin")
	public String customerLoginGet(ModelMap map) {
		map.addAttribute("customerBean", new LoginBean());
		return "customerlogin";
	}
	
	@PostMapping("customerlogin")
	public String customerLoginPost(@Valid @ModelAttribute("customerBean") LoginBean customerBean, BindingResult result, HttpServletRequest req) {
		if(result.hasErrors()) {
			return "customerlogin";
		} else {
			HttpSession session = req.getSession();
			String username = customerBean.getUsername();
			String password = customerBean.getPassword();
			
			if(accountService.isCustomerExist(username)) {
				Account account = accountService.getAccount(username);
			
				if(username.equals(account.getName()) && password.equals(account.getPasssword())) {
					session.setAttribute("account", account);
					System.out.println("=================login==================");
					System.out.println(session.getAttribute("account"));
					return "redirect:/customerhome";
				} else {
					req.setAttribute("message", "Incorrect username or password");
					return "customerlogin";
				}
			} else {
				req.setAttribute("message", "No account for the provided username and password");
				return "customerlogin";
			}
		}
	}
	
	
	@GetMapping("customerlogout")
	public String logout(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		System.out.println("==================logout===========");
		System.out.println(session.getAttribute("account"));
		if(session != null) {
			session.invalidate();
		}
		return "redirect:/";
	}
}