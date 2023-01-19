package tr.com.huseyinaydin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.huseyinaydin.dao.UserDAO;
import tr.com.huseyinaydin.entity.User;
import tr.com.huseyinaydin.service.UserService;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Hibernate Configuration
 * 
 */

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public List<User> findAll() {
		return userDAO.findAll();
	}

	@Override
	public User findOne(Integer id) {
		return userDAO.findOne(id);
	}
	
	@Override
	public void create(User user) {
		userDAO.create(user);
	}

	@Override
	public void delete(User user) {
		userDAO.delete(user);
	}

	@Override
	public void update(User user) {
		userDAO.update(user);
	}
}
