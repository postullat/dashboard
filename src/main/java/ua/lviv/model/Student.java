package ua.lviv.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "student", catalog = "univcontoso")
public class Student implements java.io.Serializable {

    private int studentId;
    private String lastName;
    private String firstName;
    private Date enrollmentDate;
    private Set<Enrollment> enrollments = new HashSet<>(0);

    public Student() {
    }

    public Student(String lastName, String firstName, Date enrollmentDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.enrollmentDate = enrollmentDate;
    }

    public Student(String lastName, String firstName, Date enrollmentDate,
                   Set<Enrollment> enrollments) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.enrollmentDate = enrollmentDate;
        this.enrollments = enrollments;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "StudentId", unique = true, nullable = false)
    public int getStudentId() {
        return this.studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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
    @Column(name = "EnrollmentDate", nullable = false, length = 19)
    public Date getEnrollmentDate() {
        return this.enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "student")
    public Set<Enrollment> getEnrollments() {
        return this.enrollments;
    }

    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

}
