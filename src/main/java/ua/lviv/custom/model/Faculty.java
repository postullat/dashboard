package ua.lviv.custom.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Faculty {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long facultyId;
	
	private String firstName;
	private String lastName;
	private Date hireDate;
	
	@ManyToOne
	@JoinColumn(name="departmentId", nullable=false)
	private Department department;
	
	@ManyToMany
	@JoinTable(name="faculty_has_course", 
	joinColumns={@JoinColumn(name="Faculty_FacultyId")}, 
	inverseJoinColumns={@JoinColumn(name="Course_CourseId")})
	private Set<Course> courses;
	
	public long getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(long facultyId) {
		this.facultyId = facultyId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}
