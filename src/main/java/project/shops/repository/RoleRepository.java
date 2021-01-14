package project.shops.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import project.shops.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
