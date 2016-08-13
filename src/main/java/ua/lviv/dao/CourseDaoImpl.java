package ua.lviv.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.custom.model.Course;

@Repository
@Transactional
public class CourseDaoImpl implements CourseDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void add(Course course) {
		// TODO Auto-generated method stub
		
	}

	public List<Course> getAll() {

		Session session = sessionFactory.openSession();
		List list = session.createQuery("from Course").list();
		return list;
	}

	public Course getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean update(Course oldCourse, Course newCourse) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean remove(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
}
