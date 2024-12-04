package pkg1.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import pkg1.entity.AuthSEntity;

public interface AuthSRepo extends JpaRepository<AuthSEntity, Long> {
}
