package pkg1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity, Long> {

}
