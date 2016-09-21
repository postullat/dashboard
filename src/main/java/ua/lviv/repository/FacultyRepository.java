package ua.lviv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.model.Faculty;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
