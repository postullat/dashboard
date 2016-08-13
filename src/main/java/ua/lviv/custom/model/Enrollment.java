package ua.lviv.custom.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Enrollment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long enrollmentId;
	
	private String grade;
	
	@ManyToOne
	@JoinColumn(name="studentId")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="courseId")
	private Course course;
	
	public long getEnrollmentId() {
		return enrollmentId;
	}
	public void setEnrollmentId(long enrollmentId) {
		this.enrollmentId = enrollmentId;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	
}
