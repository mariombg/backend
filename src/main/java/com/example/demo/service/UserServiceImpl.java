package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	protected UserRepository UserRepository;

	@Override
	public User save(User user) {
		// TODO Auto-generated method stub
		return this.UserRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return this.UserRepository.findAll();
	}
}
