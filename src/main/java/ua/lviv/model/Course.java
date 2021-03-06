package ua.lviv.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "course", catalog = "univcontoso")
public class Course implements java.io.Serializable {
    private int courseId;
    private Department department;
    private String courseTitle;
    private String credits;
    private Set<Faculty> faculties = new HashSet<>(0);
    private Set<Enrollment> enrollments = new HashSet<>(0);
    private Set<Faculty> faculties_1 = new HashSet<>(0);

    public Course() {
    }

    public Course(Department department, String courseTitle, String credits) {
        this.department = department;
        this.courseTitle = courseTitle;
        this.credits = credits;
    }

    public Course(Department department, String courseTitle, String credits,
                  Set<Faculty> faculties, Set<Enrollment> enrollments,
                  Set<Faculty> faculties_1) {
        this.department = department;
        this.courseTitle = courseTitle;
        this.credits = credits;
        this.faculties = faculties;
        this.enrollments = enrollments;
        this.faculties_1 = faculties_1;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "CourseId", unique = true, nullable = false)
    public int getCourseId() {
        return this.courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DepartmentId", nullable = false)
    public Department getDepartment() {
        return this.department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Column(name = "CourseTitle", nullable = false, length = 45)
    public String getCourseTitle() {
        return this.courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    @Column(name = "Credits", nullable = false, length = 2)
    public String getCredits() {
        return this.credits;
    }

    public void setCredits(String credits) {
        this.credits = credits;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "course_has_faculty", catalog = "univcontoso", joinColumns = {@JoinColumn(name = "Course_CourseId", nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "Faculty_FacultyId", nullable = false, updatable = false)})
    public Set<Faculty> getFaculties() {
        return this.faculties;
    }

    public void setFaculties(Set<Faculty> faculties) {
        this.faculties = faculties;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "course")
    public Set<Enrollment> getEnrollments() {
        return this.enrollments;
    }

    public void setEnrollments(Set<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "faculty_has_course", catalog = "univcontoso", joinColumns = {@JoinColumn(name = "Course_CourseId", nullable = false, updatable = false)}, inverseJoinColumns = {@JoinColumn(name = "Faculty_FacultyId", nullable = false, updatable = false)})
    public Set<Faculty> getFaculties_1() {
        return this.faculties_1;
    }

    public void setFaculties_1(Set<Faculty> faculties_1) {
        this.faculties_1 = faculties_1;
    }

}
