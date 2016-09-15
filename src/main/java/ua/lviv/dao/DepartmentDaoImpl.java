package ua.lviv.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.lviv.custom.model.Department;

@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Department> getAll() {
		Session session = sessionFactory.openSession();
		List list = session.createQuery("from Department").list();
		return list;
	}

}
