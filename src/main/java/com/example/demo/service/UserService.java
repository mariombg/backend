package com.example.demo.service;

import java.util.List;

import com.example.demo.model.User;

public interface UserService {
	//Guarda un user
	User save(User user);
	//Recupera la lista de usuarios
	List<User> findAll();
	//Elimina un user con el id pasado
	void deleteUser(Long id);
}
