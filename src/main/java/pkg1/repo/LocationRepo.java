package pkg1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.entity.LocationEntity;

public interface LocationRepo extends JpaRepository<LocationEntity, Long> {
}
