package ua.lviv.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "department", catalog = "univcontoso")
public class Department implements java.io.Serializable {

	private int departmentId;
	private String departmentName;
	private Set<Faculty> faculties = new HashSet<Faculty>(0);
	private Set<Course> courses = new HashSet<Course>(0);

	public Department() {
	}

	public Department(String departmentName) {
		this.departmentName = departmentName;
	}

	public Department(String departmentName, Set<Faculty> faculties,
					  Set<Course> courses) {
		this.departmentName = departmentName;
		this.faculties = faculties;
		this.courses = courses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "DepartmentId", unique = true, nullable = false)
	public int getDepartmentId() {
		return this.departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	@Column(name = "DepartmentName", nullable = false, length = 45)
	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Faculty> getFaculties() {
		return this.faculties;
	}

	public void setFaculties(Set<Faculty> faculties) {
		this.faculties = faculties;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "department")
	public Set<Course> getCourses() {
		return this.courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

}