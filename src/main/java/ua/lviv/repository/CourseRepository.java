package ua.lviv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
