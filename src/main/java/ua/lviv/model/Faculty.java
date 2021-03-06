package ua.lviv.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "faculty", catalog = "univcontoso")
public class Faculty implements java.io.Serializable {

	private int facultyId;
	private Department department;
	private String lastName;
	private String firstName;
	private Date hireDate;
	private Set<Course> courses = new HashSet<>(0);
	private Set<Course> courses_1 = new HashSet<>(0);

	public Faculty() {
	}

	public Faculty(Department department, String lastName, String firstName,
				   Date hireDate) {
		this.department = department;
		this.lastName = lastName;
		this.firstName = firstName;
		this.hireDate = hireDate;
	}

	public Faculty(Department department, String lastName, String firstName,
				   Date hireDate, Set<Course> courses, Set<Course> courses_1) {
		this.department = department;
		this.lastName = lastName;
		this.firstName = firstName;
		this.hireDate = hireDate;
		this.courses = courses;
		this.courses_1 = courses_1;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "FacultyId", unique = true, nullable = false)
	public int getFacultyId() {
		return this.facultyId;
	}

	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DepartmentId", nullable = false)
	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Column(name = "LastName", nullable = false, length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "FirstName", nullable = false, length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HireDate", nullable = false, length = 19)
	public Date getHireDate() {
		return this.hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "course_has_faculty", catalog = "univcontoso", joinColumns = { @JoinColumn(name = "Faculty_FacultyId", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Course_CourseId", nullable = false, updatable = false) })
	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "faculty_has_course", catalog = "univcontoso", joinColumns = { @JoinColumn(name = "Faculty_FacultyId", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "Course_CourseId", nullable = false, updatable = false) })
	public Set<Course> getCourses_1() {
		return this.courses_1;
	}

	public void setCourses_1(Set<Course> courses_1) {
		this.courses_1 = courses_1;
	}

}

