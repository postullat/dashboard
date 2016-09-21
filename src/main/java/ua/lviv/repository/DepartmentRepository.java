package ua.lviv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.model.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
