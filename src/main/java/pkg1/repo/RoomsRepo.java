package pkg1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.entity.RoomsEntity;

public interface RoomsRepo extends JpaRepository<RoomsEntity, Long> {

}
