package com.huangpan.serviceImlp;

import org.springframework.stereotype.Service;

import com.huangpan.service.UserService;

@Service
public class UserServiceImpl  implements UserService{

	@Override
	public void get() {
		System.out.println("...get...");
		
	}

}
