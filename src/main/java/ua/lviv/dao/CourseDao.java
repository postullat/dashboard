package ua.lviv.dao;

import java.util.List;
import ua.lviv.custom.model.Course;

public interface CourseDao {

	public void add(Course course);
	
	public List<Course> getAll();
	
	public Course getById(long id);
	
	public boolean update(Course oldCourse, Course newCourse);
	
	public boolean remove(Course course);
}
