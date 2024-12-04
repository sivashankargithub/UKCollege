package pkg1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.entity.MTeamEntity;

public interface MTeamRepo extends JpaRepository<MTeamEntity, Long> {
}
