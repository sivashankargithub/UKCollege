package pkg1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.entity.StudentRoomsEntity;

public interface StudentRoomsRepo extends JpaRepository<StudentRoomsEntity, Long>{

}
