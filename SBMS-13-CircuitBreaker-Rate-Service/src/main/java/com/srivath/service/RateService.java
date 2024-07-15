package com.srivath.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.srivath.binding.Rate;

@Service
public class RateService {

	private Map<String, Rate> map = new HashMap<>();

	public RateService() {
		System.out.println("RateService :: Constructor");
		
		map.put("PERSONAL", new Rate("1", "PERSONAL", 12.0));
		map.put("HOME", new Rate("2", "HOME", 16.5));
		map.put("EDUCATION", new Rate("3", "EDUCATION", 8.2));
		map.put("GOLD", new Rate("4", "GOLD", 11.0));
		map.put("VEHICLE", new Rate("5", "VEHICLE", 10.0));
	}

	public Rate getRate(String loanType) {
		if(map.containsKey(loanType)) {
			return map.get(loanType);
		}
		else {
			throw new RuntimeException("Please provide valid LoanType");
		}
	}
}
