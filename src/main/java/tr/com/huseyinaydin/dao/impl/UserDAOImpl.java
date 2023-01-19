package tr.com.huseyinaydin.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tr.com.huseyinaydin.dao.UserDAO;
import tr.com.huseyinaydin.entity.User;

/**
 * 
 @author Huseyin_Aydin
 @since 1994
 @category Spring Hibernate Configuration
 * 
 */

@Transactional
@Repository
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAll() {
		return getCurrentSession().createCriteria(User.class).list();
	}

	@Override
	public User findOne(Integer id) {
		return (User) getCurrentSession().get(User.class, id);
	}
	
	@Override
	public void create(User user) {
		getCurrentSession().save(user);
	}

	@Override
	public void delete(User user) {
		getCurrentSession().delete(user);
	}

	@Override
	public void update(User user) {
		getCurrentSession().update(user);
	}
	
	private Session getCurrentSession() {
		 return sessionFactory.getCurrentSession();
	}
}
