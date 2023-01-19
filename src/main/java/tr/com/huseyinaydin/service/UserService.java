package tr.com.huseyinaydin.service;

import java.util.List;

import tr.com.huseyinaydin.entity.User;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Hibernate Configuration
 * 
 */

public interface UserService {

	List<User> findAll();

	User findOne(Integer id);
	
	void create(User user);

	void delete(User user);

	void update(User user);
}
