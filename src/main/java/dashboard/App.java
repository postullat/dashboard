package dashboard;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ua.lviv.custom.model.Course;
import ua.lviv.custom.model.Department;
import ua.lviv.custom.model.Enrollment;
import ua.lviv.custom.model.Faculty;
import ua.lviv.custom.model.Student;

public class App {
    public static void main(String []args) {
        Configuration configuration = new Configuration();
        SessionFactory factory = configuration.configure().buildSessionFactory();
        Session session = factory.openSession();
        session.beginTransaction();
        
        List<Department> departaments = session.createCriteria(Department.class).list();
        List<Course> courses = session.createCriteria(Course.class).list();
        List<Enrollment> enrollments = session.createCriteria(Enrollment.class).list();
        List<Faculty> faculties = session.createCriteria(Faculty.class).list();
        List<Student> students = session.createCriteria(Student.class).list();
        
        System.out.println("\n------ Departaments -------");
        for(Department departament : departaments){
            System.out.println(departament.getDepartmentName());
        }
        System.out.println("\n------ Courses -------");
        for(Course course : courses){
            System.out.println(course.getCourseTitle());
        }
        System.out.println("\n------ Enrollments -------");
        for(Enrollment enrollemnt : enrollments){
            System.out.println(enrollemnt.getEnrollmentId()+":"+enrollemnt.getGrade());
        }
        System.out.println("\n------ Faculties -------");
        for(Faculty faculty : faculties){
            System.out.println(faculty.getFirstName()+" "+faculty.getLastName()+" "+faculty.getHireDate());
        }
        System.out.println("\n------ Students -------");
        for(Student student : students){
            System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getEnrollemntDate());
        }
        
        System.out.println("\n------ Many to One Relation expiriment #1-------");
        Faculty faculty = session.load(Faculty.class, 14L);
        
        System.out.println(faculty.getFirstName()+" "+faculty.getDepartment().getDepartmentName());
        
        System.out.println("\n------ Many to One Relation expiriment #2-------");
        Student student = session.load(Student.class, 18L);
        
        System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getEnrollments());
        
        System.out.println("\n------ Many to One Relation expiriment #3-------");
        Course course = session.load(Course.class, 19L);
        
        System.out.println(course.getCourseTitle()+" "+course.getEnrollments());
        
        System.out.println("\n------ Many to One Relation expiriment #4-------");
        Department department = session.load(Department.class, 6L);
        
        System.out.println(department.getDepartmentName()+" "+department.getCourses().size());
         
        session.getTransaction().commit();
        session.close();
    }
}
