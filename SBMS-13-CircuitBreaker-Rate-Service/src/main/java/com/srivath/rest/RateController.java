package com.srivath.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.srivath.binding.Rate;
import com.srivath.service.RateService;

@RestController
public class RateController {
	
	@Autowired
	private RateService rateService;

	@GetMapping("/rate")
	public Rate getRateByLoanType(@RequestParam("type") String loanType) {
		return rateService.getRate(loanType);
	}
}
